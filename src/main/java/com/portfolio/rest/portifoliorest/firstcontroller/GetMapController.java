package com.portfolio.rest.portifoliorest.firstcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GetMapController {
    
    @GetMapping(path = "/get-mapping-controller")
    public String getMappingController(){
        return "getMappingController annotation.";
    }


}
