package Com.Doqfy.Automation.Web.Esign;
/**
 * @author Vivek
 */
import org.testng.annotations.Test;
import baseClassUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepositary.DashboardPage;
import objectRepositary.EsignFileUploadPage;
import objectRepositary.EsignPage;
import objectRepositary.OrderPlacePage;

/**
 * 
 */
public class ExecuteEsign_Test extends BaseClass {
	@Test
	public void eSignWithSingleSign() throws Throwable
	{
// NAVIGATE TO DASHBOARD AND CLICK ON SERVICES---------------->
		DashboardPage dbp= new DashboardPage(driver);
		dbp.getServicesOption().click();
		
// CLICK ON E-SIGN OPTION------------------------------------->
		dbp.geteSignOption().click();
		
//UPLOAD A FILE AND MOVE TO THE NEXT PAGE--------------------->
		EsignFileUploadPage esp= new EsignFileUploadPage(driver);
		esp.getUploadButton().click();
		uploadAFile();
		esp.getUploadPdfDocument().click();
		scrollToTheBottom();
		esp.getNextbutton().click();
		
// FILL ALL THE TEXT FIELDS IN ESIGN PAGE---------------------->
		EsignPage eSign = new EsignPage(driver);
		
// CLICK ON CUSTOM RADIO BUTTON---------------->
		eSign.getCustomRadioButton().click();
		
// GET DATA FROM EXCEL---------------->
		String eSignName =ExcelUtility.getDataFromExcelEsign("eSign", 1, 0);
		String eSignEmail = ExcelUtility.getDataFromExcelEsign("eSign", 1, 1);
		String mobileNo = ExcelUtility.getDataFromExcelEsign("eSign", 1, 2);
		
// SCROLL TO THE MIDDLE OF THE PAGE------------------------------>
		scrollToMiddleOfThePage();
		
// TAKING NAME AND MAIL-ID FROM EXCEL---------------------------->
		eSign.getFirstSingnatoryTextField().sendKeys(eSignName);
		eSign.getFirstSingnatoryMailId().sendKeys(eSignEmail);
		eSign.getFirstSingnatoryMobileNo().sendKeys(mobileNo);
		
// SELECT DROPDOWNS---------------------------------------------->
		eSign.getFirstSingnatoryEsignMethod().click();
		eSign.getSelectFirstSingnatoryEsignMethod().click();
		eSign.getSelectFirstSingnaturePlacement().click();
		eSign.getSelectSingnaturePlacementOption().click();
		
//SELECT ESIGN POSITION------------------------------------------->
		eSign.geteSelectSignPosition().click();
		eSign.geteSignPosition().click();
		
// SCROLL TO THE BOTTOM------------------------------------------->
		Thread.sleep(500);
		scrollToTheBottom();
		
// SELECT NO PAYMENT OPTION AND EXECUTE THE CONTRACT--------------->
		eSign.getSelectNopaymentOption().click();
		eSign.getPlaceOrderButton().click();
		eSign.getProceedWithoutPayment().click();
	}
}
