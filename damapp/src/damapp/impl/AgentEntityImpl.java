/**
 */
package damapp.impl;

import damapp.AgentEntity;
import damapp.Behavior;
import damapp.DamappPackage;
import damapp.DataEntity;
import damapp.DataPattern;
import damapp.StateVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link damapp.impl.AgentEntityImpl#getStatevariables <em>Statevariables</em>}</li>
 *   <li>{@link damapp.impl.AgentEntityImpl#getMydataentity <em>Mydataentity</em>}</li>
 *   <li>{@link damapp.impl.AgentEntityImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link damapp.impl.AgentEntityImpl#getInteracts <em>Interacts</em>}</li>
 *   <li>{@link damapp.impl.AgentEntityImpl#getAemydatapatterns <em>Aemydatapatterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentEntityImpl extends DamappEntityImpl implements AgentEntity {
	/**
	 * The cached value of the '{@link #getStatevariables() <em>Statevariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatevariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariable> statevariables;

	/**
	 * The cached value of the '{@link #getMydataentity() <em>Mydataentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMydataentity()
	 * @generated
	 * @ordered
	 */
	protected DataEntity mydataentity;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * The cached value of the '{@link #getInteracts() <em>Interacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteracts()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentEntity> interacts;

	/**
	 * The cached value of the '{@link #getAemydatapatterns() <em>Aemydatapatterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAemydatapatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPattern> aemydatapatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DamappPackage.Literals.AGENT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateVariable> getStatevariables() {
		if (statevariables == null) {
			statevariables = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, DamappPackage.AGENT_ENTITY__STATEVARIABLES);
		}
		return statevariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity getMydataentity() {
		if (mydataentity != null && mydataentity.eIsProxy()) {
			InternalEObject oldMydataentity = (InternalEObject)mydataentity;
			mydataentity = (DataEntity)eResolveProxy(oldMydataentity);
			if (mydataentity != oldMydataentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DamappPackage.AGENT_ENTITY__MYDATAENTITY, oldMydataentity, mydataentity));
			}
		}
		return mydataentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity basicGetMydataentity() {
		return mydataentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMydataentity(DataEntity newMydataentity) {
		DataEntity oldMydataentity = mydataentity;
		mydataentity = newMydataentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DamappPackage.AGENT_ENTITY__MYDATAENTITY, oldMydataentity, mydataentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, DamappPackage.AGENT_ENTITY__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentEntity> getInteracts() {
		if (interacts == null) {
			interacts = new EObjectResolvingEList<AgentEntity>(AgentEntity.class, this, DamappPackage.AGENT_ENTITY__INTERACTS);
		}
		return interacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPattern> getAemydatapatterns() {
		if (aemydatapatterns == null) {
			aemydatapatterns = new EObjectResolvingEList<DataPattern>(DataPattern.class, this, DamappPackage.AGENT_ENTITY__AEMYDATAPATTERNS);
		}
		return aemydatapatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DamappPackage.AGENT_ENTITY__STATEVARIABLES:
				return ((InternalEList<?>)getStatevariables()).basicRemove(otherEnd, msgs);
			case DamappPackage.AGENT_ENTITY__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
			case DamappPackage.AGENT_ENTITY__STATEVARIABLES:
				return getStatevariables();
			case DamappPackage.AGENT_ENTITY__MYDATAENTITY:
				if (resolve) return getMydataentity();
				return basicGetMydataentity();
			case DamappPackage.AGENT_ENTITY__BEHAVIORS:
				return getBehaviors();
			case DamappPackage.AGENT_ENTITY__INTERACTS:
				return getInteracts();
			case DamappPackage.AGENT_ENTITY__AEMYDATAPATTERNS:
				return getAemydatapatterns();
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
			case DamappPackage.AGENT_ENTITY__STATEVARIABLES:
				getStatevariables().clear();
				getStatevariables().addAll((Collection<? extends StateVariable>)newValue);
				return;
			case DamappPackage.AGENT_ENTITY__MYDATAENTITY:
				setMydataentity((DataEntity)newValue);
				return;
			case DamappPackage.AGENT_ENTITY__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case DamappPackage.AGENT_ENTITY__INTERACTS:
				getInteracts().clear();
				getInteracts().addAll((Collection<? extends AgentEntity>)newValue);
				return;
			case DamappPackage.AGENT_ENTITY__AEMYDATAPATTERNS:
				getAemydatapatterns().clear();
				getAemydatapatterns().addAll((Collection<? extends DataPattern>)newValue);
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
			case DamappPackage.AGENT_ENTITY__STATEVARIABLES:
				getStatevariables().clear();
				return;
			case DamappPackage.AGENT_ENTITY__MYDATAENTITY:
				setMydataentity((DataEntity)null);
				return;
			case DamappPackage.AGENT_ENTITY__BEHAVIORS:
				getBehaviors().clear();
				return;
			case DamappPackage.AGENT_ENTITY__INTERACTS:
				getInteracts().clear();
				return;
			case DamappPackage.AGENT_ENTITY__AEMYDATAPATTERNS:
				getAemydatapatterns().clear();
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
			case DamappPackage.AGENT_ENTITY__STATEVARIABLES:
				return statevariables != null && !statevariables.isEmpty();
			case DamappPackage.AGENT_ENTITY__MYDATAENTITY:
				return mydataentity != null;
			case DamappPackage.AGENT_ENTITY__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case DamappPackage.AGENT_ENTITY__INTERACTS:
				return interacts != null && !interacts.isEmpty();
			case DamappPackage.AGENT_ENTITY__AEMYDATAPATTERNS:
				return aemydatapatterns != null && !aemydatapatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentEntityImpl
