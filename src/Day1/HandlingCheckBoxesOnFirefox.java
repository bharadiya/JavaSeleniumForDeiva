package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckBoxesOnFirefox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "./src\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		WebElement male= driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input"));
		male.click();
		
		System.out.println(male.isSelected());
		
		WebElement selectCountry =driver.findElement(By.id("country"));
		Select select = new Select(selectCountry);
		
		select.selectByIndex(4);
		Thread.sleep(5000);
		select.selectByValue("germany");
		
		
		
	}
}
