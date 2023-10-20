package com.gl.failureanalyzerdemo;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

public class MyFailureAnalyzer2 implements FailureAnalyzer {
	//For this to work remove @Autowired annotation in SpringBoot main class
	//And run application on same port twice
	
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("custom generic msg", "action to do", failure);
    }
}
