package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Url In Adactin Application$")
	public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
		driver.get("http://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Bala2000");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Bala@20");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}

	@When("^user Select The Location In DropDown Box$")
	public void user_Select_The_Location_In_DropDown_Box() throws Throwable {
		WebElement selectlocation = driver.findElement(By.xpath("//select[@id='location']"));
		selectlocation.click();
		Select a = new Select(selectlocation);
		a.selectByIndex(2);

	}

	@When("^user Select The Hotel In DropDown Box$")
	public void user_Select_The_Hotel_In_DropDown_Box() throws Throwable {
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotels.click();
		Select b = new Select(hotels);
		b.selectByIndex(2);

	}

	@When("^user Select The Room Type In DropDown Box$")
	public void user_Select_The_Room_Type_In_DropDown_Box() throws Throwable {
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		roomtype.click();
		Select c = new Select(roomtype);
		c.selectByIndex(2);
	}

	@When("^user Select The Number Of Rooms In DropDown Box$")
	public void user_Select_The_Number_Of_Rooms_In_DropDown_Box() throws Throwable {
		WebElement noOfroom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		noOfroom.click();
		Select e = new Select(noOfroom);
		e.selectByIndex(2);
	}

	@When("^user Enter The CheckIn Date In DropDown Box$")
	public void user_Enter_The_CheckIn_Date_In_DropDown_Box() throws Throwable {
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	
		checkin.sendKeys("5/11/2023");
	}

	
	

@When("^user Enter The CheckOut Date Out DropDown Box$")
public void user_Enter_The_CheckOut_Date_Out_DropDown_Box() throws Throwable {
	WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));

	checkout.sendKeys("31/11/2023");
}

	@When("^user Select The No Of Adults In Room In DropDown Box$")
	public void user_Select_The_No_Of_Adults_In_Room_In_DropDown_Box() throws Throwable {
		WebElement NoOfadult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		NoOfadult.click();
		Select h = new Select(NoOfadult);
		h.selectByIndex(2);
	}

	@When("^user Select The Children In Room In DropDown Box$")
	public void user_Select_The_Children_In_Room_In_DropDown_Box() throws Throwable {
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		child.click();
		Select i = new Select(child);
		i.selectByIndex(2);
	}

	@Then("^user Click The Search Button And It Navigates To Next Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		
	}

	@Then("^user Click The Continue Button And It Navigates To Next Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		button.click();
		Thread.sleep(2000);
		WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
		continue_btn.click();	
		
		
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Balaji");
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("M");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("No:76, Ashok Nagar ,Chennai");
	}

	@When("^user Enter The Creditcard Number In Creditcard Field$")
	public void user_Enter_The_Creditcard_Number_In_Creditcard_Field() throws Throwable {
		WebElement credit = driver.findElement(By.xpath("//input[@id='cc_num']"));
		credit.sendKeys("6575746587493345");
	}

	@When("^user Select The Creditcardtye In Creditcardtye Field In DropDown Box$")
	public void user_Select_The_Creditcardtye_In_Creditcardtye_Field_In_DropDown_Box() throws Throwable {
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cardtype.click();
		Select j = new Select(cardtype);
		j.selectByIndex(2);
	}

	@When("^user Select The Expirydate In Month And Year In DropDown Box$")
	public void user_Select_The_Expirydate_In_Month_And_Year_In_DropDown_Box() throws Throwable {
		WebElement expiryyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		expiryyear.click();
		Select l = new Select(expiryyear);
		l.selectByIndex(2);
	}

	@When("^user Enter The CVV Number In CVV Number Field In DropDown Box$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field_In_DropDown_Box() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("3334");
	}

	@Then("^user Click The BookNow Button And It Navigates To Next Page$")
	public void user_Click_The_BookNow_Button_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
	}

}
