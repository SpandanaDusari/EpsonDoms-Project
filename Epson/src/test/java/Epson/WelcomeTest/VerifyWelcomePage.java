package Epson.WelcomeTest;

import java.util.concurrent.TimeUnit;
import Epson.GenericLibrary.Base_Test;
import Epson.PageRepository.WelcomePage;

public class VerifyWelcomePage extends Base_Test {
          
	public static void main(String[] args) {
		
		System.out.println("Execution Started succesfully");
		
		//Execute the pre-condition--->1.Launch the Browser
		                            // 2.Navigate the URL
		Base_Test.browserSetUp("Chrome");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Verify the title
		String expTitle = "Learning Selenium";
		
		String actualTitle = driver.getTitle();
		
		if (expTitle.equals(actualTitle)) {
			System.out.println("Succesfully verified");
		}
		else {
			System.out.println("Not matching");
		}
		System.out.println("Launched the browser");
		
		//create obj to the web page
		WelcomePage obj = new WelcomePage(driver);
		
		//verify the UserName
		boolean result = obj.getName().isDisplayed();
		
		if (result) {
			System.out.println("Succesfully verified the UserName");
		}
		else {
			System.out.println("Not verified the UserName");
		}
		
		//perform clear action
		obj.getName().clear();
		System.out.println("performed clear action class");
		
		//Sendkeys action class
		obj.getName().sendKeys("SumaUrmieSpandu");
		System.out.println("performed sendkeys action class");
		
		try {
		Thread.sleep(2000);}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Execute the postcondition ---->1.Terminate the browser
		
		Base_Test.terminateBrowser();
		
		//Execution log or status
		System.out.println("Execution completed succesfully");
		
	}
}