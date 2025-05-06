package com.qa.newproject.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.qa.newproject.base.Base_Test;
import static com.qa.newproject.constant.App_constants.*;

public class login_page_test extends Base_Test {
	@Test
	public void LoginPageTitleTest() {
		String Acttitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(Acttitle,LOGIN_PAGE_TITLE);

	}

	@Test
	public void LoginPageURLTest() {
		String ActURL = loginpage.getLoginPageURL();
		Assert.assertTrue(ActURL.contains(LOGIN_PAGE__FRACTION_URL));

	}

	@Test(priority = Short.MAX_VALUE)
	public void LoginTest() throws InterruptedException {
		accPage=loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		//Thread.sleep(10000);
		Assert.assertEquals(accPage.getAccPageTitle(), HOME_PAGE_TITLE);

	}

}
