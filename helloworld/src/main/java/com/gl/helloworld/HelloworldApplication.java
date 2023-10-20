package com.gl.helloworld;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
		/*
		 * SpringApplication app = new SpringApplication(HelloworldApplication.class);
		 * app.setBannerMode(Mode.OFF);
		 * app.setWebApplicationType(WebApplicationType.NONE); app.run(args);
		 */
    	SpringApplication app = new SpringApplication(HelloworldApplication.class);
		 app.setBannerMode(Mode.CONSOLE);
		 app.setWebApplicationType(WebApplicationType.SERVLET);
		 app.run(args);
    	
    }

}
