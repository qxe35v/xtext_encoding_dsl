/*
 * generated by Xtext 2.12.0
 */
grammar InternalEncodingLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.EncodingLangGrammarAccess;

}

@parser::members {

 	private EncodingLangGrammarAccess grammarAccess;

    public InternalEncodingLangParser(TokenStream input, EncodingLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EncodingLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsSourceMappingParserRuleCall_0());
			}
			lv_elements_0_0=ruleSourceMapping
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.example.EncodingLang.SourceMapping");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleSourceMapping
entryRuleSourceMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceMappingRule()); }
	iv_ruleSourceMapping=ruleSourceMapping
	{ $current=$iv_ruleSourceMapping.current; }
	EOF;

// Rule SourceMapping
ruleSourceMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='source'
		{
			newLeafNode(otherlv_0, grammarAccess.getSourceMappingAccess().getSourceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSourceMappingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceMappingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSourceMappingAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSourceMappingAccess().getAliasesAliasParserRuleCall_3_0());
				}
				lv_aliases_3_0=ruleAlias
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSourceMappingRule());
					}
					add(
						$current,
						"aliases",
						lv_aliases_3_0,
						"org.xtext.example.EncodingLang.Alias");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSourceMappingAccess().getMappingsMappingParserRuleCall_4_0());
				}
				lv_mappings_4_0=ruleMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSourceMappingRule());
					}
					add(
						$current,
						"mappings",
						lv_mappings_4_0,
						"org.xtext.example.EncodingLang.Mapping");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSourceMappingAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	iv_ruleMapping=ruleMapping
	{ $current=$iv_ruleMapping.current; }
	EOF;

// Rule Mapping
ruleMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMappingAccess().getExactMappingParserRuleCall_0());
		}
		this_ExactMapping_0=ruleExactMapping
		{
			$current = $this_ExactMapping_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMappingAccess().getTransliterationMappingParserRuleCall_1());
		}
		this_TransliterationMapping_1=ruleTransliterationMapping
		{
			$current = $this_TransliterationMapping_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExactMapping
entryRuleExactMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExactMappingRule()); }
	iv_ruleExactMapping=ruleExactMapping
	{ $current=$iv_ruleExactMapping.current; }
	EOF;

// Rule ExactMapping
ruleExactMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_from_0_0=RULE_INPUTCHAR
				{
					newLeafNode(lv_from_0_0, grammarAccess.getExactMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExactMappingRule());
					}
					setWithLastConsumed(
						$current,
						"from",
						lv_from_0_0,
						"org.xtext.example.EncodingLang.INPUTCHAR");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getExactMappingAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_to_2_0=RULE_INPUTCHAR
				{
					newLeafNode(lv_to_2_0, grammarAccess.getExactMappingAccess().getToINPUTCHARTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExactMappingRule());
					}
					setWithLastConsumed(
						$current,
						"to",
						lv_to_2_0,
						"org.xtext.example.EncodingLang.INPUTCHAR");
				}
			)
		)
	)
;

// Entry rule entryRuleTransliterationMapping
entryRuleTransliterationMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransliterationMappingRule()); }
	iv_ruleTransliterationMapping=ruleTransliterationMapping
	{ $current=$iv_ruleTransliterationMapping.current; }
	EOF;

// Rule TransliterationMapping
ruleTransliterationMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_from_0_0=RULE_INPUTCHAR
				{
					newLeafNode(lv_from_0_0, grammarAccess.getTransliterationMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransliterationMappingRule());
					}
					setWithLastConsumed(
						$current,
						"from",
						lv_from_0_0,
						"org.xtext.example.EncodingLang.INPUTCHAR");
				}
			)
		)
		otherlv_1='~'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransliterationMappingAccess().getTildeKeyword_1());
		}
		(
			(
				lv_to_2_0=RULE_INPUTCHAR
				{
					newLeafNode(lv_to_2_0, grammarAccess.getTransliterationMappingAccess().getToINPUTCHARTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransliterationMappingRule());
					}
					setWithLastConsumed(
						$current,
						"to",
						lv_to_2_0,
						"org.xtext.example.EncodingLang.INPUTCHAR");
				}
			)
		)
	)
;

// Entry rule entryRuleAlias
entryRuleAlias returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAliasRule()); }
	iv_ruleAlias=ruleAlias
	{ $current=$iv_ruleAlias.current; }
	EOF;

// Rule Alias
ruleAlias returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='alias'
		{
			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAliasRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_INPUTCHAR : '0x' (('0'..'9'|'a'..'f') ('0'..'9'|'a'..'f'))+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
