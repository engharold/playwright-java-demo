package com.demo.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

import static org.junit.Assert.assertTrue;

public class EmployeePage{

    Page page;

    String txtEmployeeNameSearchFilter = "//input[@id='empsearch_employee_name_empName']";
    String btnSearch = "//*[@id='searchBtn']";
    String cellEmployeeFirstName = "//*[@id='resultTable']/tbody/tr/td[3]/a";
    String cellEmployeeLastName = "//*[@id='resultTable']/tbody/tr/td[4]/a";

    public EmployeePage(Page page) {
        this.page = page;
    }

    public void inputEmployeeName(String employeeName) {
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.fill(txtEmployeeNameSearchFilter, employeeName);
    }

    public void clickSearchButton() {
        page.click(btnSearch);
    }

    public String getEmployeeName() {
        return page.textContent(cellEmployeeFirstName) + " " + page.textContent(cellEmployeeLastName);
    }
}