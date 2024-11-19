package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//a[@class='nav-link active']
public class CreateArticle {

	// pageFactory Pattern
	@FindBy(xpath = "//a[@href='#/editor']")
	WebElement newarticlebtn;

	
	
	  @FindBy(name = "title") WebElement titleBox;
	  
	  @FindBy(xpath ="//input[@class='form-control ' and @name='description']")
	  WebElement discriptionBox;
	  
	  @FindBy(name ="body") WebElement bodyBox;
	  
	  @FindBy(name ="tags") WebElement tagBox;
	  
	  @FindBy(xpath = "//button[@class ='btn btn-lg pull-xs-right btn-primary']")
	  WebElement publishBtn;
	 
	 

	public CreateArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void NewArticle() {

		System.out.println("Enter new Article method");
		 newarticlebtn.click();
		 
	}
	
	public void NewinfoArticle(String strtitle,String strDesc,String strContent,String strtag) {

		System.out.println("Enter new Article2 method");
		 titleBox.sendKeys(strtitle);
		 discriptionBox.sendKeys(strDesc);
		 bodyBox.sendKeys(strContent);
		 tagBox.sendKeys(strtag);
		  publishBtn.click();
		
		 
	}
	
	

}
