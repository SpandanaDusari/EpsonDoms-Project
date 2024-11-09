package Epson.GenericLibrary;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {

	public static WebDriver driver;

	public static void browserSetUp(String EmptyBrowser) {

		switch (EmptyBrowser) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome Browser");
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser");
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge Browser");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
		// Step 1: Launch The Browser
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get(
				"file:///C:/Users/AJJU/OneDrive/Desktop/Selenium/com.Doms/src/main/resources/Softwares/webpage.html");

		System.out.println("Launched the browser");
	}

	public static void terminateBrowser() {
		// close the browser
		driver.quit();
		System.out.println("Closed the browser succesfully");

	}
}