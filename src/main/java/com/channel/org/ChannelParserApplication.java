package com.channel.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This application is responsible for hosting a Channel Details 
 * parsing application
 */
@SpringBootApplication
public class ChannelParserApplication extends SpringBootServletInitializer {
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChannelParserApplication.class);
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ChannelParserApplication.class, args);
    }
}
