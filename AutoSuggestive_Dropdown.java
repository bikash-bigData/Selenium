import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(2000);

		/*driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		source.click();
		Thread.sleep(1000);
		source.sendKeys("KOLK");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		source = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000);
		source.click();
		Thread.sleep(1000);
		source.sendKeys("DEL");
		Thread.sleep(3000);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.ENTER);*/
		
		driver.findElement(By.id("fromCity")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("PUN"); Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN); from.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("BAN"); Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN); to.sendKeys(Keys.ENTER);
		
		
	}

}
