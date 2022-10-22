package edit.CeducacionIT21092022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class laboratorio10 {
	
	String url="http://automationpractice.com/index.php";
	String Driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Driverpath);
		
		driver = new ChromeDriver();
		driver.get(url);
				
	}
	
	
	
	@Test(dataProvider="datos login")
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
	
	@DataProvider(name="datos login")
	public Object[][] obtenerDatos(){
		Object[][] datos =new Object[4][2];
		
		datos[0][0]="micorreo0.0018896176555569522@test.com";
		datos[0][1]="1234test";
				
		datos[1][0]="Maria@test.com";
		datos[1][1]="test1234";
		
		datos[2][0]="pedro@test.com";
		datos[2][1]="test1234";
		
		datos[3][0]="juan@test.com";
		datos[3][1]="test1234";
		
		return datos;
		
		
		
		//"micorreo0.0018896176555569522@test.com"
		
		//"1234test"
		
		
		
		
		
	}
	
	
	

}
