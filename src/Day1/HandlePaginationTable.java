package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlePaginationTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofMillis(5));
		WebElement selectProductWithProductID = driver.findElement(
				By.xpath("//table[@id='productTable']//td[text()='5']/following-sibling::td/input[@type='checkbox']"));
		clickProductWithProductID(selectProductWithProductID, driver, wait);
	}

	public static void clickProductWithProductID(WebElement element, WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
