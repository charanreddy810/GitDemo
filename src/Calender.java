import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("<li data-cy=\"account\" class=\"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"><span class=\"userNameIcon whiteText makeFlex perfectCenter latoBlack appendRight10\"><span class=\"landingSprite myIconWhite\"> &nbsp;</span></span><div class=\"makeFlex column flexOne whiteText latoBold\"><p><!-- --> Login or Create Account</p></div></li>")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//div[@class = 'fsw_inputBox dates inactiveWidget ']/label")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).getText());
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).getText().contains("October"))
		{
		driver.findElement(By.cssSelector("[class='DayPicker'] [class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".DayPicker-Day"));
		int count = driver.findElements(By.cssSelector(".DayPicker-Day")).size();

		for (int i = 0; i < count; i++) {
			String Text = driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).getText();

			if (Text.contains("25")) {
				driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).click();

				break;

			}

		}

		//driver.close();

	}

}
