package org.example.restassuredexample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        glue = "org.example.restassuredexample.steps",
        plugin = {"pretty", "html:target/cucumber-reports/cucumberResults.html"},
        tags = "not @ignore")
public class CucumberTest extends SpringIntegrationTest{
}
