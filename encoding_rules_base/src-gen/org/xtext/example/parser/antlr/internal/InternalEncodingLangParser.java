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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEncodingLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INPUTCHAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'{'", "'}'", "'target'", "'='", "'~'", "'alias'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INPUTCHAR=5;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEncodingLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEncodingLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEncodingLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEncodingLang.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalEncodingLang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEncodingLang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEncodingLang.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEncodingLang.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleSourceMapping ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalEncodingLang.g:77:2: ( ( (lv_elements_0_0= ruleSourceMapping ) )* )
            // InternalEncodingLang.g:78:2: ( (lv_elements_0_0= ruleSourceMapping ) )*
            {
            // InternalEncodingLang.g:78:2: ( (lv_elements_0_0= ruleSourceMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEncodingLang.g:79:3: (lv_elements_0_0= ruleSourceMapping )
            	    {
            	    // InternalEncodingLang.g:79:3: (lv_elements_0_0= ruleSourceMapping )
            	    // InternalEncodingLang.g:80:4: lv_elements_0_0= ruleSourceMapping
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsSourceMappingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleSourceMapping();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.EncodingLang.SourceMapping");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSourceMapping"
    // InternalEncodingLang.g:100:1: entryRuleSourceMapping returns [EObject current=null] : iv_ruleSourceMapping= ruleSourceMapping EOF ;
    public final EObject entryRuleSourceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceMapping = null;


        try {
            // InternalEncodingLang.g:100:54: (iv_ruleSourceMapping= ruleSourceMapping EOF )
            // InternalEncodingLang.g:101:2: iv_ruleSourceMapping= ruleSourceMapping EOF
            {
             newCompositeNode(grammarAccess.getSourceMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceMapping=ruleSourceMapping();

            state._fsp--;

             current =iv_ruleSourceMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceMapping"


    // $ANTLR start "ruleSourceMapping"
    // InternalEncodingLang.g:107:1: ruleSourceMapping returns [EObject current=null] : (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_aliases_3_0= ruleAlias ) )* ( (lv_conversions_4_0= ruleConversion ) )* otherlv_5= '}' ) ;
    public final EObject ruleSourceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_aliases_3_0 = null;

        EObject lv_conversions_4_0 = null;



        	enterRule();

        try {
            // InternalEncodingLang.g:113:2: ( (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_aliases_3_0= ruleAlias ) )* ( (lv_conversions_4_0= ruleConversion ) )* otherlv_5= '}' ) )
            // InternalEncodingLang.g:114:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_aliases_3_0= ruleAlias ) )* ( (lv_conversions_4_0= ruleConversion ) )* otherlv_5= '}' )
            {
            // InternalEncodingLang.g:114:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_aliases_3_0= ruleAlias ) )* ( (lv_conversions_4_0= ruleConversion ) )* otherlv_5= '}' )
            // InternalEncodingLang.g:115:3: otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_aliases_3_0= ruleAlias ) )* ( (lv_conversions_4_0= ruleConversion ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceMappingAccess().getSourceKeyword_0());
            		
            // InternalEncodingLang.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEncodingLang.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEncodingLang.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalEncodingLang.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceMappingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceMappingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEncodingLang.g:141:3: ( (lv_aliases_3_0= ruleAlias ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEncodingLang.g:142:4: (lv_aliases_3_0= ruleAlias )
            	    {
            	    // InternalEncodingLang.g:142:4: (lv_aliases_3_0= ruleAlias )
            	    // InternalEncodingLang.g:143:5: lv_aliases_3_0= ruleAlias
            	    {

            	    					newCompositeNode(grammarAccess.getSourceMappingAccess().getAliasesAliasParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_aliases_3_0=ruleAlias();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"aliases",
            	    						lv_aliases_3_0,
            	    						"org.xtext.example.EncodingLang.Alias");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEncodingLang.g:160:3: ( (lv_conversions_4_0= ruleConversion ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEncodingLang.g:161:4: (lv_conversions_4_0= ruleConversion )
            	    {
            	    // InternalEncodingLang.g:161:4: (lv_conversions_4_0= ruleConversion )
            	    // InternalEncodingLang.g:162:5: lv_conversions_4_0= ruleConversion
            	    {

            	    					newCompositeNode(grammarAccess.getSourceMappingAccess().getConversionsConversionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_conversions_4_0=ruleConversion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conversions",
            	    						lv_conversions_4_0,
            	    						"org.xtext.example.EncodingLang.Conversion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceMappingAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceMapping"


    // $ANTLR start "entryRuleConversion"
    // InternalEncodingLang.g:187:1: entryRuleConversion returns [EObject current=null] : iv_ruleConversion= ruleConversion EOF ;
    public final EObject entryRuleConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConversion = null;


        try {
            // InternalEncodingLang.g:187:51: (iv_ruleConversion= ruleConversion EOF )
            // InternalEncodingLang.g:188:2: iv_ruleConversion= ruleConversion EOF
            {
             newCompositeNode(grammarAccess.getConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConversion=ruleConversion();

            state._fsp--;

             current =iv_ruleConversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConversion"


    // $ANTLR start "ruleConversion"
    // InternalEncodingLang.g:194:1: ruleConversion returns [EObject current=null] : (otherlv_0= 'target' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;



        	enterRule();

        try {
            // InternalEncodingLang.g:200:2: ( (otherlv_0= 'target' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ) )
            // InternalEncodingLang.g:201:2: (otherlv_0= 'target' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' )
            {
            // InternalEncodingLang.g:201:2: (otherlv_0= 'target' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' )
            // InternalEncodingLang.g:202:3: otherlv_0= 'target' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConversionAccess().getTargetKeyword_0());
            		
            // InternalEncodingLang.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEncodingLang.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEncodingLang.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalEncodingLang.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConversionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEncodingLang.g:228:3: ( (lv_mappings_3_0= ruleMapping ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INPUTCHAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEncodingLang.g:229:4: (lv_mappings_3_0= ruleMapping )
            	    {
            	    // InternalEncodingLang.g:229:4: (lv_mappings_3_0= ruleMapping )
            	    // InternalEncodingLang.g:230:5: lv_mappings_3_0= ruleMapping
            	    {

            	    					newCompositeNode(grammarAccess.getConversionAccess().getMappingsMappingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_mappings_3_0=ruleMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConversionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappings",
            	    						lv_mappings_3_0,
            	    						"org.xtext.example.EncodingLang.Mapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConversionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConversion"


    // $ANTLR start "entryRuleMapping"
    // InternalEncodingLang.g:255:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalEncodingLang.g:255:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalEncodingLang.g:256:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalEncodingLang.g:262:1: ruleMapping returns [EObject current=null] : (this_ExactMapping_0= ruleExactMapping | this_TransliterationMapping_1= ruleTransliterationMapping ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_ExactMapping_0 = null;

        EObject this_TransliterationMapping_1 = null;



        	enterRule();

        try {
            // InternalEncodingLang.g:268:2: ( (this_ExactMapping_0= ruleExactMapping | this_TransliterationMapping_1= ruleTransliterationMapping ) )
            // InternalEncodingLang.g:269:2: (this_ExactMapping_0= ruleExactMapping | this_TransliterationMapping_1= ruleTransliterationMapping )
            {
            // InternalEncodingLang.g:269:2: (this_ExactMapping_0= ruleExactMapping | this_TransliterationMapping_1= ruleTransliterationMapping )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INPUTCHAR) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==16) ) {
                    alt5=1;
                }
                else if ( (LA5_1==17) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEncodingLang.g:270:3: this_ExactMapping_0= ruleExactMapping
                    {

                    			newCompositeNode(grammarAccess.getMappingAccess().getExactMappingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactMapping_0=ruleExactMapping();

                    state._fsp--;


                    			current = this_ExactMapping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEncodingLang.g:279:3: this_TransliterationMapping_1= ruleTransliterationMapping
                    {

                    			newCompositeNode(grammarAccess.getMappingAccess().getTransliterationMappingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransliterationMapping_1=ruleTransliterationMapping();

                    state._fsp--;


                    			current = this_TransliterationMapping_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleExactMapping"
    // InternalEncodingLang.g:291:1: entryRuleExactMapping returns [EObject current=null] : iv_ruleExactMapping= ruleExactMapping EOF ;
    public final EObject entryRuleExactMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMapping = null;


        try {
            // InternalEncodingLang.g:291:53: (iv_ruleExactMapping= ruleExactMapping EOF )
            // InternalEncodingLang.g:292:2: iv_ruleExactMapping= ruleExactMapping EOF
            {
             newCompositeNode(grammarAccess.getExactMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactMapping=ruleExactMapping();

            state._fsp--;

             current =iv_ruleExactMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactMapping"


    // $ANTLR start "ruleExactMapping"
    // InternalEncodingLang.g:298:1: ruleExactMapping returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '=' ( (lv_to_2_0= RULE_INPUTCHAR ) ) ) ;
    public final EObject ruleExactMapping() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;


        	enterRule();

        try {
            // InternalEncodingLang.g:304:2: ( ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '=' ( (lv_to_2_0= RULE_INPUTCHAR ) ) ) )
            // InternalEncodingLang.g:305:2: ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '=' ( (lv_to_2_0= RULE_INPUTCHAR ) ) )
            {
            // InternalEncodingLang.g:305:2: ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '=' ( (lv_to_2_0= RULE_INPUTCHAR ) ) )
            // InternalEncodingLang.g:306:3: ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '=' ( (lv_to_2_0= RULE_INPUTCHAR ) )
            {
            // InternalEncodingLang.g:306:3: ( (lv_from_0_0= RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:307:4: (lv_from_0_0= RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:307:4: (lv_from_0_0= RULE_INPUTCHAR )
            // InternalEncodingLang.g:308:5: lv_from_0_0= RULE_INPUTCHAR
            {
            lv_from_0_0=(Token)match(input,RULE_INPUTCHAR,FOLLOW_9); 

            					newLeafNode(lv_from_0_0, grammarAccess.getExactMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"org.xtext.example.EncodingLang.INPUTCHAR");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getExactMappingAccess().getEqualsSignKeyword_1());
            		
            // InternalEncodingLang.g:328:3: ( (lv_to_2_0= RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:329:4: (lv_to_2_0= RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:329:4: (lv_to_2_0= RULE_INPUTCHAR )
            // InternalEncodingLang.g:330:5: lv_to_2_0= RULE_INPUTCHAR
            {
            lv_to_2_0=(Token)match(input,RULE_INPUTCHAR,FOLLOW_2); 

            					newLeafNode(lv_to_2_0, grammarAccess.getExactMappingAccess().getToINPUTCHARTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_2_0,
            						"org.xtext.example.EncodingLang.INPUTCHAR");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactMapping"


    // $ANTLR start "entryRuleTransliterationMapping"
    // InternalEncodingLang.g:350:1: entryRuleTransliterationMapping returns [EObject current=null] : iv_ruleTransliterationMapping= ruleTransliterationMapping EOF ;
    public final EObject entryRuleTransliterationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransliterationMapping = null;


        try {
            // InternalEncodingLang.g:350:63: (iv_ruleTransliterationMapping= ruleTransliterationMapping EOF )
            // InternalEncodingLang.g:351:2: iv_ruleTransliterationMapping= ruleTransliterationMapping EOF
            {
             newCompositeNode(grammarAccess.getTransliterationMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransliterationMapping=ruleTransliterationMapping();

            state._fsp--;

             current =iv_ruleTransliterationMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransliterationMapping"


    // $ANTLR start "ruleTransliterationMapping"
    // InternalEncodingLang.g:357:1: ruleTransliterationMapping returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '~' ( (lv_to_2_0= RULE_INPUTCHAR ) ) ) ;
    public final EObject ruleTransliterationMapping() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;


        	enterRule();

        try {
            // InternalEncodingLang.g:363:2: ( ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '~' ( (lv_to_2_0= RULE_INPUTCHAR ) ) ) )
            // InternalEncodingLang.g:364:2: ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '~' ( (lv_to_2_0= RULE_INPUTCHAR ) ) )
            {
            // InternalEncodingLang.g:364:2: ( ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '~' ( (lv_to_2_0= RULE_INPUTCHAR ) ) )
            // InternalEncodingLang.g:365:3: ( (lv_from_0_0= RULE_INPUTCHAR ) ) otherlv_1= '~' ( (lv_to_2_0= RULE_INPUTCHAR ) )
            {
            // InternalEncodingLang.g:365:3: ( (lv_from_0_0= RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:366:4: (lv_from_0_0= RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:366:4: (lv_from_0_0= RULE_INPUTCHAR )
            // InternalEncodingLang.g:367:5: lv_from_0_0= RULE_INPUTCHAR
            {
            lv_from_0_0=(Token)match(input,RULE_INPUTCHAR,FOLLOW_11); 

            					newLeafNode(lv_from_0_0, grammarAccess.getTransliterationMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransliterationMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"org.xtext.example.EncodingLang.INPUTCHAR");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTransliterationMappingAccess().getTildeKeyword_1());
            		
            // InternalEncodingLang.g:387:3: ( (lv_to_2_0= RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:388:4: (lv_to_2_0= RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:388:4: (lv_to_2_0= RULE_INPUTCHAR )
            // InternalEncodingLang.g:389:5: lv_to_2_0= RULE_INPUTCHAR
            {
            lv_to_2_0=(Token)match(input,RULE_INPUTCHAR,FOLLOW_2); 

            					newLeafNode(lv_to_2_0, grammarAccess.getTransliterationMappingAccess().getToINPUTCHARTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransliterationMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_2_0,
            						"org.xtext.example.EncodingLang.INPUTCHAR");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransliterationMapping"


    // $ANTLR start "entryRuleAlias"
    // InternalEncodingLang.g:409:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalEncodingLang.g:409:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalEncodingLang.g:410:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalEncodingLang.g:416:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEncodingLang.g:422:2: ( (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEncodingLang.g:423:2: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEncodingLang.g:423:2: (otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEncodingLang.g:424:3: otherlv_0= 'alias' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
            		
            // InternalEncodingLang.g:428:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEncodingLang.g:429:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEncodingLang.g:429:4: (lv_name_1_0= RULE_ID )
            // InternalEncodingLang.g:430:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlias"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}