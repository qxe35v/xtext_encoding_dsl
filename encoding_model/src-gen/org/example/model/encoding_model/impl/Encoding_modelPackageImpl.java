/**
 */
package org.example.model.encoding_model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.example.model.encoding_model.Comment;
import org.example.model.encoding_model.Element;
import org.example.model.encoding_model.Encoding_modelFactory;
import org.example.model.encoding_model.Encoding_modelPackage;
import org.example.model.encoding_model.ExactMapping;
import org.example.model.encoding_model.SequenceMapping;
import org.example.model.encoding_model.SourceMapping;
import org.example.model.encoding_model.TransliterationMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Encoding_modelPackageImpl extends EPackageImpl implements Encoding_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transliterationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.example.model.encoding_model.Encoding_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Encoding_modelPackageImpl() {
		super(eNS_URI, Encoding_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Encoding_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Encoding_modelPackage init() {
		if (isInited)
			return (Encoding_modelPackage) EPackage.Registry.INSTANCE.getEPackage(Encoding_modelPackage.eNS_URI);

		// Obtain or create and register package
		Encoding_modelPackageImpl theEncoding_modelPackage = (Encoding_modelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Encoding_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Encoding_modelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEncoding_modelPackage.createPackageContents();

		// Initialize created meta-data
		theEncoding_modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEncoding_modelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Encoding_modelPackage.eNS_URI, theEncoding_modelPackage);
		return theEncoding_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceMapping() {
		return sourceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceMapping_Sequencemapping() {
		return (EReference) sourceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceMapping_Name() {
		return (EAttribute) sourceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceMapping() {
		return sequenceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceMapping_From() {
		return (EAttribute) sequenceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceMapping_To() {
		return (EAttribute) sequenceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactMapping() {
		return exactMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransliterationMapping() {
		return transliterationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding_modelFactory getEncoding_modelFactory() {
		return (Encoding_modelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		commentEClass = createEClass(COMMENT);

		sourceMappingEClass = createEClass(SOURCE_MAPPING);
		createEReference(sourceMappingEClass, SOURCE_MAPPING__SEQUENCEMAPPING);
		createEAttribute(sourceMappingEClass, SOURCE_MAPPING__NAME);

		sequenceMappingEClass = createEClass(SEQUENCE_MAPPING);
		createEAttribute(sequenceMappingEClass, SEQUENCE_MAPPING__FROM);
		createEAttribute(sequenceMappingEClass, SEQUENCE_MAPPING__TO);

		exactMappingEClass = createEClass(EXACT_MAPPING);

		transliterationMappingEClass = createEClass(TRANSLITERATION_MAPPING);

		elementEClass = createEClass(ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(this.getElement());
		sourceMappingEClass.getESuperTypes().add(this.getElement());
		exactMappingEClass.getESuperTypes().add(this.getSequenceMapping());
		transliterationMappingEClass.getESuperTypes().add(this.getSequenceMapping());

		// Initialize classes, features, and operations; add parameters
		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceMappingEClass, SourceMapping.class, "SourceMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceMapping_Sequencemapping(), this.getSequenceMapping(), null, "sequencemapping", null, 0,
				-1, SourceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourceMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceMappingEClass, SequenceMapping.class, "SequenceMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceMapping_From(), theXMLTypePackage.getByteObject(), "from", null, 0, 1,
				SequenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceMapping_To(), theXMLTypePackage.getByteObject(), "to", null, 0, 1,
				SequenceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(exactMappingEClass, ExactMapping.class, "ExactMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transliterationMappingEClass, TransliterationMapping.class, "TransliterationMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Encoding_modelPackageImpl
