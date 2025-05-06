package com.qa.newproject.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.newproject.base.Base_Test;
import static com.qa.newproject.constant.App_constants.*;

public class Account_page_test extends Base_Test{
	
	//BT---BC
	@BeforeClass
	public void accPageSetup() {
		accPage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void accPageTitleTest() {
		Assert.assertEquals(accPage.getAccPageTitle(),HOME_PAGE_TITLE);
	}
	@Test
	public void accPageURLTest() {
		Assert.assertTrue(accPage.getAccPageUrl().contains(HOME_PAGE__FRACTION_URL));
	}


}
