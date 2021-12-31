package com.demo.pages;

import com.microsoft.playwright.Page;

public class LoginPage{

    Page page;

    String txtUserName = "//input[@id='txtUsername']";
    String txtPassword = "//input[@id='txtPassword']";
    String btnLogin = "//*[@id='btnLogin']";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void inputUserName(String userName) {
        page.fill(txtUserName, userName);
    }

    public void inputPassword(String password) {
        page.fill(txtPassword, password);
    }

    public void clickLoginButton() {
        page.click(btnLogin);
    }
}