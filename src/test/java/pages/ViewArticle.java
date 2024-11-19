package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


     public class ViewArticle {
	// pageFactory Pattern
		@FindBy(xpath = "//a[@href='#/editor']")
		 WebElement newarticlebtn;

		
		
		 
		  
		  @FindBy(xpath ="//main//div[@class='container']/h1")
		  WebElement strtext;
		  @FindBy(xpath = "//a[@href='#/']")
		  WebElement strHome;
		  
		  @FindBy(xpath ="/html/body/div/main/div/div/div/div/div[1]/ul/li[2]/button")
		  //@FindBy(xpath ="//button[@class='nav-link ' and text()='Global Feed']")
		  WebElement strglobalfeed;
		
		  @FindBy(xpath ="//div/a[@class= 'preview-link']/h1[text()='Testtitle6']")
		  WebElement strviewPage;
		  
		  
	

		public ViewArticle(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}

		public void viewArticle() {
			
			
			strHome.click();			
			strglobalfeed.click();
			strviewPage.click();
			
			
			
		}
		
		/*
		 * public void verifyArticle() {
		 * 
		 * 
		 * String ArticleName=strviewPage.getText();
		 * System.out.println("ArticleName"+ArticleName);
		 * 
		 * //Assert.assertEquals(ArticleName,"Testtitle6");
		 * 
		 * }
		 */
		
		
	}
