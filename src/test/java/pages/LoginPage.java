package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	//pageFactory Pattern
	    @FindBy(xpath = "//nav/div/ul[2]/li[2]/a")
	    WebElement signinbtn;
	
		@FindBy(name = "email")
		WebElement username;
		
		@FindBy(name ="password")
		WebElement pwd;
		
		@FindBy(xpath ="//button[text()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//div[@class='nav-link dropdown-toggle cursor-pointer']")
	    WebElement verifyusername;
		
		
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			

}
		public void validLogin(String strUser,String strPwd) {
			signinbtn.click();
			username.sendKeys(strUser);
			pwd.sendKeys(strPwd);
			loginBtn.click();
			
			System.out.println();
			
			
			
		}
		
		public void verifyLoginuser() {
			String staUser =verifyusername.getText();
					
					Assert.assertEquals("vikash",staUser );
			
		}
		

}
