package edit.CeducacionIT21092022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class laboratorio8 {
	
	
	String url="http://automationpractice.com/index.php";
	String Driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Driverpath);
		
		driver = new ChromeDriver();
		driver.get(url);
				
	}
	
	
	
	@Test
	public void login() {
		
		PaginaInicio inicio = new PaginaInicio(driver);
		
		inicio.hacerClickSignIn();
		
		PaginaLogin login = new PaginaLogin(driver);
		
		login.escribirMail("micorreo0.0018896176555569522@test.com");
		
		
		login.escribirPassword("1234test");
		
		login.HacerClickBtnSignIn();
						
		
	}
	
	
	
	@Test
	public void buscarPalabra() {
		
		PaginaInicio inicio = new PaginaInicio(driver);
		inicio.escribirPalabraBuscador("dress");
		inicio.presionarEnterBuscador();
		
		
		
		
	}
	
	
	
	
	
	
	

}
