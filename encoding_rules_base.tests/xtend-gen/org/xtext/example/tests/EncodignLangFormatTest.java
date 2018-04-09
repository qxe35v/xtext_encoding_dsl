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
      _builder.append("//comment");
      _builder.newLine();
      _builder.newLine();
      _builder.append("source someEncodingName{");
      _builder.newLine();
      _builder.append("alias anAliasName alias /*dads */ \tanotherAliasName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x0001 =0x0012 //exact");
      _builder.newLine();
      _builder.append("0x0002~0x0954");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("//comment");
      _builder_1.newLine();
      _builder_1.append("source someEncodingName {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias anAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias /*dads */ anotherAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0001 = 0x0012 // exact");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0002 ~ 0x0954");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this.formatterTester.assertFormatted(_function);
  }
  
  @Test
  public void formatting_MultipleSource() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//comment");
      _builder.newLine();
      _builder.newLine();
      _builder.append("source someEncodingName{");
      _builder.newLine();
      _builder.append("alias anAliasName alias /*dads */ \tanotherAliasName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x0001 =0x0012 //exact");
      _builder.newLine();
      _builder.append("0x0002~0x0954");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//comment");
      _builder.newLine();
      _builder.newLine();
      _builder.append("source someEncodingName{");
      _builder.newLine();
      _builder.append("alias anAliasName alias /*dads */ \tanotherAliasName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x0001 =0x0012 //exact");
      _builder.newLine();
      _builder.append("0x0002~0x0954");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("//comment");
      _builder_1.newLine();
      _builder_1.append("source someEncodingName {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias anAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias /*dads */ anotherAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0001 = 0x0012 // exact");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0002 ~ 0x0954");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("//comment");
      _builder_1.newLine();
      _builder_1.append("source someEncodingName {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias anAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("alias /*dads */ anotherAliasName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0001 = 0x0012 // exact");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("0x0002 ~ 0x0954");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this.formatterTester.assertFormatted(_function);
  }
}
