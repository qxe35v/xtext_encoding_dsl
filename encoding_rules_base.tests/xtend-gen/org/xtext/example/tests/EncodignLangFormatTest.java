package org.xtext.example.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.tests.EncodingLangInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(EncodingLangInjectorProvider.class)
@SuppressWarnings("all")
public class EncodignLangFormatTest {
  @Inject
  @Extension
  private FormatterTestHelper formatterTester;
  
  @Test
  public void formatting() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// need alias");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("target a{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("0xabcd = 0xef");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xa2b4 = 0xde449c");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("source test2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias test2alias target b {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xaaacda ~ 0xf8ff");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xb7 ~ 0xf32a6b");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("source test {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("// need alias");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("target a {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("0xabcd = 0xef");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("0xa2b4 = 0xde449c");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("source test2 {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias test2alias");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("target b {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("0xaaacda ~ 0xf8ff");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("0xb7 ~ 0xf32a6b");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this.formatterTester.assertFormatted(_function);
  }
}
