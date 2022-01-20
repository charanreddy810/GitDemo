

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksStreams {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.freshworks.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> footerList = driver.findElements(By.cssSelector("ul.footer-nav li"));
		List<String> newFooterList = new ArrayList<String>();
		
		footerList.stream().forEach(ele-> newFooterList.add(ele.getText()));
		newFooterList.forEach(ele->System.out.println(ele));
		//Method expression for print--->>>>        //newFooterList.forEach(System.out::println);
		
//	Long TotalFooterLinks = 	Links.stream().filter(ele->!ele.equals(" ")).count();
//		System.out.println(TotalFooterLinks);
//		driver.quit();
		
		
	}

}
