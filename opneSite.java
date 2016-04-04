package tutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicFireFox {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://petnet.io";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		//driver.findElement(By.id("//*[@id='customer_email']")).sendKeys("a@yahoo.com");
		driver.findElement(By.xpath("//*[@id='customer_email']")).sendKeys("a@yahoo.com");
		driver.findElement(By.xpath("//*[@id='footer']/div/div/div[2]/ul/ul[2]/li[1]/form/div[2]/input")).click();
		
	}
}
