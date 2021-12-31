package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import com.demo.pages.MainPage;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    LoginPage loginPage;
    MainPage mainPage;

    public LoginSteps(FrameworkManager setup) {
        setup.createPageInstance();
        loginPage = setup.getPageManager().getLoginPage();
        mainPage = setup.getPageManager().getMainPage();
    }

    @Given("I log in successfully to the application")
    public void LogInSuccessfullyToTheApplication() {
        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLoginButton();
        assertTrue(mainPage.getWelcomeMessage().contains("Welcome"));
    }
}