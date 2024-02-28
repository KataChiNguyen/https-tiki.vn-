import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://tiki.vn/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Click on link 'Nh\xe0 S\xe1ch Tiki' -> Navigate to page 'nha-sach-tiki/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/hyperlink_nh_s_ch_tiki'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_nh_s_ch_tiki'))

"Step 3: Click on link '\u0111i\u1ec7n gia d\u1ee5ng' -> Navigate to page 'dien-gia-dung/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_nha-sach-tiki/hyperlink_i_n_gia_d_ng'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/nha-sach-tiki/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_nha-sach-tiki/hyperlink_i_n_gia_d_ng'))

"Step 4: Click on link 'xe c\u1ed9' -> Navigate to page 'o-to-xe-may-xe-dap/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_dien-gia-dung/hyperlink_xe_c'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dien-gia-dung/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dien-gia-dung/hyperlink_xe_c'))

"Step 5: Click on link 'm\u1eb9 & b\xe9' -> Navigate to page 'do-choi-me-be/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_o-to-xe-may-xe-dap/hyperlink_m_b'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/o-to-xe-may-xe-dap/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_o-to-xe-may-xe-dap/hyperlink_m_b'))

"Step 6: Click on link 'kh\u1ecfe \u0111\u1eb9p' -> Navigate to page 'lam-dep-suc-khoe/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_do-choi-me-be/hyperlink_kh_e_p'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/do-choi-me-be/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_do-choi-me-be/hyperlink_kh_e_p'))

"Step 7: Click on link 'nh\xe0 c\u1eeda' -> Navigate to page 'nha-cua-doi-song/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_lam-dep-suc-khoe/hyperlink_nh_c_a'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/lam-dep-suc-khoe/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lam-dep-suc-khoe/hyperlink_nh_c_a'))

"Step 8: Click on link 'D\u1ee5ng c\u1ee5 nh\xe0 b\u1ebfp' -> Navigate to page 'nha-bep/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_nha-cua-doi-song/hyperlink_d_ng_c_nh_b_p'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/nha-cua-doi-song/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_nha-cua-doi-song/hyperlink_d_ng_c_nh_b_p'))

"Step 9: Click on link 'D\u1ee5ng c\u1ee5 n\u1ea5u \u0103n' -> Navigate to page 'dung-cu-nau-an/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_nha-bep/hyperlink_d_ng_c_n_u_n'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/nha-bep/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_nha-bep/hyperlink_d_ng_c_n_u_n'))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Access to Kitchenware Cooking Tools Section_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
