package com.demo.framework;

import com.demo.pages.EmployeePage;
import com.microsoft.playwright.Page;
import com.demo.pages.LoginPage;

public class PageObjectManager {
    private final Page page;
    private LoginPage loginPage;
    private EmployeePage employeePage;

    public PageObjectManager(Page page) {
        this.page = page;
//        this.loginPage = new LoginPage(page);
//        this.employeePage = new EmployeePage(page);
    }

    public EmployeePage getEmployeePage() {
        return employeePage;
    }

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(page) : loginPage;
    }
}