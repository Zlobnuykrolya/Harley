package com.IT.Tests;

import com.IT.App;
import com.IT.Entity.User;
import com.IT.Entity.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTast {
    User validUser = UserFactory.getValidUser();
    App app = new App();

    @AfterSuite
    public void tearDown() {
        app.common.stopApp();
    }
}
