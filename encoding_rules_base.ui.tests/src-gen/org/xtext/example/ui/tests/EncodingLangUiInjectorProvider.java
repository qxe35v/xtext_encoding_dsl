/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import encoding_rules_base.ui.internal.Encoding_rules_baseActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class EncodingLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Encoding_rules_baseActivator.getInstance().getInjector("org.xtext.example.EncodingLang");
	}

}
