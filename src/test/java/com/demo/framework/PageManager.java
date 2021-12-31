package com.demo.framework;

import com.demo.pages.EmployeePage;
import com.demo.pages.MainPage;
import com.microsoft.playwright.Page;
import com.demo.pages.LoginPage;

public class PageManager {
    private final Page page;
    private MainPage mainPage;
    private LoginPage loginPage;
    private EmployeePage employeePage;

    public PageManager(Page page) {
        this.page = page;
    }

    public EmployeePage getEmployeePage() {
        return (employeePage == null) ? employeePage = new EmployeePage(page) : employeePage ;
    }

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(page) : loginPage;
    }

    public MainPage getMainPage() {
        return (mainPage == null) ? mainPage = new MainPage(page) : mainPage;
    }
}