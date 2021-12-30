package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.EmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class EmployeeSearchSteps {

    EmployeePage employeePage;

    public EmployeeSearchSteps(FrameworkManager setup) {
        employeePage = setup.getPageManager().getEmployeePage();
    }

    @And("^input (.*) in Employee Name search field$")
    public void inputEmployeeNameInEmployeeNameSearchField(String employeeName) {
        employeePage.inputEmployeeName(employeeName);
    }

    @And("click Search button")
    public void clickSearchButton() {
        employeePage.clickSearchButton();
    }

    @Then("^I see (.*) in the result list$")
    public void iSeeEmployeeNameInTheResultList(String employeeName) {
        String shownEmployeeName = employeePage.getEmployeeName();
        assertTrue(shownEmployeeName.equalsIgnoreCase(employeeName));
    }
}