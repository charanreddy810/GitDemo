import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait n = new WebDriverWait(driver, 5);
		// driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement FooterDriver = driver.findElement(By.cssSelector("div[class='navLeftFooter nav-sprite-v1']"));

		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		 WebElement ColoumLinks  =  FooterDriver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']/div/div/div"));
		
		 System.out.println (ColoumLinks.findElements(By.tagName("a")).size());
		
		 
		 for(int i=0;i< ColoumLinks.findElements(By.tagName("a")).size();i++){
			 
			 String ClickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 
			 ColoumLinks.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
			 
			 Thread.sleep(8000L);
		 }
			 Set<String> abc = driver.getWindowHandles();
			 Iterator<String>it = abc.iterator();
			 
			 while(it.hasNext())
			 {
				 
				 driver.switchTo().window(it.next());
				 System.out.println(driver.getTitle());
			 }
		 }
		 

	}
	

