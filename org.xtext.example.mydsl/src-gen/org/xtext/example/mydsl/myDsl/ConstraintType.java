/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConstraintType#getD <em>D</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConstraintType#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraintType()
 * @model
 * @generated
 */
public interface ConstraintType extends EObject
{
  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(DefaultConstraint)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraintType_D()
   * @model containment="true"
   * @generated
   */
  DefaultConstraint getD();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConstraintType#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(DefaultConstraint value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(PersonalConstraint)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstraintType_P()
   * @model containment="true"
   * @generated
   */
  PersonalConstraint getP();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConstraintType#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(PersonalConstraint value);

} // ConstraintType
