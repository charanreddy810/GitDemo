import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxWithStream {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxlist = driver.findElements(By.cssSelector("td.select-checkbox"));
		checkBoxlist.stream().forEach(ele->ele.click());
  	}

}
