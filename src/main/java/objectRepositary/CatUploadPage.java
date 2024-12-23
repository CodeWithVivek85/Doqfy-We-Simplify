package objectRepositary;
/**
 * @author Vivek
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatUploadPage {
	
	@FindBy(xpath = "//div[@class=\"row col-lg-4 col-sm-4 col-md-4 upload-component\"]/descendant::span[.='Upload']")
	private WebElement firstUploadButton;
	@FindBy(xpath = "//button[.='Choose Files ']")
	private WebElement chooseFileToUpload;
	@FindBy(xpath = "//div[@class=\"row mt-4\"]/descendant::span[.='Upload']")
	private WebElement finalUploadButtom;
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextButton;
	
	public WebElement getFirstUploadButton() {
		return firstUploadButton;
	}
	public WebElement getChooseFileToUpload() {
		return chooseFileToUpload;
	}
	public WebElement getFinalUploadButtom() {
		return finalUploadButtom;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	

}
