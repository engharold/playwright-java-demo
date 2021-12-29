package com.demo.pages;

import com.microsoft.playwright.Page;
import static org.junit.Assert.assertTrue;

public class LoginPage{

    Page page;

    String txtUserName = "//input[@id='txtUsername']";
    String txtPassword = "//input[@id='txtPassword']";
    String btnLogin = "//*[@id='btnLogin']";
    String lblWelcome = "//*[@id='welcome']";

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

    public void validateSuccessfulLogin() {
        String welcomeMessage = page.textContent(lblWelcome);
        assertTrue(welcomeMessage.contains("Welcome"));
    }
}