/**
 */
package org.example.model.encoding_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.model.encoding_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Encoding_modelFactoryImpl extends EFactoryImpl implements Encoding_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Encoding_modelFactory init() {
		try {
			Encoding_modelFactory theEncoding_modelFactory = (Encoding_modelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Encoding_modelPackage.eNS_URI);
			if (theEncoding_modelFactory != null) {
				return theEncoding_modelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Encoding_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Encoding_modelPackage.COMMENT:
			return createComment();
		case Encoding_modelPackage.SOURCE_MAPPING:
			return createSourceMapping();
		case Encoding_modelPackage.SEQUENCE_MAPPING:
			return createSequenceMapping();
		case Encoding_modelPackage.EXACT_MAPPING:
			return createExactMapping();
		case Encoding_modelPackage.TRANSLITERATION_MAPPING:
			return createTransliterationMapping();
		case Encoding_modelPackage.ELEMENT:
			return createElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceMapping createSourceMapping() {
		SourceMappingImpl sourceMapping = new SourceMappingImpl();
		return sourceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceMapping createSequenceMapping() {
		SequenceMappingImpl sequenceMapping = new SequenceMappingImpl();
		return sequenceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactMapping createExactMapping() {
		ExactMappingImpl exactMapping = new ExactMappingImpl();
		return exactMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransliterationMapping createTransliterationMapping() {
		TransliterationMappingImpl transliterationMapping = new TransliterationMappingImpl();
		return transliterationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding_modelPackage getEncoding_modelPackage() {
		return (Encoding_modelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Encoding_modelPackage getPackage() {
		return Encoding_modelPackage.eINSTANCE;
	}

} //Encoding_modelFactoryImpl
