import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
			driver.manage().window().maximize();
			List<WebElement> linksList = driver.findElements(By.tagName("a"));
			System.out.println(linksList.size());
	
			
//			List<String> collectlist =	linksList.
//					stream().filter(ele->!ele.getText().equals("")).map(ele->ele.getText()).collect(Collectors.toList());
//			System.out.println(collectlist);	
			
//	String firsttext = 	linksList.stream().filter(ele-> !ele.getText().equals("")).findFirst().get().getText();
//	System.out.println(firsttext); 
//	
//		
	//6*
//			List<String> collect=	linksList.stream().filter(ele->!ele.getText().equals("") && ele.getText().startsWith("Amazon"))
//			
//				.map(ele->ele.getText()).collect(Collectors.toList());
//		collect.forEach(ele->System.out.println(ele));
			
			
		List<String> AllLinkTextList	= linksList.stream()
			.filter(ele->ele.getText().isEmpty())
			.filter(ele->!ele.getText().equals(" "))
			.map(ele->ele.getText().trim())
			.collect(Collectors.toList());

		AllLinkTextList.forEach(ele-> System.out.println(ele));
		
		driver.quit();
	}

}
