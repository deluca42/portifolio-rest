package com.portfolio.rest.portifoliorest.messageBean;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageBeanController {
    @GetMapping(path = "/message-bean-controller", produces = MediaType.APPLICATION_JSON_VALUE)
    public MessageBean messageBean(){
        return new MessageBean("this is message bean");
    }
}

    




