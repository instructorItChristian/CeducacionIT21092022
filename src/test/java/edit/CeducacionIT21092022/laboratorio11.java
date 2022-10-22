package edit.CeducacionIT21092022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.DatosExcel;
import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class laboratorio11 {
	
	String url="http://automationpractice.com/index.php";
	String Driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Driverpath);
		
		driver = new ChromeDriver();
		driver.get(url);
				
	}
	
	
	
	@Test(dataProvider="datos login desde excel")
	public void login(String mail, String Pass) {
		
		PaginaInicio inicio = new PaginaInicio(driver);
		
		inicio.hacerClickSignIn();
		
		PaginaLogin login = new PaginaLogin(driver);
		
		login.escribirMail(mail);
		
		
		login.escribirPassword(Pass);
		
		login.HacerClickBtnSignIn();
		
		Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", driver.getCurrentUrl());
		
		login.hacerClickSignOut();
		
		
	}
	
	@DataProvider(name="datos login desde excel")
	public Object[][] obtenerDatosExcel() throws Exception{
	
		return DatosExcel.leerExcel("..\\CeducacionIT21092022\\Datos\\datos_Login.xlsx", "Hoja1");
		
				
		
	}
	
	

}
