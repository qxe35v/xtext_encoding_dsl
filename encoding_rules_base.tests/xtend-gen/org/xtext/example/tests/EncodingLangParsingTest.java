/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.encodingLang.Model;
import org.xtext.example.tests.EncodingLangInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(EncodingLangInjectorProvider.class)
@SuppressWarnings("all")
public class EncodingLangParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void simpleSource() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multipleAliases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias testAlias1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias TestAlias2");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void comment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{ //comment1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias testAlias1 //comment2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/*commentline1");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("commentline2*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias TestAlias2");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multipleMapping_2Bytes_NumOnly() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x1122=0x1234");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x4567~0x8593");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x1568=0x2114");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x6574=0x9435");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x5769~0x1286");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mixed_2Bytes_NumOnly() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias TestAlias1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x1468=0x3487");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias TestAlias2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x3537~0x5367");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0x8648~0x2946");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multipleMapping_2Bytes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xabcd=0xefef");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/*0xa2b4=0xde9c");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("0xaaaa~0xffff");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("0xb78c~0xf32a*/");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multipleMapping_MultipleBytes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xabcd=0xef");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xa2b4=0xde449c");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xaaacda~0xf8ff");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xb7~0xf32a6b");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void multipleSource() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source test{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("//need alias");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xabcd=0xef");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xa2b4=0xde449c}");
      _builder.newLine();
      _builder.append("source test2{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("alias test2alias");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xaaacda~0xf8ff");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0xb7~0xf32a6b");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
