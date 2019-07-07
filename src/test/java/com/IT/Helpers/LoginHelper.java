package com.IT.Helpers;

import com.IT.Entity.User;
import com.IT.Entity.UserFactory;
import com.IT.Pages.LoginPage;

public class LoginHelper extends LoginPage {
    public void LoginValidUser() {
        User user = UserFactory.getValidUser();
        log.info(String.format("Login user name - %s, password - %s", user.getLogin(), user.getPass()));
        login(user.getLogin(),user.getPass());
    }

    public void LoginUser(User user) {
        log.info(String.format("Login user name - %s, password - %s", user.getLogin(), user.getPass()));
        login(user.getLogin(),user.getPass());

    }
}
