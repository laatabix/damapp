/**
 */
package damapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Pattern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see damapp.DamappPackage#getDataPatternType()
 * @model
 * @generated
 */
public enum DataPatternType implements Enumerator {
	/**
	 * The '<em><b>Dependence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE(0, "Dependence", "Dependence"),

	/**
	 * The '<em><b>Correlation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRELATION_VALUE
	 * @generated
	 * @ordered
	 */
	CORRELATION(1, "Correlation", "Correlation"), /**
	 * The '<em><b>Constraint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRAINT(2, "Constraint", "Constraint"), /**
	 * The '<em><b>Population Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPULATION_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	POPULATION_SYNTHESIS(3, "Population_Synthesis", "Population Synthesis");

	/**
	 * The '<em><b>Dependence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE
	 * @model name="Dependence"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_VALUE = 0;

	/**
	 * The '<em><b>Correlation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Correlation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRELATION
	 * @model name="Correlation"
	 * @generated
	 * @ordered
	 */
	public static final int CORRELATION_VALUE = 1;

	/**
	 * The '<em><b>Constraint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constraint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINT
	 * @model name="Constraint"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_VALUE = 2;

	/**
	 * The '<em><b>Population Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Population Synthesis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPULATION_SYNTHESIS
	 * @model name="Population_Synthesis" literal="Population Synthesis"
	 * @generated
	 * @ordered
	 */
	public static final int POPULATION_SYNTHESIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataPatternType[] VALUES_ARRAY =
		new DataPatternType[] {
			DEPENDENCE,
			CORRELATION,
			CONSTRAINT,
			POPULATION_SYNTHESIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataPatternType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Pattern Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPatternType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPatternType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Pattern Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPatternType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPatternType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Pattern Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPatternType get(int value) {
		switch (value) {
			case DEPENDENCE_VALUE: return DEPENDENCE;
			case CORRELATION_VALUE: return CORRELATION;
			case CONSTRAINT_VALUE: return CONSTRAINT;
			case POPULATION_SYNTHESIS_VALUE: return POPULATION_SYNTHESIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataPatternType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataPatternType
