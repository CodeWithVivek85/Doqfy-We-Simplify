package objectRepositary;
import org.openqa.selenium.WebDriver;
/**
 * @author Vivek
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacePage {
	WebDriver driver;
	public OrderPlacePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "dropdownMenuButton1")
	private WebElement profileDropdown;
	@FindBy(xpath = "//a[.='Log out ']")
	private WebElement logOutOption;
	@FindBy(linkText = "Settings")
	private WebElement settingOption;
	@FindBy(linkText = "Profile")
	private WebElement profileOption;
	
	public WebElement getProfileDropdown() {
		return profileDropdown;
	}
	public WebElement getLogOutOption() {
		return logOutOption;
	}
	public WebElement getSettingOption() {
		return settingOption;
	}
	public WebElement getProfileOption() {
		return profileOption;
	}

}
