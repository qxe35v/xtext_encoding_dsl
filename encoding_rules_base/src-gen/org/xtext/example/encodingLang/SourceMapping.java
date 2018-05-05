/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.encodingLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.encodingLang.SourceMapping#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.encodingLang.SourceMapping#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.xtext.example.encodingLang.SourceMapping#getConversions <em>Conversions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.encodingLang.EncodingLangPackage#getSourceMapping()
 * @model
 * @generated
 */
public interface SourceMapping extends EObject
{
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
   * @see org.xtext.example.encodingLang.EncodingLangPackage#getSourceMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.encodingLang.SourceMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.encodingLang.Alias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases</em>' containment reference list.
   * @see org.xtext.example.encodingLang.EncodingLangPackage#getSourceMapping_Aliases()
   * @model containment="true"
   * @generated
   */
  EList<Alias> getAliases();

  /**
   * Returns the value of the '<em><b>Conversions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.encodingLang.Conversion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conversions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conversions</em>' containment reference list.
   * @see org.xtext.example.encodingLang.EncodingLangPackage#getSourceMapping_Conversions()
   * @model containment="true"
   * @generated
   */
  EList<Conversion> getConversions();

} // SourceMapping
