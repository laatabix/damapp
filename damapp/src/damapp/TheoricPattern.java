/**
 */
package damapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theoric Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link damapp.TheoricPattern#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see damapp.DamappPackage#getTheoricPattern()
 * @model
 * @generated
 */
public interface TheoricPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Knowledge"</code>.
	 * The literals are from the enumeration {@link damapp.TheoricPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see damapp.TheoricPatternType
	 * @see #setType(TheoricPatternType)
	 * @see damapp.DamappPackage#getTheoricPattern_Type()
	 * @model default="Knowledge"
	 * @generated
	 */
	TheoricPatternType getType();

	/**
	 * Sets the value of the '{@link damapp.TheoricPattern#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see damapp.TheoricPatternType
	 * @see #getType()
	 * @generated
	 */
	void setType(TheoricPatternType value);

} // TheoricPattern
