import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetCalender {

	public static void main(String args[]) throws InterruptedException {

		// Create driver object for Chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://beta.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class ='css-1cwyjr8 r-ubezar r-10paoce r-13qz1uu']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[text() = 'Chennai']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[text() = 'Hyderabad']")).click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();
		driver.findElement(By
				.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/svg"))
				.click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();

	}
}
