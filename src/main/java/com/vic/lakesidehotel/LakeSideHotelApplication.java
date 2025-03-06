package com.vic.lakesidehotel;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Lakeside hotel API", version = "0.0.1-SNAPSHOT", description = "Lakeside hotel backend services"))
public class LakeSideHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(LakeSideHotelApplication.class, args);
    }

}
