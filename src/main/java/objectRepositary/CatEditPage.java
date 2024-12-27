package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatEditPage {
	WebDriver driver;
	public CatEditPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
// ADDING THE ELEMENTS OF CAT EDIT SELECT TEMPLET PAGE----------->
	@FindBy(xpath = "//span[.='Select Template']")
	private WebElement selectTemplet;
	@FindBy(xpath = "//li[@aria-label=\"Reelib Agreement\"]")
	private WebElement SelectReelibAgreement;
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextbuttom;
	@FindBy(xpath = "//span[.='Back']")
	private WebElement backButton;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelectTemplet() {
		return selectTemplet;
	}
	public WebElement getSelectReelibAgreement() {
		return SelectReelibAgreement;
	}
	public WebElement getNextbuttom() {
		return nextbuttom;
	}
	public WebElement getBackButton() {
		return backButton;
	}
}
