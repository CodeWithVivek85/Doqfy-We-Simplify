package baseClassUtility;
/**
 * @author Vivek
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import genericUtility.FileUtility;
import objectRepositary.LoginPage;
import objectRepositary.OrderPlacePage;

public class BaseClass {
	public WebDriver driver;
	
	FileUtility fu;
	/**
	 * @throws Throwable
	 */
	@BeforeMethod
	public void loginToClM() throws Throwable
	{
		fu= new FileUtility();
		String url=fu.getDataFromPropertiesFile("url");
		String userName= fu.getDataFromPropertiesFile("userName");
		String password= fu.getDataFromPropertiesFile("password");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// LOG in to CLM :-
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.getMailIdTextField().sendKeys(userName);
		lp.getPassTextField().sendKeys(password);
		lp.getLoginButton().click();
	
	}
	
	/**
	 * @throws AWTException
	 */
	public void uploadAFile() throws AWTException {
		String path = "C:\\Users\\Vivake\\Desktop\\docs\\Renewal.pdf";
		WebElement inputFile = driver.findElement(By.xpath("//button[.='Choose Files ']"));
		inputFile.click();
		StringSelection strS = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strS, null);

		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	public void scrollToMiddleOfThePage() throws Throwable {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
	}
	/**
	 * 
	 */
	public void scrollToTheBottom() {
		Actions action = new Actions(driver);
		try {
			for (int i = 0; i < 5; i++) {
				// Adjust number of iterations as needed
				action.sendKeys(org.openqa.selenium.Keys.END).perform();
				Thread.sleep(500);// Pause to allow scrolling to stabilize
				}
			}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * @throws InterruptedException
	 */
	@AfterMethod
	public void logOutFromCLM() throws InterruptedException {
		// LOG OUT TO THE APPLICATION-------------------------------------->
				Thread.sleep(1000);
				OrderPlacePage opp= new OrderPlacePage(driver);
				opp.getProfileDropdown().click();
				opp.getLogOutOption().click();
	}
}
