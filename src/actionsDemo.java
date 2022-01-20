import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait n = new WebDriverWait(driver, 5); // ExplicitWait

		Actions a = new Actions(driver); // Actions
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		n.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#nav-link-accountList"))); // ExplicitWait

		WebElement move = driver.findElement(By.cssSelector("a#nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();

		// a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("check").doubleClick().build().perform();

	}
}
