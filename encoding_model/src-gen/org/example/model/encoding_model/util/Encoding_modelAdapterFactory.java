/**
 */
package org.example.model.encoding_model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.model.encoding_model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.model.encoding_model.Encoding_modelPackage
 * @generated
 */
public class Encoding_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Encoding_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Encoding_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Encoding_modelSwitch<Adapter> modelSwitch = new Encoding_modelSwitch<Adapter>() {
		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseSourceMapping(SourceMapping object) {
			return createSourceMappingAdapter();
		}

		@Override
		public Adapter caseSequenceMapping(SequenceMapping object) {
			return createSequenceMappingAdapter();
		}

		@Override
		public Adapter caseExactMapping(ExactMapping object) {
			return createExactMappingAdapter();
		}

		@Override
		public Adapter caseTransliterationMapping(TransliterationMapping object) {
			return createTransliterationMappingAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.SourceMapping <em>Source Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.SourceMapping
	 * @generated
	 */
	public Adapter createSourceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.SequenceMapping <em>Sequence Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.SequenceMapping
	 * @generated
	 */
	public Adapter createSequenceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.ExactMapping <em>Exact Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.ExactMapping
	 * @generated
	 */
	public Adapter createExactMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.TransliterationMapping <em>Transliteration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.TransliterationMapping
	 * @generated
	 */
	public Adapter createTransliterationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.example.model.encoding_model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.example.model.encoding_model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Encoding_modelAdapterFactory
