package edit.CeducacionIT21092022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class laboratorio7 {
	
	//atributos
	
	String url ="http://automationpractice.com/index.php";
	String ChromePath ="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	String firefoxPath="..\\CeducacionIT21092022\\Drivers\\geckodriver0.31.0.exe";
	WebDriver driver;
	
	
	
@Parameters("navegador")	
	
@BeforeTest
public void beforetest(String navegador) {
	
if (navegador.equalsIgnoreCase("chrome")) {	
	
	System.setProperty("webdriver.chrome.driver", ChromePath);
	driver = new ChromeDriver();

//abrir la pagina
	
	driver.get(url);
	
}
	else if (navegador.equalsIgnoreCase("firefox")){
	
	System.setProperty("webdriver.gecko.driver", firefoxPath);
	
	//

	driver = new FirefoxDriver();

//abrir la pagina
	
	driver.get(url);
	
}
	
}
	
	
@Test	
	public void buscarPalabra() {
	
	//inicializar el driver
	
	
	//encontra el campo y escribir la palabra
		WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("dress");
		
	
	//hacer la busqueda = enter
		
		txtBuscador.sendKeys(Keys.ENTER);
	
	//cerrar el navegador.
	
	}



	

}
