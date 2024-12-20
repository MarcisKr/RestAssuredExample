package org.example.restassuredexample;

import io.cucumber.spring.CucumberContextConfiguration;
import org.example.restassuredexample.constants.TestContext;
import org.example.restassuredexample.utils.Endpoints;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = ServiceConfig.class)
@SpringBootTest(classes = {Endpoints.class, TestContext.class})
public class SpringIntegrationTest {
}
