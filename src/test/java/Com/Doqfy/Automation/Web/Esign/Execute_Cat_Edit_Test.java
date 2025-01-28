package Com.Doqfy.Automation.Web.Esign;

import org.testng.annotations.Test;
import baseClassUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepositary.CatEditPage;
import objectRepositary.CatEditReelibAgreementPage;
import objectRepositary.DashboardPage;
import objectRepositary.EsignPage;
import objectRepositary.EstampPage;

public class Execute_Cat_Edit_Test extends BaseClass{
	@Test
	public void ExecuteCatEdit() throws Throwable {
	
		DashboardPage dp= new DashboardPage(driver);
		dp.getServicesOption().click();
	// CAT EDIT SERVICES ARE LOADED:---------------->
		dp.getCatEdit().click(); 
		CatEditPage cep= new CatEditPage(driver);
		cep.getSelectTemplet().click();
		cep.getSelectReelibAgreement().click();
		cep.getNextbuttom().click();
	// SELECT THE REELIB AGREEMENT:---------------->
		CatEditReelibAgreementPage cra= new CatEditReelibAgreementPage(driver);
		cra.getAgreementDate().sendKeys("01/11/2025");
		cra.getLicensorName().sendKeys("Doqfy");
		cra.getLicenseName().sendKeys("TurboStart");
		Thread.sleep(1000);
		scrollToBottomOfPage();
		cra.getNextButton().click();
		scrollToTopOfThePageForEstamp();
	// NAVIGATE TO ESTAMP PAGE:---------------->
		EstampPage esp= new EstampPage(driver);
		esp.getSelectCustomRadioButton().click();
		String firstPartName = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 1);
		String secPartyName = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 1);
		String purposeOfStamp = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 2);
		scrollToMiddleOfThePageForEstamp();
	//FILL THE ESTAMP PAGE:---------------->
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
		scrollToTheBottom();
		esp.getNextButton().click();
		Thread.sleep(200);
		esp.getYesAllDetailsAreCorrect().click();
		Thread.sleep(200);
		scrollToTopOfThePageForEstamp();
	// NAVIGATE TO ESIGN PAGE-------->
		EsignPage eSign= new EsignPage(driver);
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
				scrollToBottomOfPage();
	// SELECT NO PAYMENT OPTION AND EXECUTE THE CONTRACT--------------->
				eSign.getSelectNopaymentOption().click();
				eSign.getPlaceOrderButton().click();
				eSign.getProceedWithoutPayment().click();	
	}

}
