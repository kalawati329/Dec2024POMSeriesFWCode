package com.qa.newproject.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.newproject.factory.Driver_factory;
import com.qa.newproject.pages.AccountsPage;
import com.qa.newproject.pages.Login_page;

public class Base_Test {

	WebDriver driver;
	Driver_factory df;
	protected Properties prop;
	protected Login_page loginpage;
	protected AccountsPage accPage;

	@BeforeTest
	public void setup() {
		df = new Driver_factory();
		prop = df.initprop();
		driver = df.initDriver(prop);
		loginpage = new Login_page(driver);
	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
