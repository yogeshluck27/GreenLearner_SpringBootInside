package com.gl.failureanalyzerdemo;

import org.springframework.context.annotation.Configuration;


//@Configuration  //If we add this annotation no failure as we are autowiring it in DemoApp class
public class HelloDear {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
