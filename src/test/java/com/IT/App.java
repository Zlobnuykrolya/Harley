package com.IT;

import com.IT.Helpers.CommonHelper;
import com.IT.Helpers.DashBoardHelper;
import com.IT.Helpers.LoginHelper;

import javax.sql.CommonDataSource;

public class App {
    public LoginHelper login;
    public DashBoardHelper dashBoard;
    public CommonHelper common;

    public App() {
        login = new LoginHelper();
        dashBoard = new DashBoardHelper();
        common = new CommonHelper();
    }


}
