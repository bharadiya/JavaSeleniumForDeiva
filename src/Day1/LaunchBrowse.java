package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class LaunchBrowse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@example.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("abc123");
		
		WebElement forgotPwd = driver.findElement(By.partialLinkText("Forgotten password"));
		forgotPwd.click();
		
		WebElement emailOrUserName = driver.findElement(By.xpath("//input[@id='identify_email']"));
		emailOrUserName.sendKeys("Hi we learned basic xpath");
		
		driver.quit();
	}
}
