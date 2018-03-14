/**
 */
package org.example.model.encoding_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.model.encoding_model.Encoding_modelPackage
 * @generated
 */
public interface Encoding_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Encoding_modelFactory eINSTANCE = org.example.model.encoding_model.impl.Encoding_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Source Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Mapping</em>'.
	 * @generated
	 */
	SourceMapping createSourceMapping();

	/**
	 * Returns a new object of class '<em>Sequence Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Mapping</em>'.
	 * @generated
	 */
	SequenceMapping createSequenceMapping();

	/**
	 * Returns a new object of class '<em>Exact Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exact Mapping</em>'.
	 * @generated
	 */
	ExactMapping createExactMapping();

	/**
	 * Returns a new object of class '<em>Transliteration Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transliteration Mapping</em>'.
	 * @generated
	 */
	TransliterationMapping createTransliterationMapping();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Encoding_modelPackage getEncoding_modelPackage();

} //Encoding_modelFactory
