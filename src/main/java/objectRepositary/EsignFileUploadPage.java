package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EsignFileUploadPage {
	WebDriver driver;
	public EsignFileUploadPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class=\"row\"]/descendant::span[.='Upload']")
	private WebElement uploadButton;
	@FindBy(xpath = "//button[.='Choose Files ']")
	private WebElement chooseFileButton;
	@FindBy(xpath = "//div[@class=\"row mt-4\"]/descendant::span[.='Upload']")
	private WebElement uploadPdfDocument;
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextbutton;
	
	public WebElement getUploadButton() {
		return uploadButton;
	}
	public WebElement getChooseFileButton() {
		return chooseFileButton;
	}
	public WebElement getUploadPdfDocument() {
		return uploadPdfDocument;
	}
	public WebElement getNextbutton() {
		return nextbutton;
	}
	
	
}
