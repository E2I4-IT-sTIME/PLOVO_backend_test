package com.kb_hackathon.plovo;

import com.kb_hackathon.plovo.config.properties.AppProperties;
import com.kb_hackathon.plovo.config.properties.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})
public class PlovoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlovoApplication.class, args);
    }

}
