/**
 */
package damapp.impl;

import damapp.Attribute;
import damapp.DamappPackage;
import damapp.DataPattern;
import damapp.StateVariable;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link damapp.impl.StateVariableImpl#getMyattribute <em>Myattribute</em>}</li>
 *   <li>{@link damapp.impl.StateVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link damapp.impl.StateVariableImpl#getSvmydatapatterns <em>Svmydatapatterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateVariableImpl extends DamappEntityImpl implements StateVariable {
	/**
	 * The cached value of the '{@link #getMyattribute() <em>Myattribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyattribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute myattribute;

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
	 * The cached value of the '{@link #getSvmydatapatterns() <em>Svmydatapatterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvmydatapatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPattern> svmydatapatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DamappPackage.Literals.STATE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getMyattribute() {
		if (myattribute != null && myattribute.eIsProxy()) {
			InternalEObject oldMyattribute = (InternalEObject)myattribute;
			myattribute = (Attribute)eResolveProxy(oldMyattribute);
			if (myattribute != oldMyattribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DamappPackage.STATE_VARIABLE__MYATTRIBUTE, oldMyattribute, myattribute));
			}
		}
		return myattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetMyattribute() {
		return myattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyattribute(Attribute newMyattribute) {
		Attribute oldMyattribute = myattribute;
		myattribute = newMyattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.STATE_VARIABLE__MYATTRIBUTE, oldMyattribute, myattribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.STATE_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPattern> getSvmydatapatterns() {
		if (svmydatapatterns == null) {
			svmydatapatterns = new EObjectResolvingEList<DataPattern>(DataPattern.class, this, DamappPackage.STATE_VARIABLE__SVMYDATAPATTERNS);
		}
		return svmydatapatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DamappPackage.STATE_VARIABLE__MYATTRIBUTE:
				if (resolve) return getMyattribute();
				return basicGetMyattribute();
			case DamappPackage.STATE_VARIABLE__TYPE:
				return getType();
			case DamappPackage.STATE_VARIABLE__SVMYDATAPATTERNS:
				return getSvmydatapatterns();
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
			case DamappPackage.STATE_VARIABLE__MYATTRIBUTE:
				setMyattribute((Attribute)newValue);
				return;
			case DamappPackage.STATE_VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case DamappPackage.STATE_VARIABLE__SVMYDATAPATTERNS:
				getSvmydatapatterns().clear();
				getSvmydatapatterns().addAll((Collection<? extends DataPattern>)newValue);
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
			case DamappPackage.STATE_VARIABLE__MYATTRIBUTE:
				setMyattribute((Attribute)null);
				return;
			case DamappPackage.STATE_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DamappPackage.STATE_VARIABLE__SVMYDATAPATTERNS:
				getSvmydatapatterns().clear();
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
			case DamappPackage.STATE_VARIABLE__MYATTRIBUTE:
				return myattribute != null;
			case DamappPackage.STATE_VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DamappPackage.STATE_VARIABLE__SVMYDATAPATTERNS:
				return svmydatapatterns != null && !svmydatapatterns.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StateVariableImpl
