import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		Thread.sleep(2000L);
		String screen1Text = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();
		// System.out.println(screen1Text);

		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Thread.sleep(2000L);

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String ParentIndex = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		// driver.switchTo().window(it.next());

		Thread.sleep(2000L);

		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(ParentIndex);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.quit();
	}

}
