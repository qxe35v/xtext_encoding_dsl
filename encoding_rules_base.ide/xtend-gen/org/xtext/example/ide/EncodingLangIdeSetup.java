/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.EncodingLangRuntimeModule;
import org.xtext.example.EncodingLangStandaloneSetup;
import org.xtext.example.ide.EncodingLangIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EncodingLangIdeSetup extends EncodingLangStandaloneSetup {
  @Override
  public Injector createInjector() {
    EncodingLangRuntimeModule _encodingLangRuntimeModule = new EncodingLangRuntimeModule();
    EncodingLangIdeModule _encodingLangIdeModule = new EncodingLangIdeModule();
    return Guice.createInjector(Modules2.mixin(_encodingLangRuntimeModule, _encodingLangIdeModule));
  }
}