package com.gl.failureanalyzerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FailureAnalyzerDemoApplication {

    //@Autowired
    HelloDear helloDear; //If we add Autowired annotation then it will search for class annotated with @Configuration / @Component etc

    public static void main(String[] args) {
        SpringApplication.run(FailureAnalyzerDemoApplication.class, args);
    }


}
