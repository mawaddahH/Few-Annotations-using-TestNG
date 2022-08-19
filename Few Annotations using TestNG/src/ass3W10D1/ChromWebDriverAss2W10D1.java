/**
 * @author Mawaddah Hanbali
 */
package ass3W10D1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriverAss2W10D1 {
	public WebDriver driver;

	/**
	 * Set up browser settings
	 */

	@BeforeSuite
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * open the website
	 */

	@BeforeTest
	public void openWebsite() {

		// Navigate to a WebSite
		driver.navigate().to("https://twitter.com/i/flow/login");

		// Maximize current window
		driver.manage().window().maximize();
	}

	/**
	 * Test log-in
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void login() throws InterruptedException {

		// wait until the login form appears.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='text']")));

		// email
		WebElement usename = driver.findElement(By.xpath("//input[@name='text']"));
		usename.sendKeys("fancyMem24");

		// email
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();

		Thread.sleep(5000);

		// next1 button
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='password']"))));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("fancyMem24");

		Thread.sleep(3000);

		// login
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		login.click();

		Thread.sleep(3000);

		// login
		WebElement wrongpass = driver.findElement(By.xpath("//*[contains(text(),'Wrong password!')]"));
		wait.until(ExpectedConditions.elementToBeClickable(wrongpass));

		if (wrongpass.isDisplayed()) {
			Assert.assertEquals(wrongpass.getText(), "Wrong password!");
			System.out.println("the Message is match");
		}

	}

	/**
	 * navigate
	 */
	@AfterMethod
	public void nevigate() {
		driver.navigate().to("https://twitter.com/");
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterSuite
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
