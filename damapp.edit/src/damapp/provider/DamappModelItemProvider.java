/**
 */
package damapp.provider;


import damapp.DamappFactory;
import damapp.DamappModel;
import damapp.DamappPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link damapp.DamappModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DamappModelItemProvider extends DamappEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DamappModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DamappModel_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DamappModel_version_feature", "_UI_DamappModel_type"),
				 DamappPackage.Literals.DAMAPP_MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DamappPackage.Literals.DAMAPP_MODEL__AGENTENTITIES);
			childrenFeatures.add(DamappPackage.Literals.DAMAPP_MODEL__DATAENTITIES);
			childrenFeatures.add(DamappPackage.Literals.DAMAPP_MODEL__TRANSFORMATIONS);
			childrenFeatures.add(DamappPackage.Literals.DAMAPP_MODEL__THEORICPATTERNS);
			childrenFeatures.add(DamappPackage.Literals.DAMAPP_MODEL__DATAPATTERNS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DamappModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DamappModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DamappModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DamappModel_type") :
			getString("_UI_DamappModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DamappModel.class)) {
			case DamappPackage.DAMAPP_MODEL__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DamappPackage.DAMAPP_MODEL__AGENTENTITIES:
			case DamappPackage.DAMAPP_MODEL__DATAENTITIES:
			case DamappPackage.DAMAPP_MODEL__TRANSFORMATIONS:
			case DamappPackage.DAMAPP_MODEL__THEORICPATTERNS:
			case DamappPackage.DAMAPP_MODEL__DATAPATTERNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DamappPackage.Literals.DAMAPP_MODEL__AGENTENTITIES,
				 DamappFactory.eINSTANCE.createAgentEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DamappPackage.Literals.DAMAPP_MODEL__DATAENTITIES,
				 DamappFactory.eINSTANCE.createDataEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DamappPackage.Literals.DAMAPP_MODEL__TRANSFORMATIONS,
				 DamappFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(DamappPackage.Literals.DAMAPP_MODEL__THEORICPATTERNS,
				 DamappFactory.eINSTANCE.createTheoricPattern()));

		newChildDescriptors.add
			(createChildParameter
				(DamappPackage.Literals.DAMAPP_MODEL__DATAPATTERNS,
				 DamappFactory.eINSTANCE.createDataPattern()));
	}

}
