package com.qa.newproject.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.newproject.util.ElementUtil;

import static com.qa.newproject.constant.App_constants.*;


public class Login_page {
	

		//private by locator
		private WebDriver driver;
		private ElementUtil eleutil;
	
		
		private final By email=By.id("input-email");
		private final By pword =By.id("input-password");
		private final By login_button =By.xpath("//input[@class='btn btn-primary']");
		
		
		
		//2.public page constructor
		public Login_page(WebDriver driver){
			this.driver=driver;
			eleutil= new ElementUtil(driver);
		}
		
		
		//3.public page actions
		public String getLoginPageTitle() {
			String title=eleutil.waitFotTitleIs(LOGIN_PAGE_TITLE, DEFAULT_TIMEOUT);
		
			System.out.println("Login Page Title..."+ title);
			return title;
			}
		
		public String getLoginPageURL() {
			String URL=eleutil.waitForURLContains(LOGIN_PAGE__FRACTION_URL, DEFAULT_TIMEOUT);
			//String URL=driver.getCurrentUrl();
			System.out.println("Login Page URL"+ URL);
			return URL;
			}
		
		public AccountsPage doLogin(String username, String password) {
			System.out.println("user credentials:"+username+":" + password);
			eleutil.waitForElementVisible(email,DEFAULT_TIMEOUT).sendKeys(username);
			eleutil.doSendKeys(pword, password);
			eleutil.doClick(login_button);
			
			return new AccountsPage(driver);
			
			//driver.findElement(email).sendKeys(username);
			//driver.findElement(pword).sendKeys(password);
			//driver.findElement(login_button).click();
			
			/*
			 * String title=eleutil.waitForURLContains(LOGIN_PAGE__FRACTION_URL,
			 * DEFAULT_TIMEOUT); System.out.print("account title is "+ title); return title;
			 */
		}
	}



