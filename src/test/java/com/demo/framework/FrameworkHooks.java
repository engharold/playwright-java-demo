//package com.demo.framework;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import com.demo.pages.BasePage;
//
//public class FrameworkHooks {
//    BasePage basePage;
//
//    @Before
//    public void startBrowser() {
//        basePage = new BasePage();
//        basePage.createPageInstance();
//    }
//
//    @After
//    public void stopBrowser() {
//        basePage.closePageInstance();
//    }
//}