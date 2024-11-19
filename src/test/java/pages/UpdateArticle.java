package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateArticle {
	WebDriver driver;

	@FindBy(xpath = "//button/a/i[@class='ion-edit']")
	WebElement editarticlebtn;

	
	  @FindBy(xpath ="//input[@class='form-control ' and @name='description']")
	  
	  WebElement discriptionBox;
	  
	  
	  @FindBy(name ="body") WebElement bodyBox;
	  
	  @FindBy(name ="tags") WebElement tagBox;
	  
	
	  
	  @FindBy(xpath = "//button[@class='btn btn-lg pull-xs-right btn-primary']")
	  WebElement updateBtn;
	 

	public UpdateArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void updateArticle() {
		 

		System.out.println("Enter new Article method");
		  editarticlebtn.click();
		  discriptionBox.clear();		 
		  discriptionBox.sendKeys("Updateddiscription");
		  updateBtn.click();
	}
}
