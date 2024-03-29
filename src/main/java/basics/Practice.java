package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.google.com/");
		
		List<WebElement> listOfAnchors = driver.findElements(By.tagName("a"));
		
		for(WebElement anchor : listOfAnchors) {
			System.out.println(anchor.getAttribute("href"));
//		anchor.click();
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
		}
		
	}

}
