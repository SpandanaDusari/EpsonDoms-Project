package Epson.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Epson.WebDriverLibrary.WebDriverUtility;

public class JavaScriptUtlility {
	
 private static final String WebDriverutility = null;
public static JavascriptExecutor javascriptobj;
 
	public static void enterData_DisableElement(WebElement element,String data)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("argument[0].value="+data+"",element);
		}
	public static void click_DisabledElemeent()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("argument[0].click()",element);
	}
	public static void defaultscrollBy()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
	    javascriptobj.executeScript("window.scrollBy(1000,1000)");		
		
	}
	public static void defaultscrollTo()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
	    javascriptobj.executeScript("window.scrollBy(1000,1000)");		
		
		
	}
	public static void scrollUsingView(WebElement element,boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
				
		javascriptobj.executeScript("arguments[0].scrollntoView("+value+");",element);
		
	}
	
}
