package objectRepositary;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "doqfyEmail")
	private WebElement mailId;
	
	@FindBy(id = "doqfypassword")
	private WebElement passTextField;
	@FindBy(xpath = "//div[@class=\"p-checkbox-box\"]")
	private WebElement rememberPassword;
	@FindBy(linkText = "Forgot Password?")
	private WebElement forgPassword;
	
	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getPassTextField() {
		return passTextField;
	}

	public WebElement getRememberPassword() {
		return rememberPassword;
	}

	public WebElement getForgPassword() {
		return forgPassword;
	}

}
