/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConstraintTypeImpl <em>Constraint Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConstraintTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 1;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_TYPE__D = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_TYPE__P = 1;

  /**
   * The number of structural features of the '<em>Constraint Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DefaultConstraintImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultConstraint()
   * @generated
   */
  int DEFAULT_CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Activity Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CONSTRAINT__ACTIVITY_NAME = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CONSTRAINT__CONSTRAINTS = 1;

  /**
   * The number of structural features of the '<em>Default Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl <em>Personal Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPersonalConstraint()
   * @generated
   */
  int PERSONAL_CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Person Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_CONSTRAINT__PERSON_NAME = 0;

  /**
   * The feature id for the '<em><b>Activity Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_CONSTRAINT__ACTIVITY_NAME = 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_CONSTRAINT__CONSTRAINTS = 2;

  /**
   * The number of structural features of the '<em>Personal Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONAL_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConstraintImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 4;

  /**
   * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONSTRAINT_NAME = 0;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__FEATURE_NAME = 1;

  /**
   * The feature id for the '<em><b>Judge Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__JUDGE_FUN = 2;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__THRESHOLD = 3;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DomainModel#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel#getPackageName()
   * @see #getDomainModel()
   * @generated
   */
  EAttribute getDomainModel_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConstraintType
   * @generated
   */
  EClass getConstraintType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ConstraintType#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConstraintType#getD()
   * @see #getConstraintType()
   * @generated
   */
  EReference getConstraintType_D();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ConstraintType#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConstraintType#getP()
   * @see #getConstraintType()
   * @generated
   */
  EReference getConstraintType_P();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DefaultConstraint <em>Default Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Constraint</em>'.
   * @see org.xtext.example.mydsl.myDsl.DefaultConstraint
   * @generated
   */
  EClass getDefaultConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DefaultConstraint#getActivityName <em>Activity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Activity Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.DefaultConstraint#getActivityName()
   * @see #getDefaultConstraint()
   * @generated
   */
  EAttribute getDefaultConstraint_ActivityName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.DefaultConstraint#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.xtext.example.mydsl.myDsl.DefaultConstraint#getConstraints()
   * @see #getDefaultConstraint()
   * @generated
   */
  EReference getDefaultConstraint_Constraints();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint <em>Personal Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal Constraint</em>'.
   * @see org.xtext.example.mydsl.myDsl.PersonalConstraint
   * @generated
   */
  EClass getPersonalConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getPersonName <em>Person Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Person Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.PersonalConstraint#getPersonName()
   * @see #getPersonalConstraint()
   * @generated
   */
  EAttribute getPersonalConstraint_PersonName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getActivityName <em>Activity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Activity Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.PersonalConstraint#getActivityName()
   * @see #getPersonalConstraint()
   * @generated
   */
  EAttribute getPersonalConstraint_ActivityName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.PersonalConstraint#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see org.xtext.example.mydsl.myDsl.PersonalConstraint#getConstraints()
   * @see #getPersonalConstraint()
   * @generated
   */
  EReference getPersonalConstraint_Constraints();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constraint#getConstraintName <em>Constraint Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constraint#getConstraintName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_ConstraintName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constraint#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constraint#getFeatureName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_FeatureName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constraint#getJudgeFun <em>Judge Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Judge Fun</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constraint#getJudgeFun()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_JudgeFun();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constraint#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constraint#getThreshold()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Threshold();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DomainModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_MODEL__PACKAGE_NAME = eINSTANCE.getDomainModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConstraintTypeImpl <em>Constraint Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConstraintTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstraintType()
     * @generated
     */
    EClass CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_TYPE__D = eINSTANCE.getConstraintType_D();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_TYPE__P = eINSTANCE.getConstraintType_P();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DefaultConstraintImpl <em>Default Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DefaultConstraintImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultConstraint()
     * @generated
     */
    EClass DEFAULT_CONSTRAINT = eINSTANCE.getDefaultConstraint();

    /**
     * The meta object literal for the '<em><b>Activity Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_CONSTRAINT__ACTIVITY_NAME = eINSTANCE.getDefaultConstraint_ActivityName();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_CONSTRAINT__CONSTRAINTS = eINSTANCE.getDefaultConstraint_Constraints();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl <em>Personal Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PersonalConstraintImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPersonalConstraint()
     * @generated
     */
    EClass PERSONAL_CONSTRAINT = eINSTANCE.getPersonalConstraint();

    /**
     * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSONAL_CONSTRAINT__PERSON_NAME = eINSTANCE.getPersonalConstraint_PersonName();

    /**
     * The meta object literal for the '<em><b>Activity Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSONAL_CONSTRAINT__ACTIVITY_NAME = eINSTANCE.getPersonalConstraint_ActivityName();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONAL_CONSTRAINT__CONSTRAINTS = eINSTANCE.getPersonalConstraint_Constraints();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConstraintImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getConstraint_ConstraintName();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__FEATURE_NAME = eINSTANCE.getConstraint_FeatureName();

    /**
     * The meta object literal for the '<em><b>Judge Fun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__JUDGE_FUN = eINSTANCE.getConstraint_JudgeFun();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__THRESHOLD = eINSTANCE.getConstraint_Threshold();

  }

} //MyDslPackage
