package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaPractise\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl = "https://sbi.co.in";
		String expectedTitle = "State Bank of India";
		String actualTitle="";
		
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		actualTitle = driver.getTitle();
		
		
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test case Pass");
		}
		else
			System.out.println("Test case Fail");
		
		

	}

}
