/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.AgentEntity#getStatevariables <em>Statevariables</em>}</li>
 *   <li>{@link damapp.AgentEntity#getMydataentity <em>Mydataentity</em>}</li>
 *   <li>{@link damapp.AgentEntity#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link damapp.AgentEntity#getInteracts <em>Interacts</em>}</li>
 *   <li>{@link damapp.AgentEntity#getAemydatapatterns <em>Aemydatapatterns</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getAgentEntity()
 * @model
 * @generated
 */
public interface AgentEntity extends DamappEntity {
	/**
	 * Returns the value of the '<em><b>Statevariables</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statevariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariables</em>' containment reference list.
	 * @see damapp.DamappPackage#getAgentEntity_Statevariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVariable> getStatevariables();

	/**
	 * Returns the value of the '<em><b>Mydataentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mydataentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mydataentity</em>' reference.
	 * @see #setMydataentity(DataEntity)
	 * @see damapp.DamappPackage#getAgentEntity_Mydataentity()
	 * @model
	 * @generated
	 */
	DataEntity getMydataentity();

	/**
	 * Sets the value of the '{@link damapp.AgentEntity#getMydataentity <em>Mydataentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mydataentity</em>' reference.
	 * @see #getMydataentity()
	 * @generated
	 */
	void setMydataentity(DataEntity value);

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see damapp.DamappPackage#getAgentEntity_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Interacts</b></em>' reference list.
	 * The list contents are of type {@link damapp.AgentEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interacts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interacts</em>' reference list.
	 * @see damapp.DamappPackage#getAgentEntity_Interacts()
	 * @model
	 * @generated
	 */
	EList<AgentEntity> getInteracts();

	/**
	 * Returns the value of the '<em><b>Aemydatapatterns</b></em>' reference list.
	 * The list contents are of type {@link damapp.DataPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aemydatapatterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aemydatapatterns</em>' reference list.
	 * @see damapp.DamappPackage#getAgentEntity_Aemydatapatterns()
	 * @model
	 * @generated
	 */
	EList<DataPattern> getAemydatapatterns();

} // AgentEntity
