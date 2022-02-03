package org.qa.amazon.testcases;

import java.util.HashMap;

import org.qa.amazon.base.ExcelFileRead;
import org.qa.amazon.pompages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginTest {
	
public LoginPage loginpage= new LoginPage();
ExcelFileRead excelfileread= new ExcelFileRead();
String string2, string3, string4;

@Given("user already in login screen")
public void user_already_in_login_screen() {
   String returntitle = loginpage.returntitle();
   Assert.assertEquals("Amazon.com. Spend less. Smile more.", returntitle);
}

@When("user navigates to signin dropdownfield")
public void user_navigates_to_signin_dropdownfield() {
	loginpage.mousehoversignin();
}

@Then("signin button is displayed")
public void signin_button_is_displayed() {
	boolean siginbuttondisplayed = loginpage.siginbuttondisplayed();
	Assert.assertTrue(siginbuttondisplayed);
    
}

@When("user navigates to language dropdownfield")
public void user_navigates_to_language_dropdownfield() {
   loginpage.mousehoverlanguage();
}

@Then("default english language is selected")
public void default_english_language_is_selected() {
   boolean englishlanguageselected = loginpage.englishlanguageselected();
   System.out.println(englishlanguageselected);
   Assert.assertTrue(englishlanguageselected);
}

@Given("user clicks on signin button")
public void user_clicks_on_signin_button() throws InterruptedException {
	loginpage.mousehoversignin();
	Thread.sleep(5000);
   loginpage.signinbuttonclick();
}

@When("user enter email {string}")
public void user_enter_email(String emailadd) {
  loginpage.enteremail(emailadd);
}

@Then("click on continue button")
public void click_on_continue_button() {
	loginpage.continuebuttonclick();
  
}

@When("user fills the form from {string} and {string}")
public void user_fills_the_form_from_and(String string, String tcno) {
	HashMap<String,String> getdata = excelfileread.getData(tcno);
string2 = getdata.get("LoginUsername");
string3 = getdata.get("LoginPassword");
string4 = getdata.get("LoggedUser");
}

@Then("print the value")
public void print_the_value() {
    System.out.println(string2);
    System.out.println(string4);
    System.out.println(string3);
    System.out.println("test");
}


}
