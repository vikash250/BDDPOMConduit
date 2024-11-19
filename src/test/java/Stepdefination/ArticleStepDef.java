package Stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateArticle;
import pages.UpdateArticle;
import pages.LoginPage;
import pages.ViewArticle;
import pages.DeleteArticle;

public class ArticleStepDef {

	WebDriver driver;
	LoginPage loginPage;
	CreateArticle createArticle;
	UpdateArticle updateArticle;
	ViewArticle viewArticle;
	DeleteArticle delArticle;

	public ArticleStepDef() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		createArticle = new CreateArticle(driver);
		updateArticle = new UpdateArticle(driver);
		viewArticle = new ViewArticle(driver);
    	delArticle= new DeleteArticle(driver);
		
	}
	
		

@Given("User is on Login page")
public void user_is_on_login_page() {
	
	TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");

}
@When("User provide {string} and {string}")
public void user_provide_and(String strUser, String strPwd) {
	
	loginPage.validLogin(strUser, strPwd);

}
@Then("User should be on Home Page")
public void user_should_be_on_home_page() {
	loginPage.verifyLoginuser();

}
@Given("Article detail page must be displayed")
public void article_detail_page_must_be_displayed() {

}
@When("User update article detail")
public void user_update_article_detail() {
	updateArticle.updateArticle();

}
@Then("Article detail must be updated")
public void article_detail_must_be_updated() {

}


@Given("User should be on New Article Page")
public void user_should_be_on_new_article_page() {
	System.out.println("calling new aricle page");
	createArticle.NewArticle();
	

}
@When("User enters Article details")
public void user_enters_article_details(DataTable dataTable) {
	
		List<Map<String, String>> data =dataTable.asMaps();
		String strtitle = data.get(0).get("title");
		String strDesc =  data.get(0).get("Desc");
		String strContent = data.get(0).get("Content");
		String strtag =  data.get(0).get("tag");
		createArticle.NewinfoArticle(strtitle,strDesc,strContent,strtag);	
	     
	 
	
}
@Then("Article must be created")
public void article_must_be_created() {
	//viewArticle.verifyArticle();
	

}

@When("User select an article {string}")
public void user_select_an_article(String ArtName) {
	
	//viewArticle.verifyArticle(ArtName);
    
}



@Given("User should be on Global Feed page")
public void user_should_be_on_global_feed_page() {
	
	viewArticle.viewArticle();

}



@When("User delete article")
public void user_delete_article() {
	
	delArticle.deleteArticlepage();
	driver.switchTo().alert().accept();
   
}
@Then("Article must be deleted")
public void article_must_be_deleted() {
  
}

	
}
