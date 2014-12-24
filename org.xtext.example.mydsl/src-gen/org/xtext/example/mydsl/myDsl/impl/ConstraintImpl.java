/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Constraint;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl#getJudgeFun <em>Judge Fun</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintName()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintName()
   * @generated
   * @ordered
   */
  protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureName()
   * @generated
   * @ordered
   */
  protected String featureName = FEATURE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getJudgeFun() <em>Judge Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgeFun()
   * @generated
   * @ordered
   */
  protected static final String JUDGE_FUN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJudgeFun() <em>Judge Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgeFun()
   * @generated
   * @ordered
   */
  protected String judgeFun = JUDGE_FUN_EDEFAULT;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final String THRESHOLD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected String threshold = THRESHOLD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return MyDslPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraintName()
  {
    return constraintName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintName(String newConstraintName)
  {
    String oldConstraintName = constraintName;
    constraintName = newConstraintName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT__CONSTRAINT_NAME, oldConstraintName, constraintName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeatureName()
  {
    return featureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureName(String newFeatureName)
  {
    String oldFeatureName = featureName;
    featureName = newFeatureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT__FEATURE_NAME, oldFeatureName, featureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJudgeFun()
  {
    return judgeFun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJudgeFun(String newJudgeFun)
  {
    String oldJudgeFun = judgeFun;
    judgeFun = newJudgeFun;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT__JUDGE_FUN, oldJudgeFun, judgeFun));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(String newThreshold)
  {
    String oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRAINT__THRESHOLD, oldThreshold, threshold));
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
      case MyDslPackage.CONSTRAINT__CONSTRAINT_NAME:
        return getConstraintName();
      case MyDslPackage.CONSTRAINT__FEATURE_NAME:
        return getFeatureName();
      case MyDslPackage.CONSTRAINT__JUDGE_FUN:
        return getJudgeFun();
      case MyDslPackage.CONSTRAINT__THRESHOLD:
        return getThreshold();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CONSTRAINT__CONSTRAINT_NAME:
        setConstraintName((String)newValue);
        return;
      case MyDslPackage.CONSTRAINT__FEATURE_NAME:
        setFeatureName((String)newValue);
        return;
      case MyDslPackage.CONSTRAINT__JUDGE_FUN:
        setJudgeFun((String)newValue);
        return;
      case MyDslPackage.CONSTRAINT__THRESHOLD:
        setThreshold((String)newValue);
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
      case MyDslPackage.CONSTRAINT__CONSTRAINT_NAME:
        setConstraintName(CONSTRAINT_NAME_EDEFAULT);
        return;
      case MyDslPackage.CONSTRAINT__FEATURE_NAME:
        setFeatureName(FEATURE_NAME_EDEFAULT);
        return;
      case MyDslPackage.CONSTRAINT__JUDGE_FUN:
        setJudgeFun(JUDGE_FUN_EDEFAULT);
        return;
      case MyDslPackage.CONSTRAINT__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
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
      case MyDslPackage.CONSTRAINT__CONSTRAINT_NAME:
        return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
      case MyDslPackage.CONSTRAINT__FEATURE_NAME:
        return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
      case MyDslPackage.CONSTRAINT__JUDGE_FUN:
        return JUDGE_FUN_EDEFAULT == null ? judgeFun != null : !JUDGE_FUN_EDEFAULT.equals(judgeFun);
      case MyDslPackage.CONSTRAINT__THRESHOLD:
        return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
    result.append(" (constraintName: ");
    result.append(constraintName);
    result.append(", featureName: ");
    result.append(featureName);
    result.append(", judgeFun: ");
    result.append(judgeFun);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
