package objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Estamp {
	@FindBy(id = "custom")
	private WebElement selectCustomRadioButton;
	@FindBy(xpath = "//input[@placeholder=\"Enter first party name\"]")
	private WebElement firstPartyname;
	@FindBy(xpath = "//input[@placeholder=\"Enter second party name\"]")
	private WebElement secondPartyName;
	@FindBy(xpath = "//span[.='Select stamp duty paid by']")
	private WebElement stampDutyPaidBy;
	@FindBy(xpath = "//span[.='First Party']")
	private WebElement selectFirstParty;
	@FindBy(xpath = "//input[@placeholder=\"Enter Purpose\"]")
	private WebElement purposeOfStampDuty;
	@FindBy(xpath = "//p-dropdown[@placeholder=\"Select State\"]")
	private WebElement selectState;
	@FindBy(xpath = "//input[@class=\"p-dropdown-filter p-inputtext p-component\"]")
	private WebElement enterStateName;
	@FindBy(xpath = "//span[@class=\"ng-star-inserted\"]")
	private WebElement selectStateName;
	@FindBy(xpath = "//p-dropdown[@formcontrolname=\"selectBranch\"]")
	private WebElement selectBranchDropDown;
	@FindBy(xpath = "//li[@class=\"p-ripple p-element p-dropdown-item\"]")
	private WebElement selectBranch;
	@FindBy(xpath = "//span[.='Select Article Number']")
	private WebElement selectArticleNumber;
	@FindBy(id = "no")
	private WebElement ContinueWithoutPayment;
	@FindBy(id = "yes")
	private WebElement ContinueWithPayment;
	@FindBy(xpath = "//span[.='Place Order']")
	private WebElement placeOrderButtom;
	@FindBy(xpath = "//span[.='Yes']")
	private WebElement yesButtomToCompleteContract;
	@FindBy(xpath = "//span[.='No']")
	private WebElement noButtomToCancelContract;
	
	public WebElement getSelectCustomRadioButton() {
		return selectCustomRadioButton;
	}
	public WebElement getFirstPartyname() {
		return firstPartyname;
	}
	public WebElement getSecondPartyName() {
		return secondPartyName;
	}
	public WebElement getStampDutyPaidBy() {
		return stampDutyPaidBy;
	}
	public WebElement getSelectFirstParty() {
		return selectFirstParty;
	}
	public WebElement getPurposeOfStampDuty() {
		return purposeOfStampDuty;
	}
	public WebElement getSelectState() {
		return selectState;
	}
	public WebElement getEnterStateName() {
		return enterStateName;
	}
	public WebElement getSelectStateName() {
		return selectStateName;
	}
	public WebElement getSelectBranchDropDown() {
		return selectBranchDropDown;
	}
	public WebElement getSelectBranch() {
		return selectBranch;
	}
	public WebElement getSelectArticleNumber() {
		return selectArticleNumber;
	}
	public WebElement getContinueWithoutPayment() {
		return ContinueWithoutPayment;
	}
	public WebElement getContinueWithPayment() {
		return ContinueWithPayment;
	}
	public WebElement getPlaceOrderButtom() {
		return placeOrderButtom;
	}
	public WebElement getYesButtomToCompleteContract() {
		return yesButtomToCompleteContract;
	}
	public WebElement getNoButtomToCancelContract() {
		return noButtomToCancelContract;
	}
	
	
}

