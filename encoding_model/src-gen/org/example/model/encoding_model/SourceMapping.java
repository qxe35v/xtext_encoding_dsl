/**
 */
package org.example.model.encoding_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.model.encoding_model.SourceMapping#getSequencemapping <em>Sequencemapping</em>}</li>
 *   <li>{@link org.example.model.encoding_model.SourceMapping#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.example.model.encoding_model.Encoding_modelPackage#getSourceMapping()
 * @model
 * @generated
 */
public interface SourceMapping extends Element {
	/**
	 * Returns the value of the '<em><b>Sequencemapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.model.encoding_model.SequenceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequencemapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequencemapping</em>' containment reference list.
	 * @see org.example.model.encoding_model.Encoding_modelPackage#getSourceMapping_Sequencemapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceMapping> getSequencemapping();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.example.model.encoding_model.Encoding_modelPackage#getSourceMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.model.encoding_model.SourceMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SourceMapping
