import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJet {
	
public static void main(String args[]) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://beta.spicejet.com/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(5000L);
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i =0;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		
		/*
		System.out.println(driver.findElement(By.xpath("//div[text() = 'Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text() = 'Senior Citizen']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text() = 'Senior Citizen']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[@class ='css-76zvg2 r-n6v787 r-1ozqkpa']")).getSize());
		*/
		
		
		//driver.quit();

}
}
