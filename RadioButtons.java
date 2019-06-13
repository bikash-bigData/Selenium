import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/tooldropdown.htm");
		
		System.out.println(driver.findElements(By.xpath("//*[@name='go']")).size());
		//driver.findElement(By.xpath("//*[@class='table5']/input[2]")).click();
		
		for (int i=1; i<6; i++)
		{
			for (int j=0;j<2;j++)
			{
			driver.findElements(By.xpath("//*[@class='table5']/input")).get(j).click();
			Thread.sleep(500);
			}
		}
		//driver.quit();*/
		
	
		
		
		
	}

}
