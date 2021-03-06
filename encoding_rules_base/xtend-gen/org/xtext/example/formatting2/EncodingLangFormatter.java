/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.formatting2;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.encodingLang.Alias;
import org.xtext.example.encodingLang.Conversion;
import org.xtext.example.encodingLang.Mapping;
import org.xtext.example.encodingLang.Model;
import org.xtext.example.encodingLang.SourceMapping;

@SuppressWarnings("all")
public class EncodingLangFormatter extends AbstractFormatter2 {
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<SourceMapping> _elements = model.getElements();
    for (final SourceMapping sourceMapping : _elements) {
      document.<SourceMapping>format(sourceMapping);
    }
  }
  
  protected void _format(final SourceMapping s, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(s).keyword("source"), _function);
    ISemanticRegion open = this.textRegionExtensions.regionFor(s).keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(open, _function_1), _function_2);
    ISemanticRegion close = this.textRegionExtensions.regionFor(s).keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(close, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_4);
    EList<Alias> _aliases = s.getAliases();
    for (final Alias alias : _aliases) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Alias>append(alias, _function_5);
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        document.append(document.prepend(this.textRegionExtensions.regionFor(alias).keyword("alias"), _function_6), _function_7);
      }
    }
    EList<Conversion> _conversions = s.getConversions();
    for (final Conversion conversion : _conversions) {
      {
        final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        document.append(document.prepend(this.textRegionExtensions.regionFor(conversion).keyword("target"), _function_5), _function_6);
        ISemanticRegion convopen = this.textRegionExtensions.regionFor(conversion).keyword("{");
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.oneSpace();
        };
        final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(document.prepend(convopen, _function_7), _function_8);
        ISemanticRegion convclose = this.textRegionExtensions.regionFor(conversion).keyword("}");
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.append(convclose, _function_9);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.indent();
        };
        document.<ISemanticRegion, ISemanticRegion>interior(convopen, convclose, _function_10);
        EList<Mapping> _mappings = conversion.getMappings();
        for (final Mapping mapping : _mappings) {
          {
            final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
              it.newLine();
            };
            document.<Mapping>append(mapping, _function_11);
            final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
              it.oneSpace();
            };
            document.surround(this.textRegionExtensions.regionFor(mapping).keyword("="), _function_12);
            final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
              it.oneSpace();
            };
            document.surround(this.textRegionExtensions.regionFor(mapping).keyword("~"), _function_13);
          }
        }
      }
    }
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof SourceMapping) {
      _format((SourceMapping)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
