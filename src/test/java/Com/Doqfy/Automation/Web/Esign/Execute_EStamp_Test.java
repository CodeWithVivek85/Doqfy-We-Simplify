package Com.Doqfy.Automation.Web.Esign;

import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepositary.DashboardPage;
import objectRepositary.EstampPage;

public class Execute_EStamp_Test extends BaseClass{
	@Test
	public void ExecteEstampTest() throws Throwable
	{
// NAVIGATE TO DASHBOARD AND CLICK ON SERVICES---------------->	
		DashboardPage dp= new DashboardPage(driver);
		dp.getServicesOption().click();
		dp.geteStampOption().click();
		
		EstampPage esp = new EstampPage(driver);
		esp.getSelectCustomRadioButton().click();
//GETTING DATA FROM THE EXCEL:---------------->
		String firstPartName = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 1);
		String secPartyName = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 1);
		String purposeOfStamp = ExcelUtility.getDataFromExcelEstamp("eStamp", 1, 2);
// NAVIGATE TO ESTAMP PAGE:---------------->
		scrollToMiddleOfThePageForEstamp();
//		
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
// SELECT NO PAYMENT OPTION AND EXECUTE THE CONTRACT--------------->
		esp.getContinueWithoutPayment().click();
		esp.getPlaceOrderButtom().click();
		Thread.sleep(500);
		esp.getYesButtomToCompleteContract().click();
		esp.getProceedToPlaceOrder().click();
	}

}
