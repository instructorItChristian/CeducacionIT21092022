package edit.CeducacionIT21092022;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.CapturaEvidencia;

public class laboratorio99 {
	
	String url="http://automationpractice.com/index.php";
	String Driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	String imagePath ="..\\CeducacionIT21092022\\Evidencias\\";
	String docPath="..\\CeducacionIT21092022\\Evidencias\\";
	WebDriver driver;
	File screen;
	
	@BeforeSuite
	
	//acciones que se van a ejacutar ant es de toda la suite de pruebas
	public void beforeSuite() {
		
		System.out.println("beforesuite- inicio de pruebas");
		
	}
	
	@BeforeClass
	//acciones que se van a ejecutar antes de cualqueir @test de este archivo
	public void beforeClass() {
		System.out.println("beforeclass- inicio de la clase");
		
		System.setProperty("webdriver.chrome.driver",Driverpath);
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	@BeforeTest
	//acciones que se van a ejecutar antes de los @test del archivo
	public void beforetest() {
		System.out.println("beforetest- inicio del test");
	}
	
	
	@Test(description="cp001 - buscar palabra en automationpractice", priority=20)
	public void buscarPalabra() {
		//pasos del buscar palabra
		
		WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("shirt");
		txtBuscador.sendKeys(Keys.ENTER);
		
		
		Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
		
		
	}
	
	
	@Test (description="cp002 - ir a contact us", priority=10)
	public void irAContacUs() throws InvalidFormatException, IOException, InterruptedException  {
		
		Date fecha = new Date();
		
		Integer hora = fecha.getHours();
		
		Integer min = fecha.getMinutes();
						
		String docpath2 = docPath +"docEvidencia"+LocalDate.now()+"H"+hora+"M"+min+".docx";
		
		
		//aaaa/mm/dd hh:mm:sssssss
		
		//captura evidencia
		
		CapturaEvidencia.escribirTituloEnDocumento(docpath2, "documento de captura evidencias CP-002 - ir a contact US", 18);
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, imagePath +"img.jpg", docpath2, "pantalla principal");
		
		driver.findElement(By.linkText("Contact us")).click();
		//captura evidencia
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, imagePath +"img.jpg", docpath2, "formulario a completar");
		
		Select subject =new Select(driver.findElement(By.id("id_contact")));
		subject.selectByValue("2");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("test@test.com");
		
		driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("1");
		
		driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\testenvio.txt");
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("msj de prueba");
		
		
		//captura evidencia
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, imagePath +"img.jpg", docpath2, "formulario completo");
		
		driver.findElement(By.id("submitMessage")).click();
		
		//captura evidencia
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, imagePath +"img.jpg", docpath2, "respuesta a la carga");
		
	}
	
	@AfterTest
	//codigo que se ejecuta una vez cerrado el @test
	public void aftertest() {
		System.out.println("aftertst- cierre del @test");}
	
	
	@AfterClass
	
	//lo ultimo que se ejecuta cuando ya corrio todos los @test de este arhivo 
	public void afterclass() {
		
		System.out.println("afterclass- cierre de la clase");
		
		driver.close();
	}
	
	@AfterSuite
	//lo ultimo que se va a ejecutar antes de cerrar la suite de pruebas
	public void aftersuite() {
		System.out.println("aftersuite- cierre de la suite");
		
	}

	

	

}
