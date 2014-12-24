/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constraint#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constraint#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constraint#getJudgeFun <em>Judge Fun</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Constraint#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Name</em>' attribute.
   * @see #setConstraintName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraint_ConstraintName()
   * @model
   * @generated
   */
  String getConstraintName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constraint#getConstraintName <em>Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Name</em>' attribute.
   * @see #getConstraintName()
   * @generated
   */
  void setConstraintName(String value);

  /**
   * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Name</em>' attribute.
   * @see #setFeatureName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraint_FeatureName()
   * @model
   * @generated
   */
  String getFeatureName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constraint#getFeatureName <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Name</em>' attribute.
   * @see #getFeatureName()
   * @generated
   */
  void setFeatureName(String value);

  /**
   * Returns the value of the '<em><b>Judge Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Judge Fun</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Judge Fun</em>' attribute.
   * @see #setJudgeFun(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraint_JudgeFun()
   * @model
   * @generated
   */
  String getJudgeFun();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constraint#getJudgeFun <em>Judge Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Judge Fun</em>' attribute.
   * @see #getJudgeFun()
   * @generated
   */
  void setJudgeFun(String value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraint_Threshold()
   * @model
   * @generated
   */
  String getThreshold();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Constraint#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(String value);

} // Constraint
