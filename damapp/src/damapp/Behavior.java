/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.Behavior#getMyoperation <em>Myoperation</em>}</li>
 *   <li>{@link damapp.Behavior#getMypatterns <em>Mypatterns</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends DamappEntity {
	/**
	 * Returns the value of the '<em><b>Myoperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Myoperation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Myoperation</em>' reference.
	 * @see #setMyoperation(Operation)
	 * @see damapp.DamappPackage#getBehavior_Myoperation()
	 * @model
	 * @generated
	 */
	Operation getMyoperation();

	/**
	 * Sets the value of the '{@link damapp.Behavior#getMyoperation <em>Myoperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Myoperation</em>' reference.
	 * @see #getMyoperation()
	 * @generated
	 */
	void setMyoperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Mypatterns</b></em>' reference list.
	 * The list contents are of type {@link damapp.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mypatterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mypatterns</em>' reference list.
	 * @see damapp.DamappPackage#getBehavior_Mypatterns()
	 * @model
	 * @generated
	 */
	EList<Pattern> getMypatterns();

} // Behavior
