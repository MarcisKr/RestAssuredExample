package org.example.restassuredexample.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.example.restassuredexample.ServiceConfig;
import org.example.restassuredexample.constants.ApiPaths;
import org.example.restassuredexample.constants.Naming;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.given;
import static io.restassured.filter.log.LogDetail.METHOD;
import static io.restassured.filter.log.LogDetail.URI;
import static io.restassured.http.ContentType.JSON;
import static org.example.restassuredexample.constants.Naming.API_KEY;
import static org.example.restassuredexample.constants.Naming.DEMO_KEY;

@Slf4j
public class Endpoints {

    @Autowired
    public ServiceConfig serviceConfig;

    public Response getApod() {
        String urlPath = serviceConfig.getPlanetaryContextPath() + ApiPaths.PATH_APOD;
        var response = given().spec(buildBaseRequestSpec()
                .build())
                .get(urlPath);
        log.info(Naming.RESPONSE_BODY + response.getBody().print());
        return response;
    }

    private RequestSpecBuilder buildBaseRequestSpec() {
        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setBaseUri(serviceConfig.getBasePath())
                .setContentType(JSON)
                .addQueryParam(API_KEY, DEMO_KEY)
                .setRelaxedHTTPSValidation()
                .log(METHOD)
                .log(URI);
        return requestBuilder;
    }

}
