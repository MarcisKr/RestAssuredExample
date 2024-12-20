package org.example.restassuredexample.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.example.restassuredexample.constants.TestContext;
import org.example.restassuredexample.utils.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class Apod {

    @Autowired
    private Endpoints endpoints;
    @Autowired
    private TestContext testContext;

    @When("I see NASA's astronomy picture of the day")
    public void getApod() {
        testContext.setResponse(endpoints.getApod());
    }

    @Then("the picture is amazing")
    public void validateGetApod() {
        var picture = testContext.getResponse();
        log.info("This picture is amazing!");
    }

}
