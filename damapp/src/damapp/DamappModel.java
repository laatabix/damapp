/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.DamappModel#getAgententities <em>Agententities</em>}</li>
 *   <li>{@link damapp.DamappModel#getDataentities <em>Dataentities</em>}</li>
 *   <li>{@link damapp.DamappModel#getVersion <em>Version</em>}</li>
 *   <li>{@link damapp.DamappModel#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link damapp.DamappModel#getTheoricpatterns <em>Theoricpatterns</em>}</li>
 *   <li>{@link damapp.DamappModel#getDatapatterns <em>Datapatterns</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getDamappModel()
 * @model
 * @generated
 */
public interface DamappModel extends DamappEntity {
	/**
	 * Returns the value of the '<em><b>Agententities</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.AgentEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agententities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agententities</em>' containment reference list.
	 * @see damapp.DamappPackage#getDamappModel_Agententities()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgentEntity> getAgententities();

	/**
	 * Returns the value of the '<em><b>Dataentities</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.DataEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataentities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataentities</em>' containment reference list.
	 * @see damapp.DamappPackage#getDamappModel_Dataentities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataEntity> getDataentities();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see damapp.DamappPackage#getDamappModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link damapp.DamappModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see damapp.DamappPackage#getDamappModel_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Theoricpatterns</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.TheoricPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theoricpatterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theoricpatterns</em>' containment reference list.
	 * @see damapp.DamappPackage#getDamappModel_Theoricpatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TheoricPattern> getTheoricpatterns();

	/**
	 * Returns the value of the '<em><b>Datapatterns</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.DataPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datapatterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapatterns</em>' containment reference list.
	 * @see damapp.DamappPackage#getDamappModel_Datapatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPattern> getDatapatterns();

} // DamappModel
