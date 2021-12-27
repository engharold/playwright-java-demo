package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps(FrameworkManager setup) throws Exception {
        setup.createPageInstance();
        loginPage = setup.getPageObjectManager().getLoginPage();
    }

    @Given("I log in successfully to the application")
    public void LogInSuccessfullyToTheApplication() {
        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLoginButton();
        loginPage.validateSuccessfulLogin();
    }
}
