package com.portfolio.rest.portifoliorest.firstcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //URI /firstcontroller
    //method - "first controller"
    @RequestMapping(method = RequestMethod.GET, path = "/first-controller")
    public String firstController(){
        return "first Controller";
    }

}
