/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.encodingLang.Alias
import org.xtext.example.encodingLang.Mapping
import org.xtext.example.encodingLang.Model
import org.xtext.example.encodingLang.SourceMapping
import org.xtext.example.services.EncodingLangGrammarAccess

class EncodingLangFormatter extends AbstractFormatter2 {

	@Inject extension EncodingLangGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SourceMapping sourceMapping : model.getElements()) {
			sourceMapping.format;
		}
	}

	def dispatch void format(SourceMapping s, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		s.regionFor.keyword("source").prepend[newLine].append[oneSpace]
		s.regionFor.keyword("{").prepend[oneSpace].append[newLine]
		s.regionFor.keyword("}").append[newLine]
		for (Alias alias : s.getAliases()) {
			//alias.append[newLine].prepend[indent]
			//alias.prepend[indent]
			alias.regionFor.keyword("alias").prepend[indent].append[oneSpace]
		}
		for (Mapping mapping : s.getMappings()) {
			mapping.append[newLine].prepend[space = "\t"]
			//mapping.regionFor.keyword("")
		}
	}

	def dispatch void format(Alias a, extension IFormattableDocument document) {
	}

// TODO: implement for 
}