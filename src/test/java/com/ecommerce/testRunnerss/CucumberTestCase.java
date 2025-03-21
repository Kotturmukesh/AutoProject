package com.ecommerce.testRunnerss;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


import org.testng.annotations.Test;




@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.ecommerce.stepDefinitions"},
    plugin = {"pretty", "html:target/cucumber-reports.html" , "html:reports/HTMLReports.html"}
    //, tags="@quantity"
 )


@Test
public class CucumberTestCase extends AbstractTestNGCucumberTests {

}
