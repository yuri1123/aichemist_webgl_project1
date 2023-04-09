package kr.aichemist.aichemist_webgl_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AichemistWebglProjectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(AichemistWebglProjectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AichemistWebglProjectApplication.class, args);
    }

}
