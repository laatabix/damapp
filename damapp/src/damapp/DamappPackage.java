/**
 */
package damapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see damapp.DamappFactory
 * @model kind="package"
 * @generated
 */
public interface DamappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "damapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/damapp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "damapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DamappPackage eINSTANCE = damapp.impl.DamappPackageImpl.init();

	/**
	 * The meta object id for the '{@link damapp.impl.DamappEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.DamappEntityImpl
	 * @see damapp.impl.DamappPackageImpl#getDamappEntity()
	 * @generated
	 */
	int DAMAPP_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_ENTITY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link damapp.impl.DataEntityImpl <em>Data Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.DataEntityImpl
	 * @see damapp.impl.DamappPackageImpl#getDataEntity()
	 * @generated
	 */
	int DATA_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__ATTRIBUTES = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__OPERATIONS = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__USES = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.AgentEntityImpl <em>Agent Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.AgentEntityImpl
	 * @see damapp.impl.DamappPackageImpl#getAgentEntity()
	 * @generated
	 */
	int AGENT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Statevariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__STATEVARIABLES = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mydataentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__MYDATAENTITY = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__BEHAVIORS = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__INTERACTS = DAMAPP_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aemydatapatterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY__AEMYDATAPATTERNS = DAMAPP_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Agent Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Agent Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ENTITY_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.DamappModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.DamappModelImpl
	 * @see damapp.impl.DamappPackageImpl#getDamappModel()
	 * @generated
	 */
	int DAMAPP_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agententities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__AGENTENTITIES = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__DATAENTITIES = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__VERSION = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__TRANSFORMATIONS = DAMAPP_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Theoricpatterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__THEORICPATTERNS = DAMAPP_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datapatterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL__DATAPATTERNS = DAMAPP_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAPP_MODEL_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.AttributeImpl
	 * @see damapp.impl.DamappPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.StateVariableImpl
	 * @see damapp.impl.DamappPackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Myattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__MYATTRIBUTE = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__TYPE = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Svmydatapatterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__SVMYDATAPATTERNS = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.TransformationImpl
	 * @see damapp.impl.DamappPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transattributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSATTRIBUTES = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resultsv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RESULTSV = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CODE = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TYPE = DAMAPP_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.OperationImpl
	 * @see damapp.impl.DamappPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.BehaviorImpl
	 * @see damapp.impl.DamappPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Myoperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MYOPERATION = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mypatterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MYPATTERNS = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.PatternImpl
	 * @see damapp.impl.DamappPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = DAMAPP_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DESCRIPTION = DAMAPP_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__TEXT = DAMAPP_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = DAMAPP_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = DAMAPP_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.DataPatternImpl <em>Data Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.DataPatternImpl
	 * @see damapp.impl.DamappPackageImpl#getDataPattern()
	 * @generated
	 */
	int DATA_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN__NAME = PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN__DESCRIPTION = PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN__TEXT = PATTERN__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN__TYPE = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.impl.TheoricPatternImpl <em>Theoric Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.impl.TheoricPatternImpl
	 * @see damapp.impl.DamappPackageImpl#getTheoricPattern()
	 * @generated
	 */
	int THEORIC_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN__NAME = PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN__DESCRIPTION = PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN__TEXT = PATTERN__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN__TYPE = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Theoric Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Theoric Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORIC_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link damapp.TheoricPatternType <em>Theoric Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.TheoricPatternType
	 * @see damapp.impl.DamappPackageImpl#getTheoricPatternType()
	 * @generated
	 */
	int THEORIC_PATTERN_TYPE = 12;

	/**
	 * The meta object id for the '{@link damapp.DataPatternType <em>Data Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see damapp.DataPatternType
	 * @see damapp.impl.DamappPackageImpl#getDataPatternType()
	 * @generated
	 */
	int DATA_PATTERN_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link damapp.DataEntity <em>Data Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entity</em>'.
	 * @see damapp.DataEntity
	 * @generated
	 */
	EClass getDataEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DataEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see damapp.DataEntity#getAttributes()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DataEntity#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see damapp.DataEntity#getOperations()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_Operations();

	/**
	 * Returns the meta object for the reference list '{@link damapp.DataEntity#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see damapp.DataEntity#getUses()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_Uses();

	/**
	 * Returns the meta object for class '{@link damapp.AgentEntity <em>Agent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Entity</em>'.
	 * @see damapp.AgentEntity
	 * @generated
	 */
	EClass getAgentEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.AgentEntity#getStatevariables <em>Statevariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statevariables</em>'.
	 * @see damapp.AgentEntity#getStatevariables()
	 * @see #getAgentEntity()
	 * @generated
	 */
	EReference getAgentEntity_Statevariables();

	/**
	 * Returns the meta object for the reference '{@link damapp.AgentEntity#getMydataentity <em>Mydataentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mydataentity</em>'.
	 * @see damapp.AgentEntity#getMydataentity()
	 * @see #getAgentEntity()
	 * @generated
	 */
	EReference getAgentEntity_Mydataentity();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.AgentEntity#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see damapp.AgentEntity#getBehaviors()
	 * @see #getAgentEntity()
	 * @generated
	 */
	EReference getAgentEntity_Behaviors();

	/**
	 * Returns the meta object for the reference list '{@link damapp.AgentEntity#getInteracts <em>Interacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interacts</em>'.
	 * @see damapp.AgentEntity#getInteracts()
	 * @see #getAgentEntity()
	 * @generated
	 */
	EReference getAgentEntity_Interacts();

	/**
	 * Returns the meta object for the reference list '{@link damapp.AgentEntity#getAemydatapatterns <em>Aemydatapatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aemydatapatterns</em>'.
	 * @see damapp.AgentEntity#getAemydatapatterns()
	 * @see #getAgentEntity()
	 * @generated
	 */
	EReference getAgentEntity_Aemydatapatterns();

	/**
	 * Returns the meta object for class '{@link damapp.DamappModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see damapp.DamappModel
	 * @generated
	 */
	EClass getDamappModel();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DamappModel#getAgententities <em>Agententities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agententities</em>'.
	 * @see damapp.DamappModel#getAgententities()
	 * @see #getDamappModel()
	 * @generated
	 */
	EReference getDamappModel_Agententities();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DamappModel#getDataentities <em>Dataentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataentities</em>'.
	 * @see damapp.DamappModel#getDataentities()
	 * @see #getDamappModel()
	 * @generated
	 */
	EReference getDamappModel_Dataentities();

	/**
	 * Returns the meta object for the attribute '{@link damapp.DamappModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see damapp.DamappModel#getVersion()
	 * @see #getDamappModel()
	 * @generated
	 */
	EAttribute getDamappModel_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DamappModel#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see damapp.DamappModel#getTransformations()
	 * @see #getDamappModel()
	 * @generated
	 */
	EReference getDamappModel_Transformations();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DamappModel#getTheoricpatterns <em>Theoricpatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theoricpatterns</em>'.
	 * @see damapp.DamappModel#getTheoricpatterns()
	 * @see #getDamappModel()
	 * @generated
	 */
	EReference getDamappModel_Theoricpatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link damapp.DamappModel#getDatapatterns <em>Datapatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datapatterns</em>'.
	 * @see damapp.DamappModel#getDatapatterns()
	 * @see #getDamappModel()
	 * @generated
	 */
	EReference getDamappModel_Datapatterns();

	/**
	 * Returns the meta object for class '{@link damapp.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see damapp.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link damapp.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see damapp.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link damapp.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see damapp.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the reference '{@link damapp.StateVariable#getMyattribute <em>Myattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Myattribute</em>'.
	 * @see damapp.StateVariable#getMyattribute()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Myattribute();

	/**
	 * Returns the meta object for the attribute '{@link damapp.StateVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see damapp.StateVariable#getType()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Type();

	/**
	 * Returns the meta object for the reference list '{@link damapp.StateVariable#getSvmydatapatterns <em>Svmydatapatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Svmydatapatterns</em>'.
	 * @see damapp.StateVariable#getSvmydatapatterns()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Svmydatapatterns();

	/**
	 * Returns the meta object for class '{@link damapp.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see damapp.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference list '{@link damapp.Transformation#getTransattributes <em>Transattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transattributes</em>'.
	 * @see damapp.Transformation#getTransattributes()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Transattributes();

	/**
	 * Returns the meta object for the reference '{@link damapp.Transformation#getResultsv <em>Resultsv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resultsv</em>'.
	 * @see damapp.Transformation#getResultsv()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Resultsv();

	/**
	 * Returns the meta object for the attribute '{@link damapp.Transformation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see damapp.Transformation#getCode()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Code();

	/**
	 * Returns the meta object for the attribute '{@link damapp.Transformation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see damapp.Transformation#getType()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Type();

	/**
	 * Returns the meta object for class '{@link damapp.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see damapp.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link damapp.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see damapp.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link damapp.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see damapp.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link damapp.Behavior#getMyoperation <em>Myoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Myoperation</em>'.
	 * @see damapp.Behavior#getMyoperation()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Myoperation();

	/**
	 * Returns the meta object for the reference list '{@link damapp.Behavior#getMypatterns <em>Mypatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mypatterns</em>'.
	 * @see damapp.Behavior#getMypatterns()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Mypatterns();

	/**
	 * Returns the meta object for class '{@link damapp.DamappEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see damapp.DamappEntity
	 * @generated
	 */
	EClass getDamappEntity();

	/**
	 * Returns the meta object for the attribute '{@link damapp.DamappEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see damapp.DamappEntity#getName()
	 * @see #getDamappEntity()
	 * @generated
	 */
	EAttribute getDamappEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link damapp.DamappEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see damapp.DamappEntity#getDescription()
	 * @see #getDamappEntity()
	 * @generated
	 */
	EAttribute getDamappEntity_Description();

	/**
	 * Returns the meta object for class '{@link damapp.DataPattern <em>Data Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pattern</em>'.
	 * @see damapp.DataPattern
	 * @generated
	 */
	EClass getDataPattern();

	/**
	 * Returns the meta object for the attribute '{@link damapp.DataPattern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see damapp.DataPattern#getType()
	 * @see #getDataPattern()
	 * @generated
	 */
	EAttribute getDataPattern_Type();

	/**
	 * Returns the meta object for class '{@link damapp.TheoricPattern <em>Theoric Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theoric Pattern</em>'.
	 * @see damapp.TheoricPattern
	 * @generated
	 */
	EClass getTheoricPattern();

	/**
	 * Returns the meta object for the attribute '{@link damapp.TheoricPattern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see damapp.TheoricPattern#getType()
	 * @see #getTheoricPattern()
	 * @generated
	 */
	EAttribute getTheoricPattern_Type();

	/**
	 * Returns the meta object for class '{@link damapp.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see damapp.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link damapp.Pattern#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see damapp.Pattern#getText()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Text();

	/**
	 * Returns the meta object for enum '{@link damapp.TheoricPatternType <em>Theoric Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Theoric Pattern Type</em>'.
	 * @see damapp.TheoricPatternType
	 * @generated
	 */
	EEnum getTheoricPatternType();

	/**
	 * Returns the meta object for enum '{@link damapp.DataPatternType <em>Data Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Pattern Type</em>'.
	 * @see damapp.DataPatternType
	 * @generated
	 */
	EEnum getDataPatternType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DamappFactory getDamappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link damapp.impl.DataEntityImpl <em>Data Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.DataEntityImpl
		 * @see damapp.impl.DamappPackageImpl#getDataEntity()
		 * @generated
		 */
		EClass DATA_ENTITY = eINSTANCE.getDataEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__ATTRIBUTES = eINSTANCE.getDataEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__OPERATIONS = eINSTANCE.getDataEntity_Operations();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__USES = eINSTANCE.getDataEntity_Uses();

		/**
		 * The meta object literal for the '{@link damapp.impl.AgentEntityImpl <em>Agent Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.AgentEntityImpl
		 * @see damapp.impl.DamappPackageImpl#getAgentEntity()
		 * @generated
		 */
		EClass AGENT_ENTITY = eINSTANCE.getAgentEntity();

		/**
		 * The meta object literal for the '<em><b>Statevariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ENTITY__STATEVARIABLES = eINSTANCE.getAgentEntity_Statevariables();

		/**
		 * The meta object literal for the '<em><b>Mydataentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ENTITY__MYDATAENTITY = eINSTANCE.getAgentEntity_Mydataentity();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ENTITY__BEHAVIORS = eINSTANCE.getAgentEntity_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Interacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ENTITY__INTERACTS = eINSTANCE.getAgentEntity_Interacts();

		/**
		 * The meta object literal for the '<em><b>Aemydatapatterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ENTITY__AEMYDATAPATTERNS = eINSTANCE.getAgentEntity_Aemydatapatterns();

		/**
		 * The meta object literal for the '{@link damapp.impl.DamappModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.DamappModelImpl
		 * @see damapp.impl.DamappPackageImpl#getDamappModel()
		 * @generated
		 */
		EClass DAMAPP_MODEL = eINSTANCE.getDamappModel();

		/**
		 * The meta object literal for the '<em><b>Agententities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAMAPP_MODEL__AGENTENTITIES = eINSTANCE.getDamappModel_Agententities();

		/**
		 * The meta object literal for the '<em><b>Dataentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAMAPP_MODEL__DATAENTITIES = eINSTANCE.getDamappModel_Dataentities();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAMAPP_MODEL__VERSION = eINSTANCE.getDamappModel_Version();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAMAPP_MODEL__TRANSFORMATIONS = eINSTANCE.getDamappModel_Transformations();

		/**
		 * The meta object literal for the '<em><b>Theoricpatterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAMAPP_MODEL__THEORICPATTERNS = eINSTANCE.getDamappModel_Theoricpatterns();

		/**
		 * The meta object literal for the '<em><b>Datapatterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAMAPP_MODEL__DATAPATTERNS = eINSTANCE.getDamappModel_Datapatterns();

		/**
		 * The meta object literal for the '{@link damapp.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.AttributeImpl
		 * @see damapp.impl.DamappPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link damapp.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.StateVariableImpl
		 * @see damapp.impl.DamappPackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '<em><b>Myattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__MYATTRIBUTE = eINSTANCE.getStateVariable_Myattribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__TYPE = eINSTANCE.getStateVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Svmydatapatterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__SVMYDATAPATTERNS = eINSTANCE.getStateVariable_Svmydatapatterns();

		/**
		 * The meta object literal for the '{@link damapp.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.TransformationImpl
		 * @see damapp.impl.DamappPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Transattributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TRANSATTRIBUTES = eINSTANCE.getTransformation_Transattributes();

		/**
		 * The meta object literal for the '<em><b>Resultsv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RESULTSV = eINSTANCE.getTransformation_Resultsv();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__CODE = eINSTANCE.getTransformation_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TYPE = eINSTANCE.getTransformation_Type();

		/**
		 * The meta object literal for the '{@link damapp.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.OperationImpl
		 * @see damapp.impl.DamappPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link damapp.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.BehaviorImpl
		 * @see damapp.impl.DamappPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Myoperation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__MYOPERATION = eINSTANCE.getBehavior_Myoperation();

		/**
		 * The meta object literal for the '<em><b>Mypatterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__MYPATTERNS = eINSTANCE.getBehavior_Mypatterns();

		/**
		 * The meta object literal for the '{@link damapp.impl.DamappEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.DamappEntityImpl
		 * @see damapp.impl.DamappPackageImpl#getDamappEntity()
		 * @generated
		 */
		EClass DAMAPP_ENTITY = eINSTANCE.getDamappEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAMAPP_ENTITY__NAME = eINSTANCE.getDamappEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAMAPP_ENTITY__DESCRIPTION = eINSTANCE.getDamappEntity_Description();

		/**
		 * The meta object literal for the '{@link damapp.impl.DataPatternImpl <em>Data Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.DataPatternImpl
		 * @see damapp.impl.DamappPackageImpl#getDataPattern()
		 * @generated
		 */
		EClass DATA_PATTERN = eINSTANCE.getDataPattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PATTERN__TYPE = eINSTANCE.getDataPattern_Type();

		/**
		 * The meta object literal for the '{@link damapp.impl.TheoricPatternImpl <em>Theoric Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.TheoricPatternImpl
		 * @see damapp.impl.DamappPackageImpl#getTheoricPattern()
		 * @generated
		 */
		EClass THEORIC_PATTERN = eINSTANCE.getTheoricPattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEORIC_PATTERN__TYPE = eINSTANCE.getTheoricPattern_Type();

		/**
		 * The meta object literal for the '{@link damapp.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.impl.PatternImpl
		 * @see damapp.impl.DamappPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__TEXT = eINSTANCE.getPattern_Text();

		/**
		 * The meta object literal for the '{@link damapp.TheoricPatternType <em>Theoric Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.TheoricPatternType
		 * @see damapp.impl.DamappPackageImpl#getTheoricPatternType()
		 * @generated
		 */
		EEnum THEORIC_PATTERN_TYPE = eINSTANCE.getTheoricPatternType();

		/**
		 * The meta object literal for the '{@link damapp.DataPatternType <em>Data Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see damapp.DataPatternType
		 * @see damapp.impl.DamappPackageImpl#getDataPatternType()
		 * @generated
		 */
		EEnum DATA_PATTERN_TYPE = eINSTANCE.getDataPatternType();

	}

} //DamappPackage
