/**
 */
package org.example.model.encoding_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.model.encoding_model.SequenceMapping#getFrom <em>From</em>}</li>
 *   <li>{@link org.example.model.encoding_model.SequenceMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.example.model.encoding_model.Encoding_modelPackage#getSequenceMapping()
 * @model
 * @generated
 */
public interface SequenceMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Byte)
	 * @see org.example.model.encoding_model.Encoding_modelPackage#getSequenceMapping_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ByteObject"
	 * @generated
	 */
	Byte getFrom();

	/**
	 * Sets the value of the '{@link org.example.model.encoding_model.SequenceMapping#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Byte value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Byte)
	 * @see org.example.model.encoding_model.Encoding_modelPackage#getSequenceMapping_To()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ByteObject"
	 * @generated
	 */
	Byte getTo();

	/**
	 * Sets the value of the '{@link org.example.model.encoding_model.SequenceMapping#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Byte value);

} // SequenceMapping
