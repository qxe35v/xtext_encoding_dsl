/**
 */
package org.example.model.encoding_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.model.encoding_model.Encoding_modelPackage;
import org.example.model.encoding_model.SequenceMapping;
import org.example.model.encoding_model.SourceMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.model.encoding_model.impl.SourceMappingImpl#getSequencemapping <em>Sequencemapping</em>}</li>
 *   <li>{@link org.example.model.encoding_model.impl.SourceMappingImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceMappingImpl extends ElementImpl implements SourceMapping {
	/**
	 * The cached value of the '{@link #getSequencemapping() <em>Sequencemapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencemapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceMapping> sequencemapping;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encoding_modelPackage.Literals.SOURCE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceMapping> getSequencemapping() {
		if (sequencemapping == null) {
			sequencemapping = new EObjectContainmentEList<SequenceMapping>(SequenceMapping.class, this,
					Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING);
		}
		return sequencemapping;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encoding_modelPackage.SOURCE_MAPPING__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING:
			return ((InternalEList<?>) getSequencemapping()).basicRemove(otherEnd, msgs);
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
		case Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING:
			return getSequencemapping();
		case Encoding_modelPackage.SOURCE_MAPPING__NAME:
			return getName();
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
		case Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING:
			getSequencemapping().clear();
			getSequencemapping().addAll((Collection<? extends SequenceMapping>) newValue);
			return;
		case Encoding_modelPackage.SOURCE_MAPPING__NAME:
			setName((String) newValue);
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
		case Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING:
			getSequencemapping().clear();
			return;
		case Encoding_modelPackage.SOURCE_MAPPING__NAME:
			setName(NAME_EDEFAULT);
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
		case Encoding_modelPackage.SOURCE_MAPPING__SEQUENCEMAPPING:
			return sequencemapping != null && !sequencemapping.isEmpty();
		case Encoding_modelPackage.SOURCE_MAPPING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SourceMappingImpl
