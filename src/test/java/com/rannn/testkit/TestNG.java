package com.rannn.testkit;

import org.testng.annotations.*;

public class TestNG {	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("this is before suite");
    }
	
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @BeforeTest
    public void beforeTest() {
    	System.out.println("this is before test");
    }
    
    @AfterTest
    public void afterTest() {
    	System.out.println("this is after test");
    }
    
    @Test
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }
    
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
    
    @BeforeMethod
    public void TestNgLearn3() {
        System.out.println("this is TestNG test case3");
    }
    
    @AfterMethod
    public void TestNgLearn4() {
        System.out.println("this is TestNG test case4");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
    
    @AfterSuite
    public void afterSuite() {
        System.out.println("this is after suite");
    }
}
