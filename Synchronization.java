import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1561444764212");
		
		//IMPLICIT WAIT//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("Location")).sendKeys("NYC");
		driver.findElement(By.name("Location")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("Location")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[contains(@ng-model, 'checkInDate')]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@xpath=1]")).click();
		
		//EXPLICIT WAIT//
		WebDriverWait d= new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@xpath=1]"))).click();
		

	}

}
