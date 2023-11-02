package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
tags=("@smokeTest,@sanityTest"),
plugin= {"html:Reports/Html_Report",
		"pretty",
		"json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"
		}
      )

public class RunnerClass {
	public static WebDriver driver;// null

	@BeforeClass
	public static void setUp() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\AdactinCucumber\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		//driver.close();

	}
}
