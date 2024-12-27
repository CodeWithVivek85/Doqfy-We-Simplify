package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "doqfyEmail")
	private WebElement mailIdTextField;
	@FindBy(id = "doqfypassword")
	private WebElement passTextField;
	@FindBy(xpath = "//div[@class=\"p-checkbox-box\"]")
	private WebElement rememberPassword;
	@FindBy(linkText = "Forgot Password?")
	private WebElement forgPassword;
	@FindBy(xpath = "//span[.=' Login']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMailIdTextField() {
		return mailIdTextField;
	}
	
	public WebElement getPassTextField() {
		return passTextField;
	}

	public WebElement getRememberPassword() {
		return rememberPassword;
	}

	/**
	 * @return
	 */
	public WebElement getForgPassword() {
		return forgPassword;
	}

}
