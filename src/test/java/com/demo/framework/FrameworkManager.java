package com.demo.framework;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class FrameworkManager {
    Playwright playwright;
    Browser browser;
    Page page;
    PageObjectManager pageObjectManager;

    public void createPageInstance() throws Exception {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com");


        pageObjectManager = new PageObjectManager(page);
    }

    @After
    public void closePageInstance() throws Exception {
        page.close();
        browser.close();
        playwright.close();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public Page getPage() {
        return page;
    }

}
