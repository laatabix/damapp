/**
 */
package damapp.impl;

import damapp.Attribute;
import damapp.DamappPackage;
import damapp.StateVariable;
import damapp.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link damapp.impl.TransformationImpl#getTransattributes <em>Transattributes</em>}</li>
 *   <li>{@link damapp.impl.TransformationImpl#getResultsv <em>Resultsv</em>}</li>
 *   <li>{@link damapp.impl.TransformationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link damapp.impl.TransformationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends DamappEntityImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getTransattributes() <em>Transattributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> transattributes;

	/**
	 * The cached value of the '{@link #getResultsv() <em>Resultsv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsv()
	 * @generated
	 * @ordered
	 */
	protected StateVariable resultsv;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DamappPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getTransattributes() {
		if (transattributes == null) {
			transattributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, DamappPackage.TRANSFORMATION__TRANSATTRIBUTES);
		}
		return transattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable getResultsv() {
		if (resultsv != null && resultsv.eIsProxy()) {
			InternalEObject oldResultsv = (InternalEObject)resultsv;
			resultsv = (StateVariable)eResolveProxy(oldResultsv);
			if (resultsv != oldResultsv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DamappPackage.TRANSFORMATION__RESULTSV, oldResultsv, resultsv));
			}
		}
		return resultsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable basicGetResultsv() {
		return resultsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsv(StateVariable newResultsv) {
		StateVariable oldResultsv = resultsv;
		resultsv = newResultsv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.TRANSFORMATION__RESULTSV, oldResultsv, resultsv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.TRANSFORMATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.TRANSFORMATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DamappPackage.TRANSFORMATION__TRANSATTRIBUTES:
				return getTransattributes();
			case DamappPackage.TRANSFORMATION__RESULTSV:
				if (resolve) return getResultsv();
				return basicGetResultsv();
			case DamappPackage.TRANSFORMATION__CODE:
				return getCode();
			case DamappPackage.TRANSFORMATION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DamappPackage.TRANSFORMATION__TRANSATTRIBUTES:
				getTransattributes().clear();
				getTransattributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DamappPackage.TRANSFORMATION__RESULTSV:
				setResultsv((StateVariable)newValue);
				return;
			case DamappPackage.TRANSFORMATION__CODE:
				setCode((String)newValue);
				return;
			case DamappPackage.TRANSFORMATION__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DamappPackage.TRANSFORMATION__TRANSATTRIBUTES:
				getTransattributes().clear();
				return;
			case DamappPackage.TRANSFORMATION__RESULTSV:
				setResultsv((StateVariable)null);
				return;
			case DamappPackage.TRANSFORMATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DamappPackage.TRANSFORMATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DamappPackage.TRANSFORMATION__TRANSATTRIBUTES:
				return transattributes != null && !transattributes.isEmpty();
			case DamappPackage.TRANSFORMATION__RESULTSV:
				return resultsv != null;
			case DamappPackage.TRANSFORMATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DamappPackage.TRANSFORMATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
