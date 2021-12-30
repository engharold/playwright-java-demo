package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CommonSteps {

    Page page;

    public CommonSteps(FrameworkManager setup) {
        this.page = setup.getPage();
    }

    @When("I click on {string} menu option")
    public void clickOnMenuOption(String menuOption) {
        String option = "//b[text()='" + menuOption + "']";
        page.click(option);
    }

    @And("click on {string} submenu option")
    public void clickOnSubmenuOption(String subMenuOption) {
        String option = "//a[text()='" + subMenuOption + "']";
        page.click(option);
    }
}