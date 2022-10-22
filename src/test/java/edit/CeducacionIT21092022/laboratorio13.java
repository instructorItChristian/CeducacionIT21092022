package edit.CeducacionIT21092022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class laboratorio13 {
	
	
	String url ="https://www.demo.guru99.com/test/table.html";
	String driverpath="..\\CeducacionIT21092022\\Drivers\\chromedriver105.0.5195.52.exe";
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver = new ChromeDriver();
		driver.get(url);
		
		
	}
	
	@Test
	public void imprimirValoresTabla() {
		
		String Valor1 = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
		
		System.out.println("valor de la primera fila primera columna:"+Valor1);
		
		
		String Valor2 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
		
		System.out.println("valor del segundo renglon segunda columna:"+Valor2);
		
		
		String Valor3 = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[3]")).getText();
		
		System.out.println("valor del cuarto renglon tercera columna:"+Valor3);
		
		
	}
	
	
	
	

}
