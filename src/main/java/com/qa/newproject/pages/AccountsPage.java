package com.qa.newproject.pages;

import static com.qa.newproject.constant.App_constants.DEFAULT_TIMEOUT;
import static com.qa.newproject.constant.App_constants.LOGIN_PAGE_TITLE;

import org.openqa.selenium.WebDriver;

import com.qa.newproject.util.ElementUtil;
import static com.qa.newproject.constant.App_constants.*;

public class AccountsPage {
	private WebDriver driver;
	private ElementUtil eleutil;

	public AccountsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		eleutil=new ElementUtil(driver);
	}

	public String getAccPageTitle() {
		// TODO Auto-generated method stub
		String title=eleutil.waitFotTitleIs(HOME_PAGE_TITLE, DEFAULT_TIMEOUT);
		System.out.println("home Page Title"+ title);
		return title;
	}
	
	public String getAccPageUrl() {
		// TODO Auto-generated method stub
		String url=eleutil.waitForURLContains(HOME_PAGE__FRACTION_URL, DEFAULT_TIMEOUT);
		System.out.println("home Page url"+ url);
		return url;
	}

	

}
