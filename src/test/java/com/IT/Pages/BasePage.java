package com.IT.Pages;

import com.IT.Driver.DriverFactory;
import com.IT.Driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    protected static MyDriver driver = MyDriver.getMyDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
