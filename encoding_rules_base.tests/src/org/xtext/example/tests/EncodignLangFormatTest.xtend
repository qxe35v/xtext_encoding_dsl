package org.xtext.example.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EncodingLangInjectorProvider)
class EncodignLangFormatTest{
	@Inject	extension FormatterTestHelper formatterTester
	
	@Test
	def void formatting() {
		assertFormatted[
			toBeFormatted= '''
				//comment
				
				source someEncodingName{
				alias anAliasName alias /*dads */ 	anotherAliasName
					0x0001 =0x0012 //exact
				0x0002~0x0954
				
				}
			'''
			expectation = '''
				//comment
				source someEncodingName {
					alias anAliasName
					alias /*dads */ anotherAliasName
					0x0001 = 0x0012 // exact
					0x0002 ~ 0x0954
				}
			'''
		]
	}
	
}