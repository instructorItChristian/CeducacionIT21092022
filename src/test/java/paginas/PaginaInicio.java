package paginas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicio {
	
	//elementos a utilizar (localizadores)
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement lnkSignIn;
	
	
	@FindBy(id="search_query_top")
	private WebElement txtBuscador;
	
	
	//constructor
	public PaginaInicio (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//acciones
	
	public void hacerClickSignIn() {
		
		lnkSignIn.click();
		
		
	}
	
	public void escribirPalabraBuscador(String palabra) {
		
		txtBuscador.sendKeys(palabra);
		
	}
	
	
	public void presionarEnterBuscador() {
		
		txtBuscador.sendKeys(Keys.ENTER);
		
	}
	

}
