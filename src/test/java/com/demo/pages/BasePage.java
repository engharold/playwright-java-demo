package com.demo.pages;

import com.microsoft.playwright.*;

public class BasePage {
    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    public Page createPageInstance() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        return page;
    }

    public void closePageInstance() {
        page.close();
    }

    public Page getPage() {
        return page;
    }
}