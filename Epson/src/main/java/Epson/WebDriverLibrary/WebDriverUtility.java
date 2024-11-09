package Epson.WebDriverLibrary;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public static WebDriver driver;
	public static Select selectobj;
	public static Actions actionsobj;
	public static Robot robotobj;

	public static void launchBrowser(String browsername)
	{
		
	}
	public static void maximizeTheBrowser()
	{
		driver.manage().window().maximize();
	}
	public static void closeTheBrowser() {
		driver.close();
	}
	public static void closeAllTheBrowser() {
		driver.quit();
	}
	public static void waitimplicitly(Long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	public static void waitexplicitly(long duration,WebElement);
	{
		WebDriverWait wait=new WebDriverWait(driver,duration);
		wait.until(ExpectedCondition.visiblityOf(element));
	}
	
	
	public void selectOptionlnDropdown(WebElement element,int index){
		selectobj.selectByindex(index);
		}
	
	public void selectOptionlnDropdown[WebElement element,String visibletext) {
		selectobj.selectvisibletext(vissibletext);		
}
	public void selectOptionlnDropdown[string value,WebElement) {
		selectobj.selectByvalue(value);
	}

	public void mouseToHovering(WebElement element);

	{

		actionobj.moveToElement(element).perform();
	}
	public void Release

	Thekey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN;)
	}

	public void alretPopupdismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void switchControlToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	public void switchControlToWindow(String windowaddress)
	{
		driver.switchTo().window(windowaddress);
	}

}
