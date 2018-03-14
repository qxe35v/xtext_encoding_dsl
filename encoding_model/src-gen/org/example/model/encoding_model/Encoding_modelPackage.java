/**
 */
package org.example.model.encoding_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.model.encoding_model.Encoding_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Encoding_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "encoding_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/encoding_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "encoding_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Encoding_modelPackage eINSTANCE = org.example.model.encoding_model.impl.Encoding_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.ElementImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.CommentImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.SourceMappingImpl <em>Source Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.SourceMappingImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getSourceMapping()
	 * @generated
	 */
	int SOURCE_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Sequencemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MAPPING__SEQUENCEMAPPING = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MAPPING__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MAPPING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MAPPING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.SequenceMappingImpl <em>Sequence Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.SequenceMappingImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getSequenceMapping()
	 * @generated
	 */
	int SEQUENCE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MAPPING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MAPPING__TO = 1;

	/**
	 * The number of structural features of the '<em>Sequence Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sequence Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.ExactMappingImpl <em>Exact Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.ExactMappingImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getExactMapping()
	 * @generated
	 */
	int EXACT_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MAPPING__FROM = SEQUENCE_MAPPING__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MAPPING__TO = SEQUENCE_MAPPING__TO;

	/**
	 * The number of structural features of the '<em>Exact Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MAPPING_FEATURE_COUNT = SEQUENCE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exact Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MAPPING_OPERATION_COUNT = SEQUENCE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.example.model.encoding_model.impl.TransliterationMappingImpl <em>Transliteration Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.model.encoding_model.impl.TransliterationMappingImpl
	 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getTransliterationMapping()
	 * @generated
	 */
	int TRANSLITERATION_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLITERATION_MAPPING__FROM = SEQUENCE_MAPPING__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLITERATION_MAPPING__TO = SEQUENCE_MAPPING__TO;

	/**
	 * The number of structural features of the '<em>Transliteration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLITERATION_MAPPING_FEATURE_COUNT = SEQUENCE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transliteration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLITERATION_MAPPING_OPERATION_COUNT = SEQUENCE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.example.model.encoding_model.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.SourceMapping <em>Source Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Mapping</em>'.
	 * @see org.example.model.encoding_model.SourceMapping
	 * @generated
	 */
	EClass getSourceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.example.model.encoding_model.SourceMapping#getSequencemapping <em>Sequencemapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequencemapping</em>'.
	 * @see org.example.model.encoding_model.SourceMapping#getSequencemapping()
	 * @see #getSourceMapping()
	 * @generated
	 */
	EReference getSourceMapping_Sequencemapping();

	/**
	 * Returns the meta object for the attribute '{@link org.example.model.encoding_model.SourceMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.example.model.encoding_model.SourceMapping#getName()
	 * @see #getSourceMapping()
	 * @generated
	 */
	EAttribute getSourceMapping_Name();

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.SequenceMapping <em>Sequence Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Mapping</em>'.
	 * @see org.example.model.encoding_model.SequenceMapping
	 * @generated
	 */
	EClass getSequenceMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.example.model.encoding_model.SequenceMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.example.model.encoding_model.SequenceMapping#getFrom()
	 * @see #getSequenceMapping()
	 * @generated
	 */
	EAttribute getSequenceMapping_From();

	/**
	 * Returns the meta object for the attribute '{@link org.example.model.encoding_model.SequenceMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.example.model.encoding_model.SequenceMapping#getTo()
	 * @see #getSequenceMapping()
	 * @generated
	 */
	EAttribute getSequenceMapping_To();

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.ExactMapping <em>Exact Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Mapping</em>'.
	 * @see org.example.model.encoding_model.ExactMapping
	 * @generated
	 */
	EClass getExactMapping();

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.TransliterationMapping <em>Transliteration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transliteration Mapping</em>'.
	 * @see org.example.model.encoding_model.TransliterationMapping
	 * @generated
	 */
	EClass getTransliterationMapping();

	/**
	 * Returns the meta object for class '{@link org.example.model.encoding_model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.example.model.encoding_model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Encoding_modelFactory getEncoding_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.CommentImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.SourceMappingImpl <em>Source Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.SourceMappingImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getSourceMapping()
		 * @generated
		 */
		EClass SOURCE_MAPPING = eINSTANCE.getSourceMapping();

		/**
		 * The meta object literal for the '<em><b>Sequencemapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MAPPING__SEQUENCEMAPPING = eINSTANCE.getSourceMapping_Sequencemapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_MAPPING__NAME = eINSTANCE.getSourceMapping_Name();

		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.SequenceMappingImpl <em>Sequence Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.SequenceMappingImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getSequenceMapping()
		 * @generated
		 */
		EClass SEQUENCE_MAPPING = eINSTANCE.getSequenceMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_MAPPING__FROM = eINSTANCE.getSequenceMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_MAPPING__TO = eINSTANCE.getSequenceMapping_To();

		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.ExactMappingImpl <em>Exact Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.ExactMappingImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getExactMapping()
		 * @generated
		 */
		EClass EXACT_MAPPING = eINSTANCE.getExactMapping();

		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.TransliterationMappingImpl <em>Transliteration Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.TransliterationMappingImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getTransliterationMapping()
		 * @generated
		 */
		EClass TRANSLITERATION_MAPPING = eINSTANCE.getTransliterationMapping();

		/**
		 * The meta object literal for the '{@link org.example.model.encoding_model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.model.encoding_model.impl.ElementImpl
		 * @see org.example.model.encoding_model.impl.Encoding_modelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

	}

} //Encoding_modelPackage
