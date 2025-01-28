package objectRepositary;
/**
 * @author Vivek
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatEditReelibAgreementPage {
	WebDriver driver;
	/**
	 * @param driver
	 */
	public CatEditReelibAgreementPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder=\"Agreement_date\"]")
	private WebElement agreementDate;
	@FindBy(xpath = "//input[@placeholder=\"Licensor name\"]")
	private WebElement licensorName;
	@FindBy(xpath = "//input[@placeholder=\"License name\"]")
	private WebElement licenseName;
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextButton;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAgreementDate() {
		return agreementDate;
	}
	public WebElement getLicensorName() {
		return licensorName;
	}
	public WebElement getLicenseName() {
		return licenseName;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	
	


}
