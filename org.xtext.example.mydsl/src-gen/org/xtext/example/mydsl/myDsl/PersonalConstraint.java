/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPersonalConstraint()
 * @model
 * @generated
 */
public interface PersonalConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Person Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person Name</em>' attribute.
   * @see #setPersonName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPersonalConstraint_PersonName()
   * @model
   * @generated
   */
  String getPersonName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getPersonName <em>Person Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person Name</em>' attribute.
   * @see #getPersonName()
   * @generated
   */
  void setPersonName(String value);

  /**
   * Returns the value of the '<em><b>Activity Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Name</em>' attribute.
   * @see #setActivityName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPersonalConstraint_ActivityName()
   * @model
   * @generated
   */
  String getActivityName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getActivityName <em>Activity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity Name</em>' attribute.
   * @see #getActivityName()
   * @generated
   */
  void setActivityName(String value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPersonalConstraint_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // PersonalConstraint
