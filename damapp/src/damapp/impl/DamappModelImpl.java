/**
 */
package damapp.impl;

import damapp.AgentEntity;
import damapp.DamappModel;
import damapp.DamappPackage;
import damapp.DataEntity;
import damapp.DataPattern;
import damapp.TheoricPattern;
import damapp.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link damapp.impl.DamappModelImpl#getAgententities <em>Agententities</em>}</li>
 *   <li>{@link damapp.impl.DamappModelImpl#getDataentities <em>Dataentities</em>}</li>
 *   <li>{@link damapp.impl.DamappModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link damapp.impl.DamappModelImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link damapp.impl.DamappModelImpl#getTheoricpatterns <em>Theoricpatterns</em>}</li>
 *   <li>{@link damapp.impl.DamappModelImpl#getDatapatterns <em>Datapatterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DamappModelImpl extends DamappEntityImpl implements DamappModel {
	/**
	 * The cached value of the '{@link #getAgententities() <em>Agententities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgententities()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentEntity> agententities;

	/**
	 * The cached value of the '{@link #getDataentities() <em>Dataentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataentities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> dataentities;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * The cached value of the '{@link #getTheoricpatterns() <em>Theoricpatterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheoricpatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<TheoricPattern> theoricpatterns;

	/**
	 * The cached value of the '{@link #getDatapatterns() <em>Datapatterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPattern> datapatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DamappModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DamappPackage.Literals.DAMAPP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentEntity> getAgententities() {
		if (agententities == null) {
			agententities = new EObjectContainmentEList<AgentEntity>(AgentEntity.class, this, DamappPackage.DAMAPP_MODEL__AGENTENTITIES);
		}
		return agententities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getDataentities() {
		if (dataentities == null) {
			dataentities = new EObjectContainmentEList<DataEntity>(DataEntity.class, this, DamappPackage.DAMAPP_MODEL__DATAENTITIES);
		}
		return dataentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.DAMAPP_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<Transformation>(Transformation.class, this, DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TheoricPattern> getTheoricpatterns() {
		if (theoricpatterns == null) {
			theoricpatterns = new EObjectContainmentEList<TheoricPattern>(TheoricPattern.class, this, DamappPackage.DAMAPP_MODEL__THEORICPATTERNS);
		}
		return theoricpatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPattern> getDatapatterns() {
		if (datapatterns == null) {
			datapatterns = new EObjectContainmentEList<DataPattern>(DataPattern.class, this, DamappPackage.DAMAPP_MODEL__DATAPATTERNS);
		}
		return datapatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
				return ((InternalEList<?>)getAgententities()).basicRemove(otherEnd, msgs);
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
				return ((InternalEList<?>)getDataentities()).basicRemove(otherEnd, msgs);
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
				return ((InternalEList<?>)getTransformations()).basicRemove(otherEnd, msgs);
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
				return ((InternalEList<?>)getTheoricpatterns()).basicRemove(otherEnd, msgs);
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				return ((InternalEList<?>)getDatapatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
				return getAgententities();
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
				return getDataentities();
			case DamappPackage.DAMAPP_MODEL__VERSION:
				return getVersion();
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
				return getTransformations();
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
				return getTheoricpatterns();
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				return getDatapatterns();
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
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
				getAgententities().clear();
				getAgententities().addAll((Collection<? extends AgentEntity>)newValue);
				return;
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
				getDataentities().clear();
				getDataentities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case DamappPackage.DAMAPP_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends Transformation>)newValue);
				return;
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
				getTheoricpatterns().clear();
				getTheoricpatterns().addAll((Collection<? extends TheoricPattern>)newValue);
				return;
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				getDatapatterns().clear();
				getDatapatterns().addAll((Collection<? extends DataPattern>)newValue);
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
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
				getAgententities().clear();
				return;
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
				getDataentities().clear();
				return;
			case DamappPackage.DAMAPP_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
				getTheoricpatterns().clear();
				return;
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				getDatapatterns().clear();
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
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
				return agententities != null && !agententities.isEmpty();
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
				return dataentities != null && !dataentities.isEmpty();
			case DamappPackage.DAMAPP_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
				return theoricpatterns != null && !theoricpatterns.isEmpty();
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				return datapatterns != null && !datapatterns.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DamappModelImpl
