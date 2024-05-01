package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnJSPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");

//		WebElement alert = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
//		alert.click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
	
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));
		prompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Deiva");
		driver.switchTo().alert().accept();
	}
}
