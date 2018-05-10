package org.xtext.example.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.xtext.example.encodingLang.Model
import org.junit.Assert
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(EncodingLangInjectorProvider)
class EncodingLangModelTest {
	@Inject
	extension ParseHelper<Model> parseHelper
	
	@Test
	def modelTest(){
		val model = '''
 		source ascii {
 			alias Ascii
 			target UTF8 {
 				0x01 = 0x34
 				0x02 ~ 0x11
 				0xFe = 0xFF
 			}
 			target Unicode {
 			}
 		}
 		source a {
 			target b {
 				0x12 = 0x13
 			}
 		}
 		source c{}
		'''.parse
		
		Assert.assertNotNull(model);
		Assert.assertTrue(model.eResource.errors.isEmpty)
		Assert.assertEquals(model.elements.size, 3);

		Assert.assertEquals(model.elements.get(0).name, "ascii")
		Assert.assertEquals(model.elements.get(0).conversions.size, 2)
		Assert.assertEquals(model.elements.get(0).conversions.get(0).name, "UTF8")
		Assert.assertEquals(model.elements.get(0).conversions.get(1).name, "Unicode")
		Assert.assertEquals(model.elements.get(0).conversions.get(0).mappings.size, 3)

		Assert.assertEquals(model.elements.get(1).name, "a")
		Assert.assertEquals(model.elements.get(1).conversions.size, 1)
		Assert.assertEquals(model.elements.get(1).conversions.get(0).name, "b")
		Assert.assertEquals(model.elements.get(1).conversions.get(0).mappings.size, 1)
		Assert.assertEquals(model.elements.get(1).conversions.get(0).mappings.get(0).from, "0x12")
		Assert.assertEquals(model.elements.get(1).conversions.get(0).mappings.get(0).to, "0x13")
		
		Assert.assertEquals(model.elements.get(2).name, "c")
		Assert.assertEquals(model.elements.get(2).conversions.size, 0)
		
	}
}