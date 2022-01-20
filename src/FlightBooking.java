import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightBooking {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println("REached this page");

		// ********* Selecting Drop down

		WebElement staticdd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdd);

		dropdown.selectByValue("USD");
		// System.out.println();

		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		// WhileLoop
		/*
		 * int i = 1; while(i<5){
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 */

		// For Loop
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// *[@value='HYD']

		driver.findElement(By.xpath("(//a[@value='HYD'])")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']"))
				.click();
		Thread.sleep(2000L);

		/*
		 * driver.findElement(By.id("autosuggest")).sendKeys("AUS");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * List<WebElement> options
		 * =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * 
		 * for(WebElement option :options)
		 * 
		 * {
		 * 
		 * if(option.getText().equalsIgnoreCase("Austria"))
		 * 
		 * {
		 * 
		 * option.click(); System.out.println("Option is available");
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */

		// driver.quit();

	}

}
