package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Services']")
	private WebElement servicesOption;
	@FindBy(xpath = "//span[.='Management']")
	private WebElement managementOption;
	@FindBy(xpath = "//span[.='Pre-Procurement']")
	private WebElement preProcurmentOption;
	@FindBy(xpath = "//span[.='Stamp Inventory']")
	private WebElement stampInventoryOption;
	@FindBy(xpath = "//span[.='Summary']")
	private WebElement summaryOption;
	@FindBy(xpath = "//span[.='Contract Upload']")
	private WebElement catUploadOption;
	@FindBy(xpath = "//span[.='Contract Edit']")
	private WebElement catEdit;
	@FindBy(xpath = "E-Stamp")
	private WebElement eStampOption;
	@FindBy(xpath = "//span[.='E-Sign']")
	private WebElement eSignOption;
	
	public WebElement getServicesOption() {
		return servicesOption;
	}
	public WebElement getManagementOption() {
		return managementOption;
	}
	public WebElement getPreProcurmentOption() {
		return preProcurmentOption;
	}
	public WebElement getStampInventoryOption() {
		return stampInventoryOption;
	}
	public WebElement getSummaryOption() {
		return summaryOption;
	}
	public WebElement getCatUploadOption() {
		return catUploadOption;
	}
	public WebElement getCatEdit() {
		return catEdit;
	}
	public WebElement geteStampOption() {
		return eStampOption;
	}
	public WebElement geteSignOption() {
		return eSignOption;
	}
	

}
