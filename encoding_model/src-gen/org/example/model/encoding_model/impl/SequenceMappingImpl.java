/**
 */
package org.example.model.encoding_model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.model.encoding_model.Encoding_modelPackage;
import org.example.model.encoding_model.SequenceMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.model.encoding_model.impl.SequenceMappingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.example.model.encoding_model.impl.SequenceMappingImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceMappingImpl extends MinimalEObjectImpl.Container implements SequenceMapping {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Byte FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Byte from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Byte TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Byte to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encoding_modelPackage.Literals.SEQUENCE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Byte newFrom) {
		Byte oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encoding_modelPackage.SEQUENCE_MAPPING__FROM, oldFrom,
					from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Byte newTo) {
		Byte oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encoding_modelPackage.SEQUENCE_MAPPING__TO, oldTo,
					to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Encoding_modelPackage.SEQUENCE_MAPPING__FROM:
			return getFrom();
		case Encoding_modelPackage.SEQUENCE_MAPPING__TO:
			return getTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Encoding_modelPackage.SEQUENCE_MAPPING__FROM:
			setFrom((Byte) newValue);
			return;
		case Encoding_modelPackage.SEQUENCE_MAPPING__TO:
			setTo((Byte) newValue);
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
		case Encoding_modelPackage.SEQUENCE_MAPPING__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case Encoding_modelPackage.SEQUENCE_MAPPING__TO:
			setTo(TO_EDEFAULT);
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
		case Encoding_modelPackage.SEQUENCE_MAPPING__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
		case Encoding_modelPackage.SEQUENCE_MAPPING__TO:
			return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //SequenceMappingImpl
