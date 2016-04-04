package tutorialPractice;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicFireFox {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.petnet.io/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSelenium() throws Exception {
		// Loads the URL
		driver.get(baseUrl);
		
		// Title of the web page
		String title = driver.getTitle();
		System.out.println(title);
		
		// Current URL loaded in the web
		String getCurrentURL = driver.getCurrentUrl();
		System.out.println(getCurrentURL);
		
		// Gets the page source
		String source = driver.getPageSource();
		System.out.println(source);
		
		// Refresh the browsers window
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		driver.get(driver.getCurrentUrl());
		
		//driver.findElement(By.id("searchCriteria")).clear();
		//driver.findElement(By.id("searchCriteria")).sendKeys("sfo");
		driver.findElement(By.xpath("//*[@id='nav']/ul/li[4]/a")).click();
		
		// Navigate back
		driver.navigate().back();
				
		// Navigate forward
		driver.navigate().forward();
		
		driver.findElement(By.xpath("//*[@id='nav']/ul/li[2]/a")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		
		// Close the current window, if it is last then quit
		driver.close();
		
		// Quit the browsers
		driver.quit();
	}
}
