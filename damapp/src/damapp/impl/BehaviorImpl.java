/**
 */
package damapp.impl;

import damapp.Behavior;
import damapp.DamappPackage;
import damapp.Operation;
import damapp.Pattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link damapp.impl.BehaviorImpl#getMyoperation <em>Myoperation</em>}</li>
 *   <li>{@link damapp.impl.BehaviorImpl#getMypatterns <em>Mypatterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends DamappEntityImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getMyoperation() <em>Myoperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyoperation()
	 * @generated
	 * @ordered
	 */
	protected Operation myoperation;

	/**
	 * The cached value of the '{@link #getMypatterns() <em>Mypatterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMypatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> mypatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DamappPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMyoperation() {
		if (myoperation != null && myoperation.eIsProxy()) {
			InternalEObject oldMyoperation = (InternalEObject)myoperation;
			myoperation = (Operation)eResolveProxy(oldMyoperation);
			if (myoperation != oldMyoperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DamappPackage.BEHAVIOR__MYOPERATION, oldMyoperation, myoperation));
			}
		}
		return myoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMyoperation() {
		return myoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyoperation(Operation newMyoperation) {
		Operation oldMyoperation = myoperation;
		myoperation = newMyoperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.BEHAVIOR__MYOPERATION, oldMyoperation, myoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getMypatterns() {
		if (mypatterns == null) {
			mypatterns = new EObjectResolvingEList<Pattern>(Pattern.class, this, DamappPackage.BEHAVIOR__MYPATTERNS);
		}
		return mypatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DamappPackage.BEHAVIOR__MYOPERATION:
				if (resolve) return getMyoperation();
				return basicGetMyoperation();
			case DamappPackage.BEHAVIOR__MYPATTERNS:
				return getMypatterns();
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
			case DamappPackage.BEHAVIOR__MYOPERATION:
				setMyoperation((Operation)newValue);
				return;
			case DamappPackage.BEHAVIOR__MYPATTERNS:
				getMypatterns().clear();
				getMypatterns().addAll((Collection<? extends Pattern>)newValue);
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
			case DamappPackage.BEHAVIOR__MYOPERATION:
				setMyoperation((Operation)null);
				return;
			case DamappPackage.BEHAVIOR__MYPATTERNS:
				getMypatterns().clear();
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
			case DamappPackage.BEHAVIOR__MYOPERATION:
				return myoperation != null;
			case DamappPackage.BEHAVIOR__MYPATTERNS:
				return mypatterns != null && !mypatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
