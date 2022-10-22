package edit.CeducacionIT21092022;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class laboratorio2 {
	
	//atributos
	
	String url ="http://automationpractice.com/index.php";
	String ChromePath ="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	String firefoxPath="..\\CeducacionIT21092022\\Drivers\\geckodriver0.31.0.exe";
	WebDriver driver;
	
	
	// metodos
	
@Test	
	public void buscarPalabra() {
	
	//inicializar el driver
		
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();
	
	//abrir la pagina
		
		driver.get(url);
	
	//encontra el campo y escribir la palabra
		WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("dress");
		
	
	//hacer la busqueda = enter
		
		txtBuscador.sendKeys(Keys.ENTER);
	
	//cerrar el navegador.
	
	}

// metodos

@Test	
public void buscarPalabraFirefox() {

//inicializar el driver
	
	System.setProperty("webdriver.gecko.driver", firefoxPath);
	
	//

	driver = new FirefoxDriver();

//abrir la pagina
	
	driver.get(url);

//encontra el campo y escribir la palabra
	WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
	txtBuscador.sendKeys("dress");
	
	/*
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
	WebDriverWait mywait=new WebDriverWait(driver, 10);
	mywait.until(ExpectedConditions. elementToBeClickable(By.id("user")));

	*/
	

	

//hacer la busqueda = enter
	
	driver.findElement(By.name("submit_search")).click();
	
//	txtBuscador.sendKeys(Keys.ENTER);

//cerrar el navegador.

}


@Test	
public void buscarPalabraVersionChrome() {

//inicializar el driver
	
	System.setProperty("webdriver.chrome.driver", ChromePath);
	
	ChromeOptions options = new ChromeOptions();
	
	options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
	
	
	driver = new ChromeDriver(options);

//abrir la pagina
	
	driver.get(url);

//encontra el campo y escribir la palabra
	WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
	txtBuscador.sendKeys("dress");
	

//hacer la busqueda = enter
	
	txtBuscador.sendKeys(Keys.ENTER);

//cerrar el navegador.

}

	

}
