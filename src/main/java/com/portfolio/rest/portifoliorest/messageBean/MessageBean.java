package com.portfolio.rest.portifoliorest.messageBean;

public class MessageBean {
    
    private String message;

    public MessageBean(String message){
        this.message = message;
    }

    public String getMessage(String message){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return String.format("MessageBean [message=%s]", message );
    }

}
