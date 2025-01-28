package Com.Doqfy.Automation.Web.Esign;

import org.testng.annotations.Test;
import baseClassUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepositary.CatUploadPage;
import objectRepositary.DashboardPage;
import objectRepositary.EsignFileUploadPage;
import objectRepositary.EsignPage;
import objectRepositary.EstampPage;

public class Execute_CatUpload_Test extends BaseClass {
	@Test
	public void CatUpload() throws Throwable {
		DashboardPage dbp= new DashboardPage(driver);
		dbp.getServicesOption().click();
	// CAT EDIT SERVICES ARE LOADED:---------------->
		dbp.getCatUploadOption().click();
		CatUploadPage cup= new CatUploadPage(driver);
	//UPLOAD A DOCUMENT:---------------->
		scrollToTheBottom();
		cup.getFirstUploadButton().click();
		uploadAFile();
		Thread.sleep(200);
		cup.getFinalUploadButtom().click();
		scrollToTheBottom();
		cup.getNextButton().click();
	// NAVIGATE TO ESTAMP PAGE:---------------->
		EstampPage esp = new EstampPage(driver);
		esp.getSelectCustomRadioButton().click();
		String firstPartName = ExcelUtility.getDataFromExcelEstamp("eStamp", 0, 1);
		String secPartyName = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 1);
		String purposeOfStamp = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 2);
		Thread.sleep(200);
		scrollToMiddleOfThePage();
		esp.getFirstPartyname().sendKeys(firstPartName);
		esp.getSecondPartyName().sendKeys(secPartyName);
		esp.getPurposeOfStampDuty().sendKeys(purposeOfStamp);
		esp.getStampDutyPaidBy().click();
		esp.getSelectFirstParty().click();
		esp.getPurposeOfStampDuty().sendKeys("CatUploadTest");
		esp.getSelectState().click();
		esp.getEnterStateName().sendKeys("karnataka");
		esp.getSelectStateName().click();
// SELECT BRANCH---------------------->
		esp.getSelectBranchDropDown().click();
		esp.getSelectBranch().click();
// SELECT ARTICLE NUMBER---------------------->
		esp.getSelectArticleNumber().click();
		esp.getEnterArticleNumber().sendKeys("Article 5 j");
		esp.getSelectArticle5j().click();
		esp.getNextButton().click();
		Thread.sleep(1000);
		esp.getYesAllDetailsAreCorrect().click();
		Thread.sleep(200);
// FILLING ALL THE TEXT FIELDS IN ESIGN PAGE---------------------->
		EsignPage eSign = new EsignPage(driver);
		scrollToTopOfThePageForEstamp();
		eSign.getCustomRadioButton().click();
		String eSignName =ExcelUtility.getDataFromExcelEsign("eSign", 1, 0);
		String eSignEmail = ExcelUtility.getDataFromExcelEsign("eSign", 1, 1);
		String mobileNo = ExcelUtility.getDataFromExcelEsign("eSign", 1, 2);
		scrollToMiddleOfThePage();
		eSign.getFirstSingnatoryTextField().sendKeys(eSignName);
		eSign.getFirstSingnatoryMailId().sendKeys(eSignEmail);
		eSign.getFirstSingnatoryMobileNo().sendKeys(mobileNo);
		eSign.getFirstSingnatoryEsignMethod().click();
		eSign.getSelectFirstSingnatoryEsignMethod().click();
		eSign.getSelectFirstSingnaturePlacement().click();
		eSign.getSelectSingnaturePlacementOption().click();
		eSign.geteSelectSignPosition().click();
		eSign.geteSignPosition().click();
		Thread.sleep(500);
		scrollToTheBottom();
// SELECT NO PAYMENT OPTION AND EXECUTE THE CONTRACT--------------->
		eSign.getSelectNopaymentOption().click();
		eSign.getPlaceOrderButton().click();
		eSign.getProceedWithoutPayment().click();		
	}
}
