package com.demo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps {


    @When("I select PIM > Employee List menu options")
    public void iSelectPIMEmployeeListMenuOptions() {
        System.out.println("Teste");
    }

    @And("^fill employee name (.*)$")
    public void fillEmployeeNameEmployeeName(String employeeName) {
        System.out.println("Teste");
    }

    @And("click Search button")
    public void clickButtonSearch() {
        System.out.println("Teste");
    }

    @Then("^I see (.*) in the result list$")
    public void iSeeEmployeeNameInTheResultList(String employeeName) {
        System.out.println("Teste");
    }
}