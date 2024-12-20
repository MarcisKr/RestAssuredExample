package org.example.restassuredexample.constants;

import io.restassured.response.Response;
import lombok.Data;

@Data
public class TestContext {

    private Response response = null;

    public void clearContext() {
        setResponse(null);
    }

}
