import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DargAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait n = new WebDriverWait(driver, 5);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		n.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@Class = 'logo']")));

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();

	}

}
