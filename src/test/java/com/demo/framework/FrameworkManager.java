package com.demo.framework;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import java.util.Arrays;

public class FrameworkManager {
    Playwright playwright;
    Browser browser;
    Page page;
    PageManager pageManager;

    public void createPageInstance(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setChannel("chrome")
                .setHeadless(false)
                .setArgs(Arrays.asList("--start-maximized"))
                .setSlowMo(1000));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = browserContext.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com");
        pageManager = new PageManager(page);
    }

    public void closePageInstance() {
        page.close();
        browser.close();
        playwright.close();
    }

    public PageManager getPageManager() {
        return pageManager;
    }

    public Page getPage() {
        return page;
    }
}