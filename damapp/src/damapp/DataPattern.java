/**
 */
package damapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.DataPattern#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getDataPattern()
 * @model
 * @generated
 */
public interface DataPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Dependence"</code>.
	 * The literals are from the enumeration {@link damapp.DataPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see damapp.DataPatternType
	 * @see #setType(DataPatternType)
	 * @see damapp.DamappPackage#getDataPattern_Type()
	 * @model default="Dependence"
	 * @generated
	 */
	DataPatternType getType();

	/**
	 * Sets the value of the '{@link damapp.DataPattern#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see damapp.DataPatternType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataPatternType value);

} // DataPattern
