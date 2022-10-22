package edit.CeducacionIT21092022;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class laboratorio3 {
	String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String driverPath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
		
	@Test
	public void registrarUsuario() {
		
		//inicializamos el driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeOptions option =new ChromeOptions();
		
		option.addArguments("incognito");
		option.addArguments("Start-maximizied");
		
		/*
		 * disable-extension
		 * disable-popup-blocking
		 * 
		 * 
		 */
		
		driver = new ChromeDriver (option);
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		//ingresar un correo 
		
		WebElement txtEmail = driver.findElement(By.cssSelector("#email_create"));
		//txtEmail.sendKeys("micorreo2028@test.com");
		
		
		txtEmail.sendKeys("micorreo"+Math.random()+"@test.com");
		
		//pretar el boton
		driver.findElement(By.id("SubmitCreate")).click();
		
		
		//espera
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		
		
		
		//pasamos a la segunda hoja
		
		
		
		//title
		
		
		driver.findElement(By.id("id_gender1")).click();
		
		//first name
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("pepe");
		
		//last name
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("argento");
		
		
		//password
		
		driver.findElement(By.cssSelector("#passwd")).sendKeys("1234test");
		
		//day
		
		Select day = new Select (driver.findElement(By.id("days")));
		day.selectByValue("1");
		
		// month
		
		Select month = new Select (driver.findElement(By.name("months")));
		month.selectByVisibleText("April ");
				
		
		//year
		Select year =new Select (driver.findElement(By.xpath("//select[@id='years']")));
		year.selectByIndex(3);
		
		//newsletter
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/span[1]/input[1]")).click();
		
			
		//special offers
		
		driver.findElement(By.id("optin")).click();
		
		//segunda parte del fomulario
		
		//address
		
		driver.findElement(By.cssSelector("#address1")).sendKeys("mi calle 1234");
		
		//city
		
		driver.findElement(By.id("city")).sendKeys("tucuman");
		
		//state
		
		Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		state.selectByIndex(3);
		
		//zip
		driver.findElement(By.cssSelector("#postcode")).sendKeys("98765");
		
		//country
		
		Select country =new Select (driver.findElement(By.id("id_country")));
		country.selectByValue("21");
		
		//mobilephone
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("99998888");
		
		//alias
		
		driver.findElement(By.name("alias")).clear();
		
		driver.findElement(By.name("alias")).sendKeys("mi_casa");
		
		//apretar el boton register
		
		driver.findElement(By.cssSelector("#submitAccount")).click();
		
		
		
		
		
		
	}
	
	
	
	
	

}
