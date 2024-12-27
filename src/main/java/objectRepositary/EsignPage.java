package objectRepositary;
import org.openqa.selenium.WebDriver;
/**
 * @author Vivek
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EsignPage {
	WebDriver driver;
	public EsignPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "custom")
	private WebElement customRadioButton;
	@FindBy(id = "default")
	private WebElement defaultRadioButton;
	@FindBy(xpath = "//input[@formcontrolname=\"name\"]")
	private WebElement firstSingnatoryTextField;
	@FindBy(xpath = "//input[@formcontrolname=\"email\"]")
	private WebElement firstSingnatoryMailId;
	@FindBy(xpath = "//input[@formcontrolname=\"contact_number\"]")
	private WebElement firstSingnatoryMobileNo;
	@FindBy(xpath = "//p-dropdown[@formcontrolname='method']//div[@aria-label='dropdown trigger']")
	private WebElement firstSingnatoryEsignMethod;
	@FindBy(xpath = "//span[.='Electronic']")
	private WebElement SelectFirstSingnatoryEsignMethod;
	@FindBy(xpath = "//div[@class=\"col-lg-4 col-sm-4 col-md-4 overlay_Z_1\"]//span[.='Select']")
	private WebElement SelectFirstSingnaturePlacement;
	@FindBy(xpath = "//span[.='Pre-Defined']")
	private WebElement SelectSingnaturePlacementOption;
	
	@FindBy(xpath = "//span[.='Select']")
	private WebElement eSelectSignPosition;
	
		@FindBy(xpath = "//div[.=' Top Left ']")
	private WebElement eSignPosition;
	@FindBy(id = "no")
	private WebElement selectNopaymentOption;
	@FindBy(xpath = "//span[.='No , Proceed to Place Order']")
	private WebElement proceedWithoutPayment;
	@FindBy(xpath = "//span[.='Place Order']")
	private WebElement placeOrderButton;
	
// --------------GETTERS METHOD FOR ALL THE ELEMENTS--------------
	
	public WebElement getCustomRadioButton() {
		return customRadioButton;
	}
	public WebElement getDefaultRadioButton() {
		return defaultRadioButton;
	}
	public WebElement getFirstSingnatoryTextField() {
		return firstSingnatoryTextField;
	}
	public WebElement getFirstSingnatoryMailId() {
		return firstSingnatoryMailId;
	}
	public WebElement getFirstSingnatoryMobileNo() {
		return firstSingnatoryMobileNo;
	}
	public WebElement getFirstSingnatoryEsignMethod() {
		return firstSingnatoryEsignMethod;
	}
	public WebElement getSelectFirstSingnatoryEsignMethod() {
		return SelectFirstSingnatoryEsignMethod;
	}
	public WebElement getSelectFirstSingnaturePlacement() {
		return SelectFirstSingnaturePlacement;
	}
	public WebElement getSelectSingnaturePlacementOption() {
		return SelectSingnaturePlacementOption;
	}
	public WebElement geteSignPosition() {
		return eSignPosition;
	}
	public WebElement geteSelectSignPosition() {
		return eSelectSignPosition;
	}

	public WebElement getSelectNopaymentOption() {
		return selectNopaymentOption;
	}
	public WebElement getProceedWithoutPayment() {
		return proceedWithoutPayment;
	}
	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}
	
	
	
	
	
	
}
