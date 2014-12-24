package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'ijsdf'", "'}'", "'activity'", "'constraint'", "'person'", "':'", "','", "'.'", "'<'", "'>'", "'='", "'inRange'", "'['", "'('", "')'", "']'", "'+'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDomainModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'ijsdf' ( (lv_elements_4_0= ruleConstraintType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'ijsdf' ( (lv_elements_4_0= ruleConstraintType ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'ijsdf' ( (lv_elements_4_0= ruleConstraintType ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'ijsdf' ( (lv_elements_4_0= ruleConstraintType ) )* otherlv_5= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= '{' otherlv_3= 'ijsdf' ( (lv_elements_4_0= ruleConstraintType ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDomainModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDomainModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainModel143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDomainModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDomainModel167); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getIjsdfKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:1: ( (lv_elements_4_0= ruleConstraintType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_elements_4_0= ruleConstraintType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:111:1: (lv_elements_4_0= ruleConstraintType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:3: lv_elements_4_0= ruleConstraintType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsConstraintTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintType_in_ruleDomainModel188);
            	    lv_elements_4_0=ruleConstraintType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"ConstraintType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDomainModel201); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: entryRuleConstraintType returns [EObject current=null] : iv_ruleConstraintType= ruleConstraintType EOF ;
    public final EObject entryRuleConstraintType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:141:2: (iv_ruleConstraintType= ruleConstraintType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:2: iv_ruleConstraintType= ruleConstraintType EOF
            {
             newCompositeNode(grammarAccess.getConstraintTypeRule()); 
            pushFollow(FOLLOW_ruleConstraintType_in_entryRuleConstraintType237);
            iv_ruleConstraintType=ruleConstraintType();

            state._fsp--;

             current =iv_ruleConstraintType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintType247); 

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
    // $ANTLR end "entryRuleConstraintType"


    // $ANTLR start "ruleConstraintType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:1: ruleConstraintType returns [EObject current=null] : ( ( (lv_d_0_0= ruleDefaultConstraint ) ) | ( (lv_p_1_0= rulePersonalConstraint ) ) ) ;
    public final EObject ruleConstraintType() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;

        EObject lv_p_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:28: ( ( ( (lv_d_0_0= ruleDefaultConstraint ) ) | ( (lv_p_1_0= rulePersonalConstraint ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:1: ( ( (lv_d_0_0= ruleDefaultConstraint ) ) | ( (lv_p_1_0= rulePersonalConstraint ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:1: ( ( (lv_d_0_0= ruleDefaultConstraint ) ) | ( (lv_p_1_0= rulePersonalConstraint ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:2: ( (lv_d_0_0= ruleDefaultConstraint ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:2: ( (lv_d_0_0= ruleDefaultConstraint ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:1: (lv_d_0_0= ruleDefaultConstraint )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:1: (lv_d_0_0= ruleDefaultConstraint )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:3: lv_d_0_0= ruleDefaultConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintTypeAccess().getDDefaultConstraintParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultConstraint_in_ruleConstraintType293);
                    lv_d_0_0=ruleDefaultConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"d",
                            		lv_d_0_0, 
                            		"DefaultConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:6: ( (lv_p_1_0= rulePersonalConstraint ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:6: ( (lv_p_1_0= rulePersonalConstraint ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:1: (lv_p_1_0= rulePersonalConstraint )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:1: (lv_p_1_0= rulePersonalConstraint )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:3: lv_p_1_0= rulePersonalConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintTypeAccess().getPPersonalConstraintParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePersonalConstraint_in_ruleConstraintType320);
                    lv_p_1_0=rulePersonalConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"p",
                            		lv_p_1_0, 
                            		"PersonalConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "entryRuleDefaultConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:1: entryRuleDefaultConstraint returns [EObject current=null] : iv_ruleDefaultConstraint= ruleDefaultConstraint EOF ;
    public final EObject entryRuleDefaultConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:2: (iv_ruleDefaultConstraint= ruleDefaultConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:2: iv_ruleDefaultConstraint= ruleDefaultConstraint EOF
            {
             newCompositeNode(grammarAccess.getDefaultConstraintRule()); 
            pushFollow(FOLLOW_ruleDefaultConstraint_in_entryRuleDefaultConstraint356);
            iv_ruleDefaultConstraint=ruleDefaultConstraint();

            state._fsp--;

             current =iv_ruleDefaultConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultConstraint366); 

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
    // $ANTLR end "entryRuleDefaultConstraint"


    // $ANTLR start "ruleDefaultConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:1: ruleDefaultConstraint returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_activityName_1_0= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_constraints_3_0= ruleConstraint ) )* ) ;
    public final EObject ruleDefaultConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_activityName_1_0=null;
        Token otherlv_2=null;
        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:28: ( (otherlv_0= 'activity' ( (lv_activityName_1_0= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_constraints_3_0= ruleConstraint ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:1: (otherlv_0= 'activity' ( (lv_activityName_1_0= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_constraints_3_0= ruleConstraint ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:1: (otherlv_0= 'activity' ( (lv_activityName_1_0= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_constraints_3_0= ruleConstraint ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:3: otherlv_0= 'activity' ( (lv_activityName_1_0= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_constraints_3_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDefaultConstraint403); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultConstraintAccess().getActivityKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: ( (lv_activityName_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_activityName_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_activityName_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:3: lv_activityName_1_0= RULE_ID
            {
            lv_activityName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultConstraint420); 

            			newLeafNode(lv_activityName_1_0, grammarAccess.getDefaultConstraintAccess().getActivityNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityName",
                    		lv_activityName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDefaultConstraint437); 

                	newLeafNode(otherlv_2, grammarAccess.getDefaultConstraintAccess().getConstraintKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ( (lv_constraints_3_0= ruleConstraint ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:1: (lv_constraints_3_0= ruleConstraint )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:1: (lv_constraints_3_0= ruleConstraint )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:3: lv_constraints_3_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefaultConstraintAccess().getConstraintsConstraintParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleDefaultConstraint458);
            	    lv_constraints_3_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefaultConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_3_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleDefaultConstraint"


    // $ANTLR start "entryRulePersonalConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:1: entryRulePersonalConstraint returns [EObject current=null] : iv_rulePersonalConstraint= rulePersonalConstraint EOF ;
    public final EObject entryRulePersonalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonalConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:2: (iv_rulePersonalConstraint= rulePersonalConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:265:2: iv_rulePersonalConstraint= rulePersonalConstraint EOF
            {
             newCompositeNode(grammarAccess.getPersonalConstraintRule()); 
            pushFollow(FOLLOW_rulePersonalConstraint_in_entryRulePersonalConstraint495);
            iv_rulePersonalConstraint=rulePersonalConstraint();

            state._fsp--;

             current =iv_rulePersonalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersonalConstraint505); 

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
    // $ANTLR end "entryRulePersonalConstraint"


    // $ANTLR start "rulePersonalConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:1: rulePersonalConstraint returns [EObject current=null] : (otherlv_0= 'person' ( (lv_personName_1_0= RULE_ID ) ) otherlv_2= 'activity' ( (lv_activityName_3_0= RULE_ID ) ) otherlv_4= 'constraint' ( (lv_constraints_5_0= ruleConstraint ) )* ) ;
    public final EObject rulePersonalConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_personName_1_0=null;
        Token otherlv_2=null;
        Token lv_activityName_3_0=null;
        Token otherlv_4=null;
        EObject lv_constraints_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:28: ( (otherlv_0= 'person' ( (lv_personName_1_0= RULE_ID ) ) otherlv_2= 'activity' ( (lv_activityName_3_0= RULE_ID ) ) otherlv_4= 'constraint' ( (lv_constraints_5_0= ruleConstraint ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (otherlv_0= 'person' ( (lv_personName_1_0= RULE_ID ) ) otherlv_2= 'activity' ( (lv_activityName_3_0= RULE_ID ) ) otherlv_4= 'constraint' ( (lv_constraints_5_0= ruleConstraint ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (otherlv_0= 'person' ( (lv_personName_1_0= RULE_ID ) ) otherlv_2= 'activity' ( (lv_activityName_3_0= RULE_ID ) ) otherlv_4= 'constraint' ( (lv_constraints_5_0= ruleConstraint ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:3: otherlv_0= 'person' ( (lv_personName_1_0= RULE_ID ) ) otherlv_2= 'activity' ( (lv_activityName_3_0= RULE_ID ) ) otherlv_4= 'constraint' ( (lv_constraints_5_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePersonalConstraint542); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonalConstraintAccess().getPersonKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:1: ( (lv_personName_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:1: (lv_personName_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:1: (lv_personName_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:3: lv_personName_1_0= RULE_ID
            {
            lv_personName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersonalConstraint559); 

            			newLeafNode(lv_personName_1_0, grammarAccess.getPersonalConstraintAccess().getPersonNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"personName",
                    		lv_personName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePersonalConstraint576); 

                	newLeafNode(otherlv_2, grammarAccess.getPersonalConstraintAccess().getActivityKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:1: ( (lv_activityName_3_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_activityName_3_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_activityName_3_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:3: lv_activityName_3_0= RULE_ID
            {
            lv_activityName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersonalConstraint593); 

            			newLeafNode(lv_activityName_3_0, grammarAccess.getPersonalConstraintAccess().getActivityNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonalConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activityName",
                    		lv_activityName_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePersonalConstraint610); 

                	newLeafNode(otherlv_4, grammarAccess.getPersonalConstraintAccess().getConstraintKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: ( (lv_constraints_5_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_constraints_5_0= ruleConstraint )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:3: lv_constraints_5_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersonalConstraintAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_rulePersonalConstraint631);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersonalConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_5_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "rulePersonalConstraint"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint668);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint678); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: ruleConstraint returns [EObject current=null] : ( ( (lv_constraintName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_featureName_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_judgeFun_4_0= ruleJudgeFun ) ) otherlv_5= ',' ( (lv_threshold_6_0= ruleThreshold ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraintName_0_0=null;
        Token otherlv_1=null;
        Token lv_featureName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_judgeFun_4_0 = null;

        AntlrDatatypeRuleToken lv_threshold_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:28: ( ( ( (lv_constraintName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_featureName_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_judgeFun_4_0= ruleJudgeFun ) ) otherlv_5= ',' ( (lv_threshold_6_0= ruleThreshold ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: ( ( (lv_constraintName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_featureName_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_judgeFun_4_0= ruleJudgeFun ) ) otherlv_5= ',' ( (lv_threshold_6_0= ruleThreshold ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: ( ( (lv_constraintName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_featureName_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_judgeFun_4_0= ruleJudgeFun ) ) otherlv_5= ',' ( (lv_threshold_6_0= ruleThreshold ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:2: ( (lv_constraintName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_featureName_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_judgeFun_4_0= ruleJudgeFun ) ) otherlv_5= ',' ( (lv_threshold_6_0= ruleThreshold ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:2: ( (lv_constraintName_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: (lv_constraintName_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: (lv_constraintName_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:3: lv_constraintName_0_0= RULE_ID
            {
            lv_constraintName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint720); 

            			newLeafNode(lv_constraintName_0_0, grammarAccess.getConstraintAccess().getConstraintNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constraintName",
                    		lv_constraintName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleConstraint737); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:385:1: ( (lv_featureName_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:1: (lv_featureName_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:1: (lv_featureName_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:3: lv_featureName_2_0= RULE_ID
            {
            lv_featureName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint754); 

            			newLeafNode(lv_featureName_2_0, grammarAccess.getConstraintAccess().getFeatureNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConstraint771); 

                	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: ( (lv_judgeFun_4_0= ruleJudgeFun ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_judgeFun_4_0= ruleJudgeFun )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_judgeFun_4_0= ruleJudgeFun )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:3: lv_judgeFun_4_0= ruleJudgeFun
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getJudgeFunJudgeFunParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleJudgeFun_in_ruleConstraint792);
            lv_judgeFun_4_0=ruleJudgeFun();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"judgeFun",
                    		lv_judgeFun_4_0, 
                    		"JudgeFun");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleConstraint804); 

                	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: ( (lv_threshold_6_0= ruleThreshold ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_threshold_6_0= ruleThreshold )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_threshold_6_0= ruleThreshold )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:3: lv_threshold_6_0= ruleThreshold
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getThresholdThresholdParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleThreshold_in_ruleConstraint825);
            lv_threshold_6_0=ruleThreshold();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"threshold",
                    		lv_threshold_6_0, 
                    		"Threshold");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:457:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName862);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName873); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName913); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName932); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName947); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJudgeFun"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: entryRuleJudgeFun returns [String current=null] : iv_ruleJudgeFun= ruleJudgeFun EOF ;
    public final String entryRuleJudgeFun() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJudgeFun = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:2: (iv_ruleJudgeFun= ruleJudgeFun EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:2: iv_ruleJudgeFun= ruleJudgeFun EOF
            {
             newCompositeNode(grammarAccess.getJudgeFunRule()); 
            pushFollow(FOLLOW_ruleJudgeFun_in_entryRuleJudgeFun995);
            iv_ruleJudgeFun=ruleJudgeFun();

            state._fsp--;

             current =iv_ruleJudgeFun.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJudgeFun1006); 

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
    // $ANTLR end "entryRuleJudgeFun"


    // $ANTLR start "ruleJudgeFun"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: ruleJudgeFun returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | ( (kw= '<' | kw= '>' )? kw= '=' ) | kw= 'inRange' ) ;
    public final AntlrDatatypeRuleToken ruleJudgeFun() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:28: ( (kw= '<' | kw= '>' | ( (kw= '<' | kw= '>' )? kw= '=' ) | kw= 'inRange' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: (kw= '<' | kw= '>' | ( (kw= '<' | kw= '>' )? kw= '=' ) | kw= 'inRange' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: (kw= '<' | kw= '>' | ( (kw= '<' | kw= '>' )? kw= '=' ) | kw= 'inRange' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    alt7=3;
                }
                else if ( (LA7_1==EOF||LA7_1==19) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||LA7_2==19) ) {
                    alt7=2;
                }
                else if ( (LA7_2==23) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleJudgeFun1044); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJudgeFunAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:2: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleJudgeFun1063); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJudgeFunAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:6: ( (kw= '<' | kw= '>' )? kw= '=' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:6: ( (kw= '<' | kw= '>' )? kw= '=' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:7: (kw= '<' | kw= '>' )? kw= '='
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:7: (kw= '<' | kw= '>' )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:2: kw= '<'
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleJudgeFun1084); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getJudgeFunAccess().getLessThanSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:2: kw= '>'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleJudgeFun1103); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getJudgeFunAccess().getGreaterThanSignKeyword_2_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,23,FOLLOW_23_in_ruleJudgeFun1118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJudgeFunAccess().getEqualsSignKeyword_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:2: kw= 'inRange'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleJudgeFun1138); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJudgeFunAccess().getInRangeKeyword_3()); 
                        

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
    // $ANTLR end "ruleJudgeFun"


    // $ANTLR start "entryRuleThreshold"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: entryRuleThreshold returns [String current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final String entryRuleThreshold() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThreshold = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: (iv_ruleThreshold= ruleThreshold EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_ruleThreshold_in_entryRuleThreshold1179);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThreshold1190); 

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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: ruleThreshold returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleThreshold() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Float_0 = null;

        AntlrDatatypeRuleToken this_Float_3 = null;

        AntlrDatatypeRuleToken this_Float_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:28: ( (this_Float_0= ruleFloat | ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:1: (this_Float_0= ruleFloat | ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:570:1: (this_Float_0= ruleFloat | ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==20||(LA10_0>=29 && LA10_0<=30)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:5: this_Float_0= ruleFloat
                    {
                     
                            newCompositeNode(grammarAccess.getThresholdAccess().getFloatParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleThreshold1237);
                    this_Float_0=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:6: ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:6: ( (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:7: (kw= '[' | kw= '(' ) this_Float_3= ruleFloat kw= ',' this_Float_5= ruleFloat (kw= ')' | kw= ']' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:7: (kw= '[' | kw= '(' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==25) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==26) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:2: kw= '['
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleThreshold1263); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getThresholdAccess().getLeftSquareBracketKeyword_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:2: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleThreshold1282); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getThresholdAccess().getLeftParenthesisKeyword_1_0_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getThresholdAccess().getFloatParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleThreshold1305);
                    this_Float_3=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleThreshold1323); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getThresholdAccess().getCommaKeyword_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getThresholdAccess().getFloatParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleFloat_in_ruleThreshold1345);
                    this_Float_5=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: (kw= ')' | kw= ']' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==28) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleThreshold1364); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getThresholdAccess().getRightParenthesisKeyword_1_4_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:2: kw= ']'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleThreshold1383); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getThresholdAccess().getRightSquareBracketKeyword_1_4_1()); 
                                

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleFloat"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:2: (iv_ruleFloat= ruleFloat EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat1426);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat1437); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:28: ( ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: ( (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:2: (kw= '+' | kw= '-' )? ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:2: (kw= '+' | kw= '-' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFloat1476); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:665:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFloat1495); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:3: ( (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) | (kw= '.' this_INT_6= RULE_INT ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:4: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:4: (this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:9: this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat1514); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_0_0()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:1: (kw= '.' this_INT_4= RULE_INT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:678:2: kw= '.' this_INT_4= RULE_INT
                            {
                            kw=(Token)match(input,20,FOLLOW_20_in_ruleFloat1533); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_1_0()); 
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat1548); 

                            		current.merge(this_INT_4);
                                
                             
                                newLeafNode(this_INT_4, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:6: (kw= '.' this_INT_6= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:6: (kw= '.' this_INT_6= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:2: kw= '.' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleFloat1576); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_1_0()); 
                        
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat1591); 

                    		current.merge(this_INT_6);
                        
                     
                        newLeafNode(this_INT_6, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDomainModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainModel143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainModel155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomainModel167 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_ruleConstraintType_in_ruleDomainModel188 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_14_in_ruleDomainModel201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_entryRuleConstraintType237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultConstraint_in_ruleConstraintType293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersonalConstraint_in_ruleConstraintType320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultConstraint_in_entryRuleDefaultConstraint356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultConstraint366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefaultConstraint403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultConstraint420 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultConstraint437 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleDefaultConstraint458 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePersonalConstraint_in_entryRulePersonalConstraint495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersonalConstraint505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePersonalConstraint542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersonalConstraint559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePersonalConstraint576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersonalConstraint593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePersonalConstraint610 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_rulePersonalConstraint631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint720 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint771 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleJudgeFun_in_ruleConstraint792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint804 = new BitSet(new long[]{0x0000000066100020L});
    public static final BitSet FOLLOW_ruleThreshold_in_ruleConstraint825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName913 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName947 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleJudgeFun_in_entryRuleJudgeFun995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJudgeFun1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJudgeFun1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJudgeFun1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJudgeFun1084 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleJudgeFun1103 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleJudgeFun1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJudgeFun1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThreshold_in_entryRuleThreshold1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThreshold1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleThreshold1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleThreshold1263 = new BitSet(new long[]{0x0000000060100020L});
    public static final BitSet FOLLOW_26_in_ruleThreshold1282 = new BitSet(new long[]{0x0000000060100020L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleThreshold1305 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleThreshold1323 = new BitSet(new long[]{0x0000000060100020L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleThreshold1345 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleThreshold1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleThreshold1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFloat1476 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_30_in_ruleFloat1495 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat1514 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFloat1533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFloat1576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat1591 = new BitSet(new long[]{0x0000000000000002L});

}