package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTabsAndWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement wikipedia = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		wait.until(ExpectedConditions.elementToBeClickable(wikipedia));
		wikipedia.sendKeys("Google");
		Thread.sleep(1000);
		wikipedia.sendKeys(Keys.ENTER);

		// hard coded wait - which is not at all recommended
		// - Implicit waits - synchronization
		// - Explicit waits

		// polling time - 500 ms - 0.5 s	
		WebElement linkOne = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/child::div[1]/a"));
		wait.until(ExpectedConditions.visibilityOf(linkOne));
		linkOne.click();

		Thread.sleep(1000);
		Set<String> openTabs = driver.getWindowHandles();
		System.out.println(openTabs.size());

		List tabs = new ArrayList<String>(openTabs);

		driver.switchTo().window((String) tabs.get(1));
		WebElement viewSource = driver.findElement(By.xpath("//span[text()='View source']"));
		// initialization of explicit wait
		// It will wait for webelement to be visible on the page and keep on polling for
		// every 0.5s upto 25 s
		wait.until(ExpectedConditions.visibilityOf(viewSource));
		viewSource.click();

		driver.switchTo().defaultContent();

	}
}
