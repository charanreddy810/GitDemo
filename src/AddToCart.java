import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait n = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] ItemsNeeded = { "Cucumber", "Beetroot", "Tomato" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000L);

		driver.manage().window().maximize();

		additems(driver, ItemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		/*
		 * AddToCart b = new AddToCart(); //We can create object to method if we dont
		 * make method as Static b.additems(driver, ItemsNeeded);
		 */
		//n.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt ='Cart']")));

		//driver.findElement(By.cssSelector("img[alt ='Cart']")).click();

		driver.findElement(By.xpath("//button[text() ='PROCEED TO CHECKOUT']")).click();

		n.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*.promoCode")));

		driver.findElement(By.cssSelector("*.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("Button.promobtn")).click();
		n.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void additems(WebDriver driver, String[] ItemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.className("product-name"));
		
		for (int i = 0; i <= products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String FormattedName = name[0].trim();
			// Format - Trim the name

			// Convert array into array list for easy search
			// Check whether your name is available n he list

			List<String> ItemsNeededList = Arrays.asList(ItemsNeeded);

			
			if (ItemsNeededList.contains(FormattedName))

			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == ItemsNeededList.size()) {
					break;
			}
		}

	}
}
}