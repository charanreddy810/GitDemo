import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String args[]) {

		// Create driver object for Chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		System.out.println("YaYYYYYYYYYYYYY !!!! webpage launched successfully");
		driver.findElement(By.id("login1")).sendKeys("login");
		driver.findElement(By.name("passwd")).sendKeys("12345");
		// driver.findElement(By.name("Login")).click();

		driver.findElement(By.cssSelector("input[title*='Sign']")).click();

		driver.close();
		driver.quit();

		// driver.navigate().to("https://www.amazon.in/Stop-Solution-Automation-Using-Selenium-ebook/dp/B08ZST8Y32/ref=tmm_kin_swatch_0?_encoding=UTF8&qid=&sr=");
		// System.out.println("YaYYYYYYYYYYYYY !!!! webpage launched successfully- PAGE
		// 2");

	}

}
