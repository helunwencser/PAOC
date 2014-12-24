package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.ConstraintType;
import org.xtext.example.mydsl.myDsl.DefaultConstraint;
import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PersonalConstraint;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CONSTRAINT_TYPE:
				if(context == grammarAccess.getConstraintTypeRule()) {
					sequence_ConstraintType(context, (ConstraintType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DEFAULT_CONSTRAINT:
				if(context == grammarAccess.getDefaultConstraintRule()) {
					sequence_DefaultConstraint(context, (DefaultConstraint) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PERSONAL_CONSTRAINT:
				if(context == grammarAccess.getPersonalConstraintRule()) {
					sequence_PersonalConstraint(context, (PersonalConstraint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (d=DefaultConstraint | p=PersonalConstraint)
	 */
	protected void sequence_ConstraintType(EObject context, ConstraintType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraintName=ID featureName=ID judgeFun=JudgeFun threshold=Threshold)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT__CONSTRAINT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT__CONSTRAINT_NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT__FEATURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT__FEATURE_NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT__JUDGE_FUN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT__JUDGE_FUN));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONSTRAINT__THRESHOLD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONSTRAINT__THRESHOLD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getConstraintNameIDTerminalRuleCall_0_0(), semanticObject.getConstraintName());
		feeder.accept(grammarAccess.getConstraintAccess().getFeatureNameIDTerminalRuleCall_2_0(), semanticObject.getFeatureName());
		feeder.accept(grammarAccess.getConstraintAccess().getJudgeFunJudgeFunParserRuleCall_4_0(), semanticObject.getJudgeFun());
		feeder.accept(grammarAccess.getConstraintAccess().getThresholdThresholdParserRuleCall_6_0(), semanticObject.getThreshold());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (activityName=ID constraints+=Constraint*)
	 */
	protected void sequence_DefaultConstraint(EObject context, DefaultConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName elements+=ConstraintType*)
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (personName=ID activityName=ID constraints+=Constraint*)
	 */
	protected void sequence_PersonalConstraint(EObject context, PersonalConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
