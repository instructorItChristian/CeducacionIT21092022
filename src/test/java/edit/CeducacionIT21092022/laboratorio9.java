package edit.CeducacionIT21092022;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class laboratorio9 {
	

	String url="https://demoqa.com/alerts";
	String Driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Driverpath);
		
		driver = new ChromeDriver();
		driver.get(url);
				
	}
	
	
	
	@Test
	public void alertas1() {
		
		driver.findElement(By.id("alertButton")).click();
		Alert alerta =driver.switchTo().alert();
		alerta.accept();
		
	}
	
	
	@Test
	public void alertas2() {
		driver.findElement(By.id("alertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alerta =driver.switchTo().alert();
		
		alerta.accept();
		
	}
	@Test
	public void alertas3() {
		

		driver.findElement(By.id("confirmButton")).click();
		Alert alerta =driver.switchTo().alert();
		alerta.dismiss();
		
		
		
		
	}
	@Test
	public void alertas4() {
		

		driver.findElement(By.id("promtButton")).click();
		Alert alerta =driver.switchTo().alert();
		alerta.sendKeys("curso de automatizacion");
		alerta.accept();
		
		
	}
	
	
	
	
	
	
	

}
