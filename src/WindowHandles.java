import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//WebDriverWait n = new WebDriverWait(driver, 5); // ExplicitWait
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String ParentIndex = it.next();
		String ChildIndex = it.next();

		driver.switchTo().window(ChildIndex);
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText();

String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];		
driver.switchTo().window(ParentIndex);
driver.findElement(By.id("username")).sendKeys(emailID);
	}
}