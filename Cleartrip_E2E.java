import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip_E2E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		// Thread.sleep(2000);

		System.out.println(driver.findElement(
				By.id("flightsHomeFlashSaleBanner")).getText());
		// driver.findElement(By.id("FromTag")).sendKeys("Pune");
		// Thread.sleep(1000);
		// driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(
				By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active "))
				.click();
		Select adults = new Select(driver.findElement(By.id("Adults")));
		Select children = new Select(driver.findElement(By.id("Childrens")));
		Select infants = new Select(driver.findElement(By.id("Infants")));
		adults.selectByValue("4");
		children.selectByValue("3");
		infants.selectByValue("2");
		Thread.sleep(3000);
		driver.quit();

	}

}
