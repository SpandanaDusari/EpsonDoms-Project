package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Test {

	public static void main(String[] args) throws IOException {
		//Configure The Browser
		WebDriverManager.chromedriver().setup();
		
		
		//<Launch The Browser
		WebDriver driver = new ChromeDriver();
		
         WorkbookFactory.create(false);
	}
	@Test
	public void DemoTest()
	{
}
}
