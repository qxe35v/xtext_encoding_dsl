package org.xtext.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.EncodingLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEncodingLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INPUTCHAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'{'", "'}'", "'='", "'~'", "'alias'"
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

    	public void setGrammarAccess(EncodingLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalEncodingLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEncodingLang.g:54:1: ( ruleModel EOF )
            // InternalEncodingLang.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEncodingLang.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )? ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:66:2: ( ( ( rule__Model__ElementsAssignment )? ) )
            // InternalEncodingLang.g:67:2: ( ( rule__Model__ElementsAssignment )? )
            {
            // InternalEncodingLang.g:67:2: ( ( rule__Model__ElementsAssignment )? )
            // InternalEncodingLang.g:68:3: ( rule__Model__ElementsAssignment )?
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalEncodingLang.g:69:3: ( rule__Model__ElementsAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEncodingLang.g:69:4: rule__Model__ElementsAssignment
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSourceMapping"
    // InternalEncodingLang.g:78:1: entryRuleSourceMapping : ruleSourceMapping EOF ;
    public final void entryRuleSourceMapping() throws RecognitionException {
        try {
            // InternalEncodingLang.g:79:1: ( ruleSourceMapping EOF )
            // InternalEncodingLang.g:80:1: ruleSourceMapping EOF
            {
             before(grammarAccess.getSourceMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceMapping();

            state._fsp--;

             after(grammarAccess.getSourceMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceMapping"


    // $ANTLR start "ruleSourceMapping"
    // InternalEncodingLang.g:87:1: ruleSourceMapping : ( ( rule__SourceMapping__Group__0 ) ) ;
    public final void ruleSourceMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:91:2: ( ( ( rule__SourceMapping__Group__0 ) ) )
            // InternalEncodingLang.g:92:2: ( ( rule__SourceMapping__Group__0 ) )
            {
            // InternalEncodingLang.g:92:2: ( ( rule__SourceMapping__Group__0 ) )
            // InternalEncodingLang.g:93:3: ( rule__SourceMapping__Group__0 )
            {
             before(grammarAccess.getSourceMappingAccess().getGroup()); 
            // InternalEncodingLang.g:94:3: ( rule__SourceMapping__Group__0 )
            // InternalEncodingLang.g:94:4: rule__SourceMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceMapping"


    // $ANTLR start "entryRuleMapping"
    // InternalEncodingLang.g:103:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalEncodingLang.g:104:1: ( ruleMapping EOF )
            // InternalEncodingLang.g:105:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalEncodingLang.g:112:1: ruleMapping : ( ( rule__Mapping__Alternatives ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:116:2: ( ( ( rule__Mapping__Alternatives ) ) )
            // InternalEncodingLang.g:117:2: ( ( rule__Mapping__Alternatives ) )
            {
            // InternalEncodingLang.g:117:2: ( ( rule__Mapping__Alternatives ) )
            // InternalEncodingLang.g:118:3: ( rule__Mapping__Alternatives )
            {
             before(grammarAccess.getMappingAccess().getAlternatives()); 
            // InternalEncodingLang.g:119:3: ( rule__Mapping__Alternatives )
            // InternalEncodingLang.g:119:4: rule__Mapping__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleExactMapping"
    // InternalEncodingLang.g:128:1: entryRuleExactMapping : ruleExactMapping EOF ;
    public final void entryRuleExactMapping() throws RecognitionException {
        try {
            // InternalEncodingLang.g:129:1: ( ruleExactMapping EOF )
            // InternalEncodingLang.g:130:1: ruleExactMapping EOF
            {
             before(grammarAccess.getExactMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleExactMapping();

            state._fsp--;

             after(grammarAccess.getExactMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExactMapping"


    // $ANTLR start "ruleExactMapping"
    // InternalEncodingLang.g:137:1: ruleExactMapping : ( ( rule__ExactMapping__Group__0 ) ) ;
    public final void ruleExactMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:141:2: ( ( ( rule__ExactMapping__Group__0 ) ) )
            // InternalEncodingLang.g:142:2: ( ( rule__ExactMapping__Group__0 ) )
            {
            // InternalEncodingLang.g:142:2: ( ( rule__ExactMapping__Group__0 ) )
            // InternalEncodingLang.g:143:3: ( rule__ExactMapping__Group__0 )
            {
             before(grammarAccess.getExactMappingAccess().getGroup()); 
            // InternalEncodingLang.g:144:3: ( rule__ExactMapping__Group__0 )
            // InternalEncodingLang.g:144:4: rule__ExactMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExactMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExactMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactMapping"


    // $ANTLR start "entryRuleTransliterationMapping"
    // InternalEncodingLang.g:153:1: entryRuleTransliterationMapping : ruleTransliterationMapping EOF ;
    public final void entryRuleTransliterationMapping() throws RecognitionException {
        try {
            // InternalEncodingLang.g:154:1: ( ruleTransliterationMapping EOF )
            // InternalEncodingLang.g:155:1: ruleTransliterationMapping EOF
            {
             before(grammarAccess.getTransliterationMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleTransliterationMapping();

            state._fsp--;

             after(grammarAccess.getTransliterationMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransliterationMapping"


    // $ANTLR start "ruleTransliterationMapping"
    // InternalEncodingLang.g:162:1: ruleTransliterationMapping : ( ( rule__TransliterationMapping__Group__0 ) ) ;
    public final void ruleTransliterationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:166:2: ( ( ( rule__TransliterationMapping__Group__0 ) ) )
            // InternalEncodingLang.g:167:2: ( ( rule__TransliterationMapping__Group__0 ) )
            {
            // InternalEncodingLang.g:167:2: ( ( rule__TransliterationMapping__Group__0 ) )
            // InternalEncodingLang.g:168:3: ( rule__TransliterationMapping__Group__0 )
            {
             before(grammarAccess.getTransliterationMappingAccess().getGroup()); 
            // InternalEncodingLang.g:169:3: ( rule__TransliterationMapping__Group__0 )
            // InternalEncodingLang.g:169:4: rule__TransliterationMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransliterationMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransliterationMapping"


    // $ANTLR start "entryRuleAlias"
    // InternalEncodingLang.g:178:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalEncodingLang.g:179:1: ( ruleAlias EOF )
            // InternalEncodingLang.g:180:1: ruleAlias EOF
            {
             before(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAliasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalEncodingLang.g:187:1: ruleAlias : ( ( rule__Alias__Group__0 ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:191:2: ( ( ( rule__Alias__Group__0 ) ) )
            // InternalEncodingLang.g:192:2: ( ( rule__Alias__Group__0 ) )
            {
            // InternalEncodingLang.g:192:2: ( ( rule__Alias__Group__0 ) )
            // InternalEncodingLang.g:193:3: ( rule__Alias__Group__0 )
            {
             before(grammarAccess.getAliasAccess().getGroup()); 
            // InternalEncodingLang.g:194:3: ( rule__Alias__Group__0 )
            // InternalEncodingLang.g:194:4: rule__Alias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "rule__Mapping__Alternatives"
    // InternalEncodingLang.g:202:1: rule__Mapping__Alternatives : ( ( ruleExactMapping ) | ( ruleTransliterationMapping ) );
    public final void rule__Mapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:206:1: ( ( ruleExactMapping ) | ( ruleTransliterationMapping ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INPUTCHAR) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=2;
                }
                else if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEncodingLang.g:207:2: ( ruleExactMapping )
                    {
                    // InternalEncodingLang.g:207:2: ( ruleExactMapping )
                    // InternalEncodingLang.g:208:3: ruleExactMapping
                    {
                     before(grammarAccess.getMappingAccess().getExactMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExactMapping();

                    state._fsp--;

                     after(grammarAccess.getMappingAccess().getExactMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEncodingLang.g:213:2: ( ruleTransliterationMapping )
                    {
                    // InternalEncodingLang.g:213:2: ( ruleTransliterationMapping )
                    // InternalEncodingLang.g:214:3: ruleTransliterationMapping
                    {
                     before(grammarAccess.getMappingAccess().getTransliterationMappingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransliterationMapping();

                    state._fsp--;

                     after(grammarAccess.getMappingAccess().getTransliterationMappingParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Alternatives"


    // $ANTLR start "rule__SourceMapping__Group__0"
    // InternalEncodingLang.g:223:1: rule__SourceMapping__Group__0 : rule__SourceMapping__Group__0__Impl rule__SourceMapping__Group__1 ;
    public final void rule__SourceMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:227:1: ( rule__SourceMapping__Group__0__Impl rule__SourceMapping__Group__1 )
            // InternalEncodingLang.g:228:2: rule__SourceMapping__Group__0__Impl rule__SourceMapping__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SourceMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__0"


    // $ANTLR start "rule__SourceMapping__Group__0__Impl"
    // InternalEncodingLang.g:235:1: rule__SourceMapping__Group__0__Impl : ( 'source' ) ;
    public final void rule__SourceMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:239:1: ( ( 'source' ) )
            // InternalEncodingLang.g:240:1: ( 'source' )
            {
            // InternalEncodingLang.g:240:1: ( 'source' )
            // InternalEncodingLang.g:241:2: 'source'
            {
             before(grammarAccess.getSourceMappingAccess().getSourceKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSourceMappingAccess().getSourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__0__Impl"


    // $ANTLR start "rule__SourceMapping__Group__1"
    // InternalEncodingLang.g:250:1: rule__SourceMapping__Group__1 : rule__SourceMapping__Group__1__Impl rule__SourceMapping__Group__2 ;
    public final void rule__SourceMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:254:1: ( rule__SourceMapping__Group__1__Impl rule__SourceMapping__Group__2 )
            // InternalEncodingLang.g:255:2: rule__SourceMapping__Group__1__Impl rule__SourceMapping__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SourceMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__1"


    // $ANTLR start "rule__SourceMapping__Group__1__Impl"
    // InternalEncodingLang.g:262:1: rule__SourceMapping__Group__1__Impl : ( ( rule__SourceMapping__NameAssignment_1 ) ) ;
    public final void rule__SourceMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:266:1: ( ( ( rule__SourceMapping__NameAssignment_1 ) ) )
            // InternalEncodingLang.g:267:1: ( ( rule__SourceMapping__NameAssignment_1 ) )
            {
            // InternalEncodingLang.g:267:1: ( ( rule__SourceMapping__NameAssignment_1 ) )
            // InternalEncodingLang.g:268:2: ( rule__SourceMapping__NameAssignment_1 )
            {
             before(grammarAccess.getSourceMappingAccess().getNameAssignment_1()); 
            // InternalEncodingLang.g:269:2: ( rule__SourceMapping__NameAssignment_1 )
            // InternalEncodingLang.g:269:3: rule__SourceMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceMapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__1__Impl"


    // $ANTLR start "rule__SourceMapping__Group__2"
    // InternalEncodingLang.g:277:1: rule__SourceMapping__Group__2 : rule__SourceMapping__Group__2__Impl rule__SourceMapping__Group__3 ;
    public final void rule__SourceMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:281:1: ( rule__SourceMapping__Group__2__Impl rule__SourceMapping__Group__3 )
            // InternalEncodingLang.g:282:2: rule__SourceMapping__Group__2__Impl rule__SourceMapping__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SourceMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__2"


    // $ANTLR start "rule__SourceMapping__Group__2__Impl"
    // InternalEncodingLang.g:289:1: rule__SourceMapping__Group__2__Impl : ( '{' ) ;
    public final void rule__SourceMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:293:1: ( ( '{' ) )
            // InternalEncodingLang.g:294:1: ( '{' )
            {
            // InternalEncodingLang.g:294:1: ( '{' )
            // InternalEncodingLang.g:295:2: '{'
            {
             before(grammarAccess.getSourceMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSourceMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__2__Impl"


    // $ANTLR start "rule__SourceMapping__Group__3"
    // InternalEncodingLang.g:304:1: rule__SourceMapping__Group__3 : rule__SourceMapping__Group__3__Impl rule__SourceMapping__Group__4 ;
    public final void rule__SourceMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:308:1: ( rule__SourceMapping__Group__3__Impl rule__SourceMapping__Group__4 )
            // InternalEncodingLang.g:309:2: rule__SourceMapping__Group__3__Impl rule__SourceMapping__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SourceMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__3"


    // $ANTLR start "rule__SourceMapping__Group__3__Impl"
    // InternalEncodingLang.g:316:1: rule__SourceMapping__Group__3__Impl : ( ( rule__SourceMapping__AliasesAssignment_3 )* ) ;
    public final void rule__SourceMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:320:1: ( ( ( rule__SourceMapping__AliasesAssignment_3 )* ) )
            // InternalEncodingLang.g:321:1: ( ( rule__SourceMapping__AliasesAssignment_3 )* )
            {
            // InternalEncodingLang.g:321:1: ( ( rule__SourceMapping__AliasesAssignment_3 )* )
            // InternalEncodingLang.g:322:2: ( rule__SourceMapping__AliasesAssignment_3 )*
            {
             before(grammarAccess.getSourceMappingAccess().getAliasesAssignment_3()); 
            // InternalEncodingLang.g:323:2: ( rule__SourceMapping__AliasesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEncodingLang.g:323:3: rule__SourceMapping__AliasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SourceMapping__AliasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSourceMappingAccess().getAliasesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__3__Impl"


    // $ANTLR start "rule__SourceMapping__Group__4"
    // InternalEncodingLang.g:331:1: rule__SourceMapping__Group__4 : rule__SourceMapping__Group__4__Impl rule__SourceMapping__Group__5 ;
    public final void rule__SourceMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:335:1: ( rule__SourceMapping__Group__4__Impl rule__SourceMapping__Group__5 )
            // InternalEncodingLang.g:336:2: rule__SourceMapping__Group__4__Impl rule__SourceMapping__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SourceMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__4"


    // $ANTLR start "rule__SourceMapping__Group__4__Impl"
    // InternalEncodingLang.g:343:1: rule__SourceMapping__Group__4__Impl : ( ( rule__SourceMapping__MappingsAssignment_4 )* ) ;
    public final void rule__SourceMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:347:1: ( ( ( rule__SourceMapping__MappingsAssignment_4 )* ) )
            // InternalEncodingLang.g:348:1: ( ( rule__SourceMapping__MappingsAssignment_4 )* )
            {
            // InternalEncodingLang.g:348:1: ( ( rule__SourceMapping__MappingsAssignment_4 )* )
            // InternalEncodingLang.g:349:2: ( rule__SourceMapping__MappingsAssignment_4 )*
            {
             before(grammarAccess.getSourceMappingAccess().getMappingsAssignment_4()); 
            // InternalEncodingLang.g:350:2: ( rule__SourceMapping__MappingsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INPUTCHAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEncodingLang.g:350:3: rule__SourceMapping__MappingsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SourceMapping__MappingsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSourceMappingAccess().getMappingsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__4__Impl"


    // $ANTLR start "rule__SourceMapping__Group__5"
    // InternalEncodingLang.g:358:1: rule__SourceMapping__Group__5 : rule__SourceMapping__Group__5__Impl ;
    public final void rule__SourceMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:362:1: ( rule__SourceMapping__Group__5__Impl )
            // InternalEncodingLang.g:363:2: rule__SourceMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceMapping__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__5"


    // $ANTLR start "rule__SourceMapping__Group__5__Impl"
    // InternalEncodingLang.g:369:1: rule__SourceMapping__Group__5__Impl : ( '}' ) ;
    public final void rule__SourceMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:373:1: ( ( '}' ) )
            // InternalEncodingLang.g:374:1: ( '}' )
            {
            // InternalEncodingLang.g:374:1: ( '}' )
            // InternalEncodingLang.g:375:2: '}'
            {
             before(grammarAccess.getSourceMappingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSourceMappingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__Group__5__Impl"


    // $ANTLR start "rule__ExactMapping__Group__0"
    // InternalEncodingLang.g:385:1: rule__ExactMapping__Group__0 : rule__ExactMapping__Group__0__Impl rule__ExactMapping__Group__1 ;
    public final void rule__ExactMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:389:1: ( rule__ExactMapping__Group__0__Impl rule__ExactMapping__Group__1 )
            // InternalEncodingLang.g:390:2: rule__ExactMapping__Group__0__Impl rule__ExactMapping__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExactMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__0"


    // $ANTLR start "rule__ExactMapping__Group__0__Impl"
    // InternalEncodingLang.g:397:1: rule__ExactMapping__Group__0__Impl : ( ( rule__ExactMapping__FromAssignment_0 ) ) ;
    public final void rule__ExactMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:401:1: ( ( ( rule__ExactMapping__FromAssignment_0 ) ) )
            // InternalEncodingLang.g:402:1: ( ( rule__ExactMapping__FromAssignment_0 ) )
            {
            // InternalEncodingLang.g:402:1: ( ( rule__ExactMapping__FromAssignment_0 ) )
            // InternalEncodingLang.g:403:2: ( rule__ExactMapping__FromAssignment_0 )
            {
             before(grammarAccess.getExactMappingAccess().getFromAssignment_0()); 
            // InternalEncodingLang.g:404:2: ( rule__ExactMapping__FromAssignment_0 )
            // InternalEncodingLang.g:404:3: rule__ExactMapping__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExactMapping__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExactMappingAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__0__Impl"


    // $ANTLR start "rule__ExactMapping__Group__1"
    // InternalEncodingLang.g:412:1: rule__ExactMapping__Group__1 : rule__ExactMapping__Group__1__Impl rule__ExactMapping__Group__2 ;
    public final void rule__ExactMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:416:1: ( rule__ExactMapping__Group__1__Impl rule__ExactMapping__Group__2 )
            // InternalEncodingLang.g:417:2: rule__ExactMapping__Group__1__Impl rule__ExactMapping__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExactMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExactMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__1"


    // $ANTLR start "rule__ExactMapping__Group__1__Impl"
    // InternalEncodingLang.g:424:1: rule__ExactMapping__Group__1__Impl : ( '=' ) ;
    public final void rule__ExactMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:428:1: ( ( '=' ) )
            // InternalEncodingLang.g:429:1: ( '=' )
            {
            // InternalEncodingLang.g:429:1: ( '=' )
            // InternalEncodingLang.g:430:2: '='
            {
             before(grammarAccess.getExactMappingAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExactMappingAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__1__Impl"


    // $ANTLR start "rule__ExactMapping__Group__2"
    // InternalEncodingLang.g:439:1: rule__ExactMapping__Group__2 : rule__ExactMapping__Group__2__Impl ;
    public final void rule__ExactMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:443:1: ( rule__ExactMapping__Group__2__Impl )
            // InternalEncodingLang.g:444:2: rule__ExactMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExactMapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__2"


    // $ANTLR start "rule__ExactMapping__Group__2__Impl"
    // InternalEncodingLang.g:450:1: rule__ExactMapping__Group__2__Impl : ( ( rule__ExactMapping__ToAssignment_2 ) ) ;
    public final void rule__ExactMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:454:1: ( ( ( rule__ExactMapping__ToAssignment_2 ) ) )
            // InternalEncodingLang.g:455:1: ( ( rule__ExactMapping__ToAssignment_2 ) )
            {
            // InternalEncodingLang.g:455:1: ( ( rule__ExactMapping__ToAssignment_2 ) )
            // InternalEncodingLang.g:456:2: ( rule__ExactMapping__ToAssignment_2 )
            {
             before(grammarAccess.getExactMappingAccess().getToAssignment_2()); 
            // InternalEncodingLang.g:457:2: ( rule__ExactMapping__ToAssignment_2 )
            // InternalEncodingLang.g:457:3: rule__ExactMapping__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExactMapping__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExactMappingAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__Group__2__Impl"


    // $ANTLR start "rule__TransliterationMapping__Group__0"
    // InternalEncodingLang.g:466:1: rule__TransliterationMapping__Group__0 : rule__TransliterationMapping__Group__0__Impl rule__TransliterationMapping__Group__1 ;
    public final void rule__TransliterationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:470:1: ( rule__TransliterationMapping__Group__0__Impl rule__TransliterationMapping__Group__1 )
            // InternalEncodingLang.g:471:2: rule__TransliterationMapping__Group__0__Impl rule__TransliterationMapping__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TransliterationMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__0"


    // $ANTLR start "rule__TransliterationMapping__Group__0__Impl"
    // InternalEncodingLang.g:478:1: rule__TransliterationMapping__Group__0__Impl : ( ( rule__TransliterationMapping__FromAssignment_0 ) ) ;
    public final void rule__TransliterationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:482:1: ( ( ( rule__TransliterationMapping__FromAssignment_0 ) ) )
            // InternalEncodingLang.g:483:1: ( ( rule__TransliterationMapping__FromAssignment_0 ) )
            {
            // InternalEncodingLang.g:483:1: ( ( rule__TransliterationMapping__FromAssignment_0 ) )
            // InternalEncodingLang.g:484:2: ( rule__TransliterationMapping__FromAssignment_0 )
            {
             before(grammarAccess.getTransliterationMappingAccess().getFromAssignment_0()); 
            // InternalEncodingLang.g:485:2: ( rule__TransliterationMapping__FromAssignment_0 )
            // InternalEncodingLang.g:485:3: rule__TransliterationMapping__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransliterationMappingAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__0__Impl"


    // $ANTLR start "rule__TransliterationMapping__Group__1"
    // InternalEncodingLang.g:493:1: rule__TransliterationMapping__Group__1 : rule__TransliterationMapping__Group__1__Impl rule__TransliterationMapping__Group__2 ;
    public final void rule__TransliterationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:497:1: ( rule__TransliterationMapping__Group__1__Impl rule__TransliterationMapping__Group__2 )
            // InternalEncodingLang.g:498:2: rule__TransliterationMapping__Group__1__Impl rule__TransliterationMapping__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TransliterationMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__1"


    // $ANTLR start "rule__TransliterationMapping__Group__1__Impl"
    // InternalEncodingLang.g:505:1: rule__TransliterationMapping__Group__1__Impl : ( '~' ) ;
    public final void rule__TransliterationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:509:1: ( ( '~' ) )
            // InternalEncodingLang.g:510:1: ( '~' )
            {
            // InternalEncodingLang.g:510:1: ( '~' )
            // InternalEncodingLang.g:511:2: '~'
            {
             before(grammarAccess.getTransliterationMappingAccess().getTildeKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransliterationMappingAccess().getTildeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__1__Impl"


    // $ANTLR start "rule__TransliterationMapping__Group__2"
    // InternalEncodingLang.g:520:1: rule__TransliterationMapping__Group__2 : rule__TransliterationMapping__Group__2__Impl ;
    public final void rule__TransliterationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:524:1: ( rule__TransliterationMapping__Group__2__Impl )
            // InternalEncodingLang.g:525:2: rule__TransliterationMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__2"


    // $ANTLR start "rule__TransliterationMapping__Group__2__Impl"
    // InternalEncodingLang.g:531:1: rule__TransliterationMapping__Group__2__Impl : ( ( rule__TransliterationMapping__ToAssignment_2 ) ) ;
    public final void rule__TransliterationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:535:1: ( ( ( rule__TransliterationMapping__ToAssignment_2 ) ) )
            // InternalEncodingLang.g:536:1: ( ( rule__TransliterationMapping__ToAssignment_2 ) )
            {
            // InternalEncodingLang.g:536:1: ( ( rule__TransliterationMapping__ToAssignment_2 ) )
            // InternalEncodingLang.g:537:2: ( rule__TransliterationMapping__ToAssignment_2 )
            {
             before(grammarAccess.getTransliterationMappingAccess().getToAssignment_2()); 
            // InternalEncodingLang.g:538:2: ( rule__TransliterationMapping__ToAssignment_2 )
            // InternalEncodingLang.g:538:3: rule__TransliterationMapping__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TransliterationMapping__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransliterationMappingAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__Group__2__Impl"


    // $ANTLR start "rule__Alias__Group__0"
    // InternalEncodingLang.g:547:1: rule__Alias__Group__0 : rule__Alias__Group__0__Impl rule__Alias__Group__1 ;
    public final void rule__Alias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:551:1: ( rule__Alias__Group__0__Impl rule__Alias__Group__1 )
            // InternalEncodingLang.g:552:2: rule__Alias__Group__0__Impl rule__Alias__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Alias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0"


    // $ANTLR start "rule__Alias__Group__0__Impl"
    // InternalEncodingLang.g:559:1: rule__Alias__Group__0__Impl : ( 'alias' ) ;
    public final void rule__Alias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:563:1: ( ( 'alias' ) )
            // InternalEncodingLang.g:564:1: ( 'alias' )
            {
            // InternalEncodingLang.g:564:1: ( 'alias' )
            // InternalEncodingLang.g:565:2: 'alias'
            {
             before(grammarAccess.getAliasAccess().getAliasKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getAliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0__Impl"


    // $ANTLR start "rule__Alias__Group__1"
    // InternalEncodingLang.g:574:1: rule__Alias__Group__1 : rule__Alias__Group__1__Impl ;
    public final void rule__Alias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:578:1: ( rule__Alias__Group__1__Impl )
            // InternalEncodingLang.g:579:2: rule__Alias__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1"


    // $ANTLR start "rule__Alias__Group__1__Impl"
    // InternalEncodingLang.g:585:1: rule__Alias__Group__1__Impl : ( ( rule__Alias__NameAssignment_1 ) ) ;
    public final void rule__Alias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:589:1: ( ( ( rule__Alias__NameAssignment_1 ) ) )
            // InternalEncodingLang.g:590:1: ( ( rule__Alias__NameAssignment_1 ) )
            {
            // InternalEncodingLang.g:590:1: ( ( rule__Alias__NameAssignment_1 ) )
            // InternalEncodingLang.g:591:2: ( rule__Alias__NameAssignment_1 )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment_1()); 
            // InternalEncodingLang.g:592:2: ( rule__Alias__NameAssignment_1 )
            // InternalEncodingLang.g:592:3: rule__Alias__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alias__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalEncodingLang.g:601:1: rule__Model__ElementsAssignment : ( ruleSourceMapping ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:605:1: ( ( ruleSourceMapping ) )
            // InternalEncodingLang.g:606:2: ( ruleSourceMapping )
            {
            // InternalEncodingLang.g:606:2: ( ruleSourceMapping )
            // InternalEncodingLang.g:607:3: ruleSourceMapping
            {
             before(grammarAccess.getModelAccess().getElementsSourceMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMapping();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsSourceMappingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__SourceMapping__NameAssignment_1"
    // InternalEncodingLang.g:616:1: rule__SourceMapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SourceMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:620:1: ( ( RULE_ID ) )
            // InternalEncodingLang.g:621:2: ( RULE_ID )
            {
            // InternalEncodingLang.g:621:2: ( RULE_ID )
            // InternalEncodingLang.g:622:3: RULE_ID
            {
             before(grammarAccess.getSourceMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceMappingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__NameAssignment_1"


    // $ANTLR start "rule__SourceMapping__AliasesAssignment_3"
    // InternalEncodingLang.g:631:1: rule__SourceMapping__AliasesAssignment_3 : ( ruleAlias ) ;
    public final void rule__SourceMapping__AliasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:635:1: ( ( ruleAlias ) )
            // InternalEncodingLang.g:636:2: ( ruleAlias )
            {
            // InternalEncodingLang.g:636:2: ( ruleAlias )
            // InternalEncodingLang.g:637:3: ruleAlias
            {
             before(grammarAccess.getSourceMappingAccess().getAliasesAliasParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getSourceMappingAccess().getAliasesAliasParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__AliasesAssignment_3"


    // $ANTLR start "rule__SourceMapping__MappingsAssignment_4"
    // InternalEncodingLang.g:646:1: rule__SourceMapping__MappingsAssignment_4 : ( ruleMapping ) ;
    public final void rule__SourceMapping__MappingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:650:1: ( ( ruleMapping ) )
            // InternalEncodingLang.g:651:2: ( ruleMapping )
            {
            // InternalEncodingLang.g:651:2: ( ruleMapping )
            // InternalEncodingLang.g:652:3: ruleMapping
            {
             before(grammarAccess.getSourceMappingAccess().getMappingsMappingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getSourceMappingAccess().getMappingsMappingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMapping__MappingsAssignment_4"


    // $ANTLR start "rule__ExactMapping__FromAssignment_0"
    // InternalEncodingLang.g:661:1: rule__ExactMapping__FromAssignment_0 : ( RULE_INPUTCHAR ) ;
    public final void rule__ExactMapping__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:665:1: ( ( RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:666:2: ( RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:666:2: ( RULE_INPUTCHAR )
            // InternalEncodingLang.g:667:3: RULE_INPUTCHAR
            {
             before(grammarAccess.getExactMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0()); 
            match(input,RULE_INPUTCHAR,FOLLOW_2); 
             after(grammarAccess.getExactMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__FromAssignment_0"


    // $ANTLR start "rule__ExactMapping__ToAssignment_2"
    // InternalEncodingLang.g:676:1: rule__ExactMapping__ToAssignment_2 : ( RULE_INPUTCHAR ) ;
    public final void rule__ExactMapping__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:680:1: ( ( RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:681:2: ( RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:681:2: ( RULE_INPUTCHAR )
            // InternalEncodingLang.g:682:3: RULE_INPUTCHAR
            {
             before(grammarAccess.getExactMappingAccess().getToINPUTCHARTerminalRuleCall_2_0()); 
            match(input,RULE_INPUTCHAR,FOLLOW_2); 
             after(grammarAccess.getExactMappingAccess().getToINPUTCHARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMapping__ToAssignment_2"


    // $ANTLR start "rule__TransliterationMapping__FromAssignment_0"
    // InternalEncodingLang.g:691:1: rule__TransliterationMapping__FromAssignment_0 : ( RULE_INPUTCHAR ) ;
    public final void rule__TransliterationMapping__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:695:1: ( ( RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:696:2: ( RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:696:2: ( RULE_INPUTCHAR )
            // InternalEncodingLang.g:697:3: RULE_INPUTCHAR
            {
             before(grammarAccess.getTransliterationMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0()); 
            match(input,RULE_INPUTCHAR,FOLLOW_2); 
             after(grammarAccess.getTransliterationMappingAccess().getFromINPUTCHARTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__FromAssignment_0"


    // $ANTLR start "rule__TransliterationMapping__ToAssignment_2"
    // InternalEncodingLang.g:706:1: rule__TransliterationMapping__ToAssignment_2 : ( RULE_INPUTCHAR ) ;
    public final void rule__TransliterationMapping__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:710:1: ( ( RULE_INPUTCHAR ) )
            // InternalEncodingLang.g:711:2: ( RULE_INPUTCHAR )
            {
            // InternalEncodingLang.g:711:2: ( RULE_INPUTCHAR )
            // InternalEncodingLang.g:712:3: RULE_INPUTCHAR
            {
             before(grammarAccess.getTransliterationMappingAccess().getToINPUTCHARTerminalRuleCall_2_0()); 
            match(input,RULE_INPUTCHAR,FOLLOW_2); 
             after(grammarAccess.getTransliterationMappingAccess().getToINPUTCHARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransliterationMapping__ToAssignment_2"


    // $ANTLR start "rule__Alias__NameAssignment_1"
    // InternalEncodingLang.g:721:1: rule__Alias__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEncodingLang.g:725:1: ( ( RULE_ID ) )
            // InternalEncodingLang.g:726:2: ( RULE_ID )
            {
            // InternalEncodingLang.g:726:2: ( RULE_ID )
            // InternalEncodingLang.g:727:3: RULE_ID
            {
             before(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}