package com.demo.pages;

import com.microsoft.playwright.Page;
import static org.junit.Assert.assertTrue;

public class EmployeePage extends BasePage{

    Page page;

    String txtEmployeeName = "//input[@id='txtUsername']";
    String btnSearch = "//*[@id='btnLogin']";

    public EmployeePage(Page page) {
        this.page = page;
    }

}