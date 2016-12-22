/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ODD2D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.ODD2D#getName <em>Name</em>}</li>
 *   <li>{@link damapp.ODD2D#getText <em>Text</em>}</li>
 *   <li>{@link damapp.ODD2D#getSubelements <em>Subelements</em>}</li>
 *   <li>{@link damapp.ODD2D#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getODD2D()
 * @model
 * @generated
 */
public interface ODD2D extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see damapp.DamappPackage#getODD2D_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link damapp.ODD2D#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see damapp.DamappPackage#getODD2D_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link damapp.ODD2D#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Subelements</b></em>' containment reference list.
	 * The list contents are of type {@link damapp.ODD2D}.
	 * It is bidirectional and its opposite is '{@link damapp.ODD2D#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subelements</em>' containment reference list.
	 * @see damapp.DamappPackage#getODD2D_Subelements()
	 * @see damapp.ODD2D#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ODD2D> getSubelements();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link damapp.ODD2D#getSubelements <em>Subelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ODD2D)
	 * @see damapp.DamappPackage#getODD2D_Parent()
	 * @see damapp.ODD2D#getSubelements
	 * @model opposite="subelements" transient="false"
	 * @generated
	 */
	ODD2D getParent();

	/**
	 * Sets the value of the '{@link damapp.ODD2D#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ODD2D value);

} // ODD2D
