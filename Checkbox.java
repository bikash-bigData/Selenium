import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


@SuppressWarnings("deprecation")
public class Checkbox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
	
	//System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
	driver.findElement(By.cssSelector("input[id*=IndArm]")).click();
	
	System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
	driver.quit();
		
		
		
	}

}
