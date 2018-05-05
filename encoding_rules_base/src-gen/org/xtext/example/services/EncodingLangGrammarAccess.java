/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EncodingLangGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsSourceMappingParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=SourceMapping*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=SourceMapping*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//SourceMapping
		public RuleCall getElementsSourceMappingParserRuleCall_0() { return cElementsSourceMappingParserRuleCall_0; }
	}
	public class SourceMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.SourceMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAliasesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAliasesAliasParserRuleCall_3_0 = (RuleCall)cAliasesAssignment_3.eContents().get(0);
		private final Assignment cConversionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConversionsConversionParserRuleCall_4_0 = (RuleCall)cConversionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SourceMapping:
		//	"source" name=ID "{"
		//	aliases+=Alias*
		//	conversions+=Conversion*
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"source" name=ID "{" aliases+=Alias* conversions+=Conversion* "}"
		public Group getGroup() { return cGroup; }
		
		//"source"
		public Keyword getSourceKeyword_0() { return cSourceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//aliases+=Alias*
		public Assignment getAliasesAssignment_3() { return cAliasesAssignment_3; }
		
		//Alias
		public RuleCall getAliasesAliasParserRuleCall_3_0() { return cAliasesAliasParserRuleCall_3_0; }
		
		//conversions+=Conversion*
		public Assignment getConversionsAssignment_4() { return cConversionsAssignment_4; }
		
		//Conversion
		public RuleCall getConversionsConversionParserRuleCall_4_0() { return cConversionsConversionParserRuleCall_4_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ConversionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.Conversion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMappingsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMappingsMappingParserRuleCall_3_0 = (RuleCall)cMappingsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Conversion:
		//	"target" name=ID "{"
		//	mappings+=Mapping*
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"target" name=ID "{" mappings+=Mapping* "}"
		public Group getGroup() { return cGroup; }
		
		//"target"
		public Keyword getTargetKeyword_0() { return cTargetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//mappings+=Mapping*
		public Assignment getMappingsAssignment_3() { return cMappingsAssignment_3; }
		
		//Mapping
		public RuleCall getMappingsMappingParserRuleCall_3_0() { return cMappingsMappingParserRuleCall_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class MappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.Mapping");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExactMappingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTransliterationMappingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Mapping:
		//	ExactMapping | TransliterationMapping;
		@Override public ParserRule getRule() { return rule; }
		
		//ExactMapping | TransliterationMapping
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ExactMapping
		public RuleCall getExactMappingParserRuleCall_0() { return cExactMappingParserRuleCall_0; }
		
		//TransliterationMapping
		public RuleCall getTransliterationMappingParserRuleCall_1() { return cTransliterationMappingParserRuleCall_1; }
	}
	public class ExactMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.ExactMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFromINPUTCHARTerminalRuleCall_0_0 = (RuleCall)cFromAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cToINPUTCHARTerminalRuleCall_2_0 = (RuleCall)cToAssignment_2.eContents().get(0);
		
		//ExactMapping:
		//	from=INPUTCHAR "=" to=INPUTCHAR;
		@Override public ParserRule getRule() { return rule; }
		
		//from=INPUTCHAR "=" to=INPUTCHAR
		public Group getGroup() { return cGroup; }
		
		//from=INPUTCHAR
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }
		
		//INPUTCHAR
		public RuleCall getFromINPUTCHARTerminalRuleCall_0_0() { return cFromINPUTCHARTerminalRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//to=INPUTCHAR
		public Assignment getToAssignment_2() { return cToAssignment_2; }
		
		//INPUTCHAR
		public RuleCall getToINPUTCHARTerminalRuleCall_2_0() { return cToINPUTCHARTerminalRuleCall_2_0; }
	}
	public class TransliterationMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.TransliterationMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFromINPUTCHARTerminalRuleCall_0_0 = (RuleCall)cFromAssignment_0.eContents().get(0);
		private final Keyword cTildeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cToINPUTCHARTerminalRuleCall_2_0 = (RuleCall)cToAssignment_2.eContents().get(0);
		
		//TransliterationMapping:
		//	from=INPUTCHAR "~" to=INPUTCHAR;
		@Override public ParserRule getRule() { return rule; }
		
		//from=INPUTCHAR "~" to=INPUTCHAR
		public Group getGroup() { return cGroup; }
		
		//from=INPUTCHAR
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }
		
		//INPUTCHAR
		public RuleCall getFromINPUTCHARTerminalRuleCall_0_0() { return cFromINPUTCHARTerminalRuleCall_0_0; }
		
		//"~"
		public Keyword getTildeKeyword_1() { return cTildeKeyword_1; }
		
		//to=INPUTCHAR
		public Assignment getToAssignment_2() { return cToAssignment_2; }
		
		//INPUTCHAR
		public RuleCall getToINPUTCHARTerminalRuleCall_2_0() { return cToINPUTCHARTerminalRuleCall_2_0; }
	}
	public class AliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.Alias");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAliasKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Alias:
		//	"alias" name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"alias" name=ID
		public Group getGroup() { return cGroup; }
		
		//"alias"
		public Keyword getAliasKeyword_0() { return cAliasKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final SourceMappingElements pSourceMapping;
	private final ConversionElements pConversion;
	private final MappingElements pMapping;
	private final ExactMappingElements pExactMapping;
	private final TransliterationMappingElements pTransliterationMapping;
	private final AliasElements pAlias;
	private final TerminalRule tINPUTCHAR;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EncodingLangGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSourceMapping = new SourceMappingElements();
		this.pConversion = new ConversionElements();
		this.pMapping = new MappingElements();
		this.pExactMapping = new ExactMappingElements();
		this.pTransliterationMapping = new TransliterationMappingElements();
		this.pAlias = new AliasElements();
		this.tINPUTCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.EncodingLang.INPUTCHAR");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.EncodingLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=SourceMapping*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SourceMapping:
	//	"source" name=ID "{"
	//	aliases+=Alias*
	//	conversions+=Conversion*
	//	"}";
	public SourceMappingElements getSourceMappingAccess() {
		return pSourceMapping;
	}
	
	public ParserRule getSourceMappingRule() {
		return getSourceMappingAccess().getRule();
	}
	
	//Conversion:
	//	"target" name=ID "{"
	//	mappings+=Mapping*
	//	"}";
	public ConversionElements getConversionAccess() {
		return pConversion;
	}
	
	public ParserRule getConversionRule() {
		return getConversionAccess().getRule();
	}
	
	//Mapping:
	//	ExactMapping | TransliterationMapping;
	public MappingElements getMappingAccess() {
		return pMapping;
	}
	
	public ParserRule getMappingRule() {
		return getMappingAccess().getRule();
	}
	
	//ExactMapping:
	//	from=INPUTCHAR "=" to=INPUTCHAR;
	public ExactMappingElements getExactMappingAccess() {
		return pExactMapping;
	}
	
	public ParserRule getExactMappingRule() {
		return getExactMappingAccess().getRule();
	}
	
	//TransliterationMapping:
	//	from=INPUTCHAR "~" to=INPUTCHAR;
	public TransliterationMappingElements getTransliterationMappingAccess() {
		return pTransliterationMapping;
	}
	
	public ParserRule getTransliterationMappingRule() {
		return getTransliterationMappingAccess().getRule();
	}
	
	//Alias:
	//	"alias" name=ID;
	public AliasElements getAliasAccess() {
		return pAlias;
	}
	
	public ParserRule getAliasRule() {
		return getAliasAccess().getRule();
	}
	
	//terminal INPUTCHAR:
	//	'0' ('x' | 'X') (('0'..'9' | 'a'..'f' | 'A'..'F') ('0'..'9' | 'a'..'f' | 'A'..'F'))+;
	public TerminalRule getINPUTCHARRule() {
		return tINPUTCHAR;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
