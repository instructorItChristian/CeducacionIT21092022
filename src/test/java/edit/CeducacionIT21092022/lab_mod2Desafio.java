package edit.CeducacionIT21092022;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class lab_mod2Desafio {
	
	
	@Test
	public void login()  {
		// Establecer la ubicación del driver
		System.setProperty("webdriver.chrome.driver","..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe");
		
		// Crear la instancia de Driver: abrir la página y maximizarla
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		
		// Completar el formulario de login y hacer clic en el boton
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")));
		
	// Acceder a la opción de Registro de Usuario
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")));	
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		
		
		
		
		//formulario 
		
		//combo user role
		
		System.out.println("inicia form--campo role");

					
		 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
		
		  
		//empleyee name
	        System.out.println("campo nombre empleado");
		  
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("pe");
			
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Peter Mac Anderson')]")));
			
			
			driver.findElement(By.xpath("//*[contains(text(),'Peter Mac Anderson')]")).click();	  
		//comboiStatus
			System.out.println("campo status");
		 
			 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
			
			
		  		 
		
		//username
		        System.out.println("campo nombre username");
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys("UsernameTest2194");
		
		//pass1
		
		System.out.println("campo pass1");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("ABCdef123!");
		//pass2
		
		System.out.println("campo pass2");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("ABCdef123!");
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		
		//boton SAVE
		
		System.out.println("campo save");
		

		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")));
		
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")).click();

}
}
