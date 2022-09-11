package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String greeting(){
        String authCode = environment.getProperty("myCustomProps.authCode");
        String devName = environment.getProperty("myCustomProps.devName");
        return "welcome user - Your AuthCode is: " + authCode + " devName: " + devName;

    }
}
