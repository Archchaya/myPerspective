package myP1_pageobjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.ConfigReader.getPassword;
import static utils.ConfigReader.getUrl;
import static utils.ConfigReader.getUsername;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage_objects  {

	WebDriver driver;
	
	
	//@Before(order=0)
	public void launchURL() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(getUrl());
	}
	
	By UserName = By.xpath("//*[@id='UserName']");
	By Password = By.xpath("//*[@id='Password']");
	By Signin= By.xpath("//*[@id=\"form\"]/section/footer/div/div[2]/button[1]");
	
	/*
	 * @FindBy(xpath = "//*[@id='UserName']") WebElement UserName;
	 * 
	 * @FindBy(xpath = "//*[@id='Password']") WebElement Password;
	 * 
	 * @FindBy(xpath = "(//button[@type='submit'])[1]") WebElement Signin;
	 */
	
	public void getCredentials() throws IOException, InterruptedException{
		 driver.findElement(UserName).sendKeys(getUsername());
		Thread.sleep(2000);
	    driver.findElement(Password).sendKeys(getPassword());
		Thread.sleep(2000);
	}
	
	public void getSignin() throws InterruptedException {
          driver.findElement(Signin).click();
          Thread.sleep(1000);
	}
	
	
	public void tearDown() {
		driver.quit();
	}

}
