package com.demo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        features = "src/test/resources/features/",
        glue = {"com.demo.stepdefinitions"},
        plugin = {"pretty","html:target/Summarized-Cucumber-Report.html","me.jvt.cucumber.report.PrettyReports:target","json:target/cucumber.json"},
        monochrome = true
)

public class TestRunner {

}