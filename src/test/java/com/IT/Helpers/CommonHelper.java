package com.IT.Helpers;

import com.IT.Pages.BasePage;

public class CommonHelper extends BasePage {
    public void stopApp() {
        driver.quit();
    }
}
