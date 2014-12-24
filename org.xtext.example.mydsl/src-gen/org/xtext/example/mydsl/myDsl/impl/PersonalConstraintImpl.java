/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PersonalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalConstraintImpl extends MinimalEObjectImpl.Container implements PersonalConstraint
{
  /**
   * The default value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonName()
   * @generated
   * @ordered
   */
  protected static final String PERSON_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonName()
   * @generated
   * @ordered
   */
  protected String personName = PERSON_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityName()
   * @generated
   * @ordered
   */
  protected static final String ACTIVITY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityName()
   * @generated
   * @ordered
   */
  protected String activityName = ACTIVITY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonalConstraintImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.PERSONAL_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonName()
  {
    return personName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonName(String newPersonName)
  {
    String oldPersonName = personName;
    personName = newPersonName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PERSONAL_CONSTRAINT__PERSON_NAME, oldPersonName, personName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActivityName()
  {
    return activityName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivityName(String newActivityName)
  {
    String oldActivityName = activityName;
    activityName = newActivityName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PERSONAL_CONSTRAINT__ACTIVITY_NAME, oldActivityName, activityName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.PERSONAL_CONSTRAINT__PERSON_NAME:
        return getPersonName();
      case MyDslPackage.PERSONAL_CONSTRAINT__ACTIVITY_NAME:
        return getActivityName();
      case MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS:
        return getConstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PERSONAL_CONSTRAINT__PERSON_NAME:
        setPersonName((String)newValue);
        return;
      case MyDslPackage.PERSONAL_CONSTRAINT__ACTIVITY_NAME:
        setActivityName((String)newValue);
        return;
      case MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.PERSONAL_CONSTRAINT__PERSON_NAME:
        setPersonName(PERSON_NAME_EDEFAULT);
        return;
      case MyDslPackage.PERSONAL_CONSTRAINT__ACTIVITY_NAME:
        setActivityName(ACTIVITY_NAME_EDEFAULT);
        return;
      case MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS:
        getConstraints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.PERSONAL_CONSTRAINT__PERSON_NAME:
        return PERSON_NAME_EDEFAULT == null ? personName != null : !PERSON_NAME_EDEFAULT.equals(personName);
      case MyDslPackage.PERSONAL_CONSTRAINT__ACTIVITY_NAME:
        return ACTIVITY_NAME_EDEFAULT == null ? activityName != null : !ACTIVITY_NAME_EDEFAULT.equals(activityName);
      case MyDslPackage.PERSONAL_CONSTRAINT__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (personName: ");
    result.append(personName);
    result.append(", activityName: ");
    result.append(activityName);
    result.append(')');
    return result.toString();
  }

} //PersonalConstraintImpl
