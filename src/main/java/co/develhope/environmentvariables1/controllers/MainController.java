package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    // Get the information from the YML file.
    @GetMapping("/")
    public String multi(){
        String authCode = environment.getProperty("property.authCode");
        String devName = environment.getProperty("property.devName");
        return "welcome user - Your AuthCode is: " + authCode + " devName: " + devName;
    }
}
