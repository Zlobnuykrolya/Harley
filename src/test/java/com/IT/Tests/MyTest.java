package com.IT.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTast {

    @Test
    public void test1() {

        app.login.login(validUser.getLogin(),validUser.getPass());
        Assert.assertEquals(app.dashBoard.getLabelEmail(),validUser.getEmail(), "Email is not valid");
    }

    @Test
    public void testSendEmailToMyself() {

        app.dashBoard.writeEmail(validUser.getEmail(),"Test email","Program test");
        app.dashBoard.gotoInbox();

        Assert.assertEquals(app.dashBoard.getLastEmailSubj(),"Test email", "Self sent email is not received");
    }
}
