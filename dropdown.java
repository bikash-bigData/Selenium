import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		for (int j=1; j<4; j++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		for(int k=1;k<4;k++)
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click(); 
		
		
		/*
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[4]/li/a")).click();
		System.out.println("I am travelling from "+ driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[3]/a)[2]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();
		System.out.println("I am travelling to "+driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
		*/
		
		}
		
		
		
		
	}


