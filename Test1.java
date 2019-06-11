import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe")	;
WebDriver driver=new ChromeDriver();
//driver.get("https://login.salesforce.com/?locale=in");
driver.manage().window().maximize();
driver.get("https://www.salesforce.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//a[@href='https://login.salesforce.com/?locale=in']")).click();
//driver.findElement(By.id("username")).sendKeys("username");
//driver.findElement(By.id("password")).sendKeys("password");
//driver.findElement(By.xpath("//*[@id='Login']")).click();
//driver.close();

driver.findElement(By.cssSelector("#username")).sendKeys("this is username");
driver.findElement(By.cssSelector("#password")).sendKeys("password");
driver.findElement(By.cssSelector("#Login")).click();
//driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
//driver.findElement(By.cssSelector("#forgotPassForm > div.verifyform > a")).click();
//driver.findElement(By.linkText("Need Help Logging In?")).click();
//driver.navigate().back();driver.navigate().back();
//System.out.println(driver.findElement(By.cssSelector("#error")).getText());

String error=driver.findElement(By.cssSelector("#error")).getText();
System.out.println(error);


/*Syntax for XPath :  //tagName[@attribute='value']
  Syntax for CSS   : tagName[attribute='value']
  XPath for Regular Expression : //tagName[contains(@attribute,'value')]
  CSS Regular Expression : tagName[attribute*='value']
  
 */





	}

}
