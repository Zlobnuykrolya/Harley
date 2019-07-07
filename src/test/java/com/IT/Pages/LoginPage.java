package com.IT.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(name = "login")
	private WebElement login;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btnLogin;

    public void login (String log, String pass) {
    	driver.scrollDown();
    	driver.scrollUp();
    	login.sendKeys(log);
	    password.sendKeys(pass);
	    btnLogin.click();
    }

}
