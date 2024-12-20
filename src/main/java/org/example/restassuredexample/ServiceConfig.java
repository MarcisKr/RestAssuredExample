package org.example.restassuredexample;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ServiceConfig {

    @Value("${base.path}")
    private String basePath;

    @Value("${donki.context.path}")
    private String donkiContextPath;

    @Value("${planetary.context.path}")
    private String planetaryContextPath;

}
