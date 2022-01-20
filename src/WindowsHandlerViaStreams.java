import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlerViaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.popuptest.com/goodpopups.html");
		
		driver.manage().window().maximize();
		
		
		public static String switchToWindowTest(WebDriver driver,String Title) {
			driver.getWindowHandles().stream()
				.map(handler -> driver.switchTo().window(handler).getTitle())
					.filter(ele->ele.contains(Title))
						.findFirst();
					}
		}

		
		
	}

}
