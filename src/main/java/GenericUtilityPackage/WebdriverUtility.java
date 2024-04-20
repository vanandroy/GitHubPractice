package GenericUtilityPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this is a generic class common for all webdriver method
 * @author vivek
 * 
 */
public class WebdriverUtility {
	/**
	 * this method is used to maximize the browser
	 * @param driver
	 */
	public void maximizeWindows(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the browser
	 * @param driver
	 */
	public void minimizeWindows(WebDriver driver) {
		driver.manage().window().minimize();;
	}
	
	/**
	 * this method is used to fullscreen the browser
	 * @param driver
	 */
	public void fullscreenWindows(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
	/**
	 * this method is used to wait unitll page load
	 * @author vk
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is used to explicit wait for page load
	 * @param driver
	 * 
	 */
	public void waitUntilPageLoad(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method is used for fluent wait
	 * @param driver
	 */
	public void influentWait(WebDriver driver) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10));
	}
	/**
	 * this method is used to select value using String from dropdown
	 * @param driver
	 */
	public Select selectByVisibleText(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		return s;
	}
	/**
	 * this method is used to select value using index from dropdown
	 */
	public void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * this method is used to select value using Value from dropdown
	 */
	public void selectByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is used to print first selectd option
	 * @param element
	 * @param text
	 * @return
	 */
	public String getFirstSelectedOption(WebElement element,String text) {
		Select s=new Select(element);
		s.getFirstSelectedOption();
		return text;
	}
	/**
	 * this method is used to mouse hover the element
	 * @param element
	 * @param driver
	 */
	public void mouseHoverActions(WebElement element,WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to Doble click Actions
	 * @param element
	 * @param driver
	 */
	public void doubleclickActions(WebElement element,WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * This method is used Right click operation
	 * @param element
	 * @param driver
	 */
	public void contextClick(WebElement element,WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * this method is used to perform drag and drop operation
	 * @param driver
	 * @param src
	 * @param dst
	 */
	public void dragAndDropAction(WebDriver driver,WebElement src,WebElement dst) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dst);
	}
	/**
	 * This method is used to enter the text
	 * @param driver
	 * @param text
	 */
	public void enterKeysPress(WebDriver driver) {
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * This method is used to press enter key
	 * @param driver
	 * @throws AWTException
	 */
	public void pressEnterKey(WebDriver driver) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to release the enter key
	 * @param driver
	 * @throws Throwable
	 */
	public void releaseEnterKey(WebDriver driver) throws Throwable {
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to switched to frame using index
	 * @param driver
	 * @param index
	 */
	public void switchToFrameUsingIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the frame using name or Id
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrameUsingNameOrId(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * This method is used to switch the frame using FrameElement
	 * @param driver
	 * @param frameElement
	 */
	public void switchToFrameUsingWebElement(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
}
