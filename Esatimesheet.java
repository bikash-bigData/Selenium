import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Esatimesheet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onecognizant.cognizant.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtPlatformBarSearch")).sendKeys(
				"submit timesheet");
		driver.findElement(By.id("txtPlatformBarSearch")).sendKeys(Keys.ENTER);

		String winHandleBefore = driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		
		WebElement frame1 = driver.findElement(By.id("appFrame"));
		driver.switchTo().frame(frame1);
		
		WebDriverWait d = new WebDriverWait(driver, 1);
//		driver.findElement(By.xpath("//h3[text()= 'Submit Timesheet']")).click();
		
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[text()= 'Submit Timesheet']")));
		

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();

		}

		driver.switchTo().window(winHandleBefore);

	}

}
