package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {
	
	@FindBy(css="#email")
	WebElement txtMail;
	
	@FindBy(id="passwd")
	WebElement txtPassword;
	
	@FindBy(name="SubmitLogin")
	WebElement btnSignIn;
	
	@FindBy(linkText="Sign out")
	WebElement lnksignOut;
	
	
	public PaginaLogin (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
				
	}
	
	
	
	public void escribirMail(String email) {
		
		txtMail.sendKeys(email);
				
	}
	
	
	public void escribirPassword(String password) {
		
		txtPassword.sendKeys(password);
		
		
	}
	
	
	public void HacerClickBtnSignIn() {
		
		btnSignIn.click();
		
		
	}
	
	public void hacerClickSignOut() {
		
		lnksignOut.click();
		
	}
	
	
	
	

}
