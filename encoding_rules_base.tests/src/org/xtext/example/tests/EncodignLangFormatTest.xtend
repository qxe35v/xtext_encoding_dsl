package org.xtext.example.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EncodingLangInjectorProvider)
class EncodignLangFormatTest {
	@Inject extension FormatterTestHelper formatterTester

	@Test
	def void formatting() {
		assertFormatted[
			toBeFormatted = '''
				source test {
							// need alias
					target a{
							0xabcd = 0xef
					0xa2b4 = 0xde449c
					}
				}
				source test2 {
					alias test2alias target b {
					0xaaacda ~ 0xf8ff
					0xb7 ~ 0xf32a6b
					}}
			'''
			expectation = '''
				source test {
					// need alias
					target a {
						0xabcd = 0xef
						0xa2b4 = 0xde449c
					}
				}
				source test2 {
					alias test2alias
					target b {
						0xaaacda ~ 0xf8ff
						0xb7 ~ 0xf32a6b
					}
				}
			'''
		]
	}
}
