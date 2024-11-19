package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {
	   WebDriver driver;
	
	// pageFactory Pattern
		  @FindBy(xpath = "//button/i[@class ='ion-trash-a']")
		  WebElement deletearticlebtn;

		  
		
		  @FindBy(name = "title") WebElement titleBox;
		  
		  @FindBy(xpath ="//input[@class='form-control ' and @name='description']")
		  WebElement discriptionBox;
		  
		  @FindBy(name ="body") WebElement bodyBox;
		  
		  @FindBy(name ="tags") WebElement tagBox;
		  
		  @FindBy(xpath = "//button[@class ='btn btn-lg pull-xs-right btn-primary']")
		  WebElement publishBtn;
		 
		 

		public DeleteArticle(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}

		public void deleteArticlepage()  {

			System.out.println("Enter delete Article method");			
			 deletearticlebtn.click();
			 
			 
						 
		}
		 

	}
