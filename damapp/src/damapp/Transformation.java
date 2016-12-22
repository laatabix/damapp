/**
 */
package damapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.Transformation#getTransattributes <em>Transattributes</em>}</li>
 *   <li>{@link damapp.Transformation#getResultsv <em>Resultsv</em>}</li>
 *   <li>{@link damapp.Transformation#getCode <em>Code</em>}</li>
 *   <li>{@link damapp.Transformation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends DamappEntity {
	/**
	 * Returns the value of the '<em><b>Transattributes</b></em>' reference list.
	 * The list contents are of type {@link damapp.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transattributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transattributes</em>' reference list.
	 * @see damapp.DamappPackage#getTransformation_Transattributes()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getTransattributes();

	/**
	 * Returns the value of the '<em><b>Resultsv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultsv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultsv</em>' reference.
	 * @see #setResultsv(StateVariable)
	 * @see damapp.DamappPackage#getTransformation_Resultsv()
	 * @model
	 * @generated
	 */
	StateVariable getResultsv();

	/**
	 * Sets the value of the '{@link damapp.Transformation#getResultsv <em>Resultsv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultsv</em>' reference.
	 * @see #getResultsv()
	 * @generated
	 */
	void setResultsv(StateVariable value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see damapp.DamappPackage#getTransformation_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link damapp.Transformation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see damapp.DamappPackage#getTransformation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link damapp.Transformation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Transformation
