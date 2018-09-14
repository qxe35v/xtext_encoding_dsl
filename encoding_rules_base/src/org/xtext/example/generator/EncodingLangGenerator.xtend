/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.encodingLang.SourceMapping
import org.xtext.example.encodingLang.Conversion
import org.xtext.example.generator.HexToDec
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EncodingLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		//TODO (xtend-gen, bin) <- .gitignore
		//TODO doksi eleje
		fsa.generateFile(resource.calcFileName+"_gen.txt", resource.generate )
		fsa.generateFile(resource.calcFileName+"_gen_header.txt", resource.generateHeader )
	}
	
	def generateHeader(Resource r)'''
	//Generated by HIM
	#ifndef �r.calcFileName.toUpperCase�_GEN_H
	#define �r.calcFileName.toUpperCase�_GEN_H
	
	#include <stdint.h>
	#include <assert.h>
	#include "hashtable.h"
	
	hashtable* aliases_hashbtable();
	hashtable* unit_lenghts();
	hashtable* mappings();
	
	#endif
	'''
	
	def String calcFileName(Resource r){
		var String s = r.toString
		var int i=s.length-1
		while( s.charAt(i).equals('/'.charAt(0))==false ){
			i--;
		}
		i++;
		return s.substring(i,s.length-6);
	}
	
	def generate(Resource r) '''
	//Generated by HIM
	#include "�r.calcFileName�.h"
	
	�r.generateAliases�
	
	�r.generateUnitLengths�
	
	�r.generateMappings�
	'''
	def generateAliases(Resource r)'''
		hashtable* aliases_hashbtable(){
			hashtable* aliases = hashtable_init(256, sizeof(char**), sizeof(char**));
			
			�FOR s: r.allContents.toIterable.filter(SourceMapping)�
			//aliases for �s.name�
			const char* encoding_�s.name� = "�s.name�"; 
			hashtable_put(aliases,&encoding_�s.name�,&encoding_�s.name�);
			
			�FOR a: s.aliases�
			//put to �s.name� alias �a.name�
			const char* alias_�a.name�_for_�s.name� = "�a.name�";
			hashtable_put(aliases,&encoding_�s.name�,&alias_�a.name�_for_�s.name�);
			
			�ENDFOR�
			
			�ENDFOR�
			return aliases;
			}
	'''
	
	def generateUnitLengths(Resource r)'''
		hashtable* unit_lenghts(){
			hashtable* unit_lengths = hashtable_init(128, sizeof(char**), sizeof(uint8_t*));
			
			�FOR s: r.allContents.toIterable.filter(SourceMapping)�
			�IF !s.conversions.isEmpty && !s.conversions.get(0).mappings.isEmpty�
			//unit legnths for �s.name�
			const char* encoding_�s.name� = "�s.name�";
			uint8_t length_�s.name� = �(s.conversions.get(0).mappings.get(0).from.length-2)/2�;
			hashtable_put(unit_lengths, &encoding_�s.name�, &length_�s.name�);
			
			�FOR c:s.conversions�
			//unit length for �c.name�
			const char* encoding_�s.name�_to_�c.name� = "�c.name�";
			uint8_t length_�s.name�_to_�c.name� = �(c.mappings.get(0).to.length-2)/2�;
			hashtable_put(unit_lengths, &encoding_�s.name�_to_�c.name�, &length_�s.name�_to_�c.name�);
			
			�ENDFOR�
			
			�ENDIF�
			�ENDFOR�
			return unit_lengths;
			}
	'''
	
	def generateMappings(Resource r)'''
		hashtable* mappings(){
			// hashtable for everything
			hashtable* mappings = hashtable_init(128, sizeof(char**), sizeof(hashtable*));
			
			�FOR s:r.allContents.toIterable.filter(SourceMapping)�
			// hashtable for �s.name�
			const char* encoding_�s.name� = "�s.name�";
			hashtable* mappings_from_�s.name� = hashtable_init(128, sizeof(char**), sizeof(hashtable*));
			hashtable_put(mappings, &encoding_�s.name�, mappings_from_�s.name�);
			
			�FOR c:s.conversions�
			�IF !c.mappings.isEmpty�
			// hash for �s.name�->�c.name�
			const char* encoding_�s.name�_to_�c.name� = "�c.name�";
			hashtable* mappings_from_�s.name�_to_�c.name� = hashtable_init(
				�getLengthOfHash(c.mappings.get(0).from.length-2)�,
				sizeof(�getIntType(c.mappings.get(0).from.length-2)�*),
				sizeof(�getIntType(c.mappings.get(0).to.length-2)�*));
			hashtable_put(mappings_from_�s.name�, &encoding_�s.name�_to_�c.name�, mappings_from_�s.name�_to_�c.name�);
			
			//filling in �s.name�->�c.name�
			�getIntType(c.mappings.get(0).from.length-2)� from_value_�s.name�_to_�c.name�;
			�getIntType(c.mappings.get(0).to.length-2)� to_value_�s.name�_to_�c.name�;
			
			�FOR m:c.mappings�
			from_value_�s.name�_to_�c.name� = �HexToDec.hex2decimal(m.from)�;
			to_value_�s.name�_to_�c.name� = �HexToDec.hex2decimal(m.to)�;
			hashtable_put(
				mappings_from_�s.name�_to_�c.name�,
				&from_value_�s.name�_to_�c.name�,
				&to_value_�s.name�_to_�c.name�);
				
			�ENDFOR�
			
			�ENDIF�
			�ENDFOR�
			
			�ENDFOR�
			return mappings;
		}
	'''
	
	def String getIntType(int a){
		if(a==2) return "uint8_t";
		if(a==4) return "uint16_t";
		return "uint32_t";
	}
	
	def String getLengthOfHash(int a){
		if(a==2) return "512";
		if(a==4) return "31072";
		return "8589934592";
	}
	
}
