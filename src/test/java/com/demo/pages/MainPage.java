package com.demo.pages;

import com.microsoft.playwright.Page;

public class MainPage {

    Page page;

    String lblWelcome = "//*[@id='welcome']";

    public MainPage(Page page) {
        this.page = page;
    }

    public String getWelcomeMessage() {
        return page.textContent(lblWelcome);
    }
}