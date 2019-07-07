package com.IT.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage extends BasePage {
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement labelEmail;

    public String getLabelEmail() {
        return labelEmail.getText();
    }

    @FindBy(xpath = "//*[@class='make_message']/a")
    private WebElement createEmail;

    @FindBy(xpath = "//*[@id='to']")
    private WebElement txtTo;

    @FindBy(name = "subject")
    private WebElement txtSubject;

    @FindBy(xpath = "//*[@id='text']")
    private WebElement txtText;

    @FindBy(name = "send")
    private WebElement btnSend;

    @FindBy(xpath = "//*[@class='new']/a")
    private WebElement btnInbox;

    @FindBy(xpath = "//*[@class='sbj'][1]/span")
    private WebElement labelLastEmailSubj;

    public String getLastEmailSubj() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(labelLastEmailSubj)).getText();

    }


    public void writeEmail (String to, String subject, String body) {
        createEmail.click();
        txtTo.click();
        txtTo.sendKeys(to);

        txtSubject.click();
        txtSubject.sendKeys(subject);

        txtText.click();
        txtText.sendKeys(body);

        btnSend.click();
    }

    public void gotoInbox () {
        btnInbox.click();

    }

}
