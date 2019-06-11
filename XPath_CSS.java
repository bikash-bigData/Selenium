import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPath_CSS {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getCurrentUrl()); //+"  " + driver.getTitle()); 
	
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//a[contains(@class,'login-button')]")).click();
	//driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("testtest");
	//driver.findElement(By.xpath("//button[contains(@id,'username')]")).click();
	//System.out.println(driver.findElement(By.xpath("//*[@id='errServerUsername']")).getText());
	
		
	/*Syntax for XPath :  //tagName[@attribute='value']
	  Syntax for CSS   : tagName[attribute='value']
	  XPath for Regular Expression : //tagName[contains(@attribute,'value')]
	  CSS Regular Expression : tagName[attribute*='value']
	  CSS : tagName#id
	  CSS : tagName.classname
	  Relative Xpath - This does not depend on parent node
	  Absolute Xpath - This depends on parent child relation 
	*/
	
	//driver.findElement(By.xpath("//a[contains(@href,'https://login.salesforce.com/?locale=in')]")).click();
	//driver.findElement(By.cssSelector("a[href*='https://login.salesforce.com/?locale=in']")).click();
	
	//driver.findElement(By.xpath("//div[@class='ctr-p']/div[3]/form/div[2]/div/div/div/div/input")).sendKeys("Bikash");
	//driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
	//driver.findElement(By.xpath("//*[@id='topMnu']/following::li[2]")).click();
	
	//System.out.println(driver.findElement(By.xpath("//*[@id='hplogo']")).getAttribute("title"));
	
	String attr=driver.findElement(By.xpath("//*[@id='q']")).getAttribute("title");
	System.out.println(attr);
	
	
	}

}
