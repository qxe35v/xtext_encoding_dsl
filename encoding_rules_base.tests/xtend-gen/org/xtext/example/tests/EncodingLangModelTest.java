package org.xtext.example.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.encodingLang.Model;
import org.xtext.example.tests.EncodingLangInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(EncodingLangInjectorProvider.class)
@SuppressWarnings("all")
public class EncodingLangModelTest {
  @Inject
  @Extension
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void modelTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source ascii {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias Ascii");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("target UTF8 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("0x01 = 0x34");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("0x02 ~ 0x11");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("0xFe = 0xFF");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("target Unicode {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("source a {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("target b {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("0x12 = 0x13");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("source c{}");
      _builder.newLine();
      final Model model = this.parseHelper.parse(_builder);
      Assert.assertNotNull(model);
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
      Assert.assertEquals(model.getElements().size(), 3);
      Assert.assertEquals(model.getElements().get(0).getName(), "ascii");
      Assert.assertEquals(model.getElements().get(0).getConversions().size(), 2);
      Assert.assertEquals(model.getElements().get(0).getConversions().get(0).getName(), "UTF8");
      Assert.assertEquals(model.getElements().get(0).getConversions().get(1).getName(), "Unicode");
      Assert.assertEquals(model.getElements().get(0).getConversions().get(0).getMappings().size(), 3);
      Assert.assertEquals(model.getElements().get(1).getName(), "a");
      Assert.assertEquals(model.getElements().get(1).getConversions().size(), 1);
      Assert.assertEquals(model.getElements().get(1).getConversions().get(0).getName(), "b");
      Assert.assertEquals(model.getElements().get(1).getConversions().get(0).getMappings().size(), 1);
      Assert.assertEquals(model.getElements().get(1).getConversions().get(0).getMappings().get(0).getFrom(), "0x12");
      Assert.assertEquals(model.getElements().get(1).getConversions().get(0).getMappings().get(0).getTo(), "0x13");
      Assert.assertEquals(model.getElements().get(2).getName(), "c");
      Assert.assertEquals(model.getElements().get(2).getConversions().size(), 0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
