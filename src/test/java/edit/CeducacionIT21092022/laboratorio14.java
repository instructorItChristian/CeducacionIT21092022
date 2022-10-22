package edit.CeducacionIT21092022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class laboratorio14 {
	
	String url="https://selenium.dev/";
	WebDriver driver;
	
	
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	
	@Test
	public void test() {
		System.out.println("prueba sin el driver");
		
	}
	
	

}
