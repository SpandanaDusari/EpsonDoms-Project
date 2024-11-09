package Epson.PageRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	private static final WebElement ContactUs = null;

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "mobile")
	private WebElement mobile;

	@FindBy(xpath = "//input[contains(@type,'datetime-local')]")
	private WebElement birth;

	@FindBy(xpath = "(//input[contains(@type,'radio')])[2]")
	public WebElement gender;

	@FindBy(xpath = "(//input[contains(@type=,'radio')])[2]")
	public WebElement getemail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement get89mobile() {
		return mobile;
	}

	public WebElement getContactUs() {
		return ContactUs;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
