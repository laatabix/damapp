/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.StateVariable#getMyattribute <em>Myattribute</em>}</li>
 *   <li>{@link damapp.StateVariable#getType <em>Type</em>}</li>
 *   <li>{@link damapp.StateVariable#getSvmydatapatterns <em>Svmydatapatterns</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getStateVariable()
 * @model
 * @generated
 */
public interface StateVariable extends DamappEntity {
	/**
	 * Returns the value of the '<em><b>Myattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Myattribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Myattribute</em>' reference.
	 * @see #setMyattribute(Attribute)
	 * @see damapp.DamappPackage#getStateVariable_Myattribute()
	 * @model
	 * @generated
	 */
	Attribute getMyattribute();

	/**
	 * Sets the value of the '{@link damapp.StateVariable#getMyattribute <em>Myattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myattribute</em>' reference.
	 * @see #getMyattribute()
	 * @generated
	 */
	void setMyattribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see damapp.DamappPackage#getStateVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link damapp.StateVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Svmydatapatterns</b></em>' reference list.
	 * The list contents are of type {@link damapp.DataPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svmydatapatterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svmydatapatterns</em>' reference list.
	 * @see damapp.DamappPackage#getStateVariable_Svmydatapatterns()
	 * @model
	 * @generated
	 */
	EList<DataPattern> getSvmydatapatterns();

} // StateVariable
