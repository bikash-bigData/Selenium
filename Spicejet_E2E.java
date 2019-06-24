import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_E2E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);

		// Get radio button count
		int r = driver
				.findElements(
						By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td"))
				.size();
		System.out.println("There are " + r + " radiobuttons to select trip");

		for (int i = 0; i < r; i++) {
			driver.findElements(
					By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td"))
					.get(i).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.cssSelector("#MultiCityModelAlert")).click();
		driver.findElement(
				By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td"))
				.click();

		// Select Departure City//
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))
				.click();
		driver.findElement(By.xpath("//*[@class='mapbg'] //*[@value='PNQ']"))
				.click();

		// Select Arrival City//
		driver.findElement(
				By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='BLR']"))
				.click();

		// Select Depart date
		driver.findElement(
				By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"))
				.click();

		// Select passengers
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
		}
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
			Thread.sleep(1000);
		}
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
			Thread.sleep(1000);
		}
		System.out.println("Total passengers selected = "
				+ driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Select Currency
		Select s = new Select(driver.findElement(By
				.id("ctl00_mainContent_DropDownListCurrency")));
		// System.out.println("List of currency available : " + s.getOptions());
		s.selectByValue("AED");

		// Select checkbox
		driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
		Thread.sleep(2000);

		// Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
