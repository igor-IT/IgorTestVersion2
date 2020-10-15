package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service()
public class Instagram implements IntMessage {

    private final String type = "I";

    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to Instagram - "+text);
    }
    @Override
    public String getType(){
        return type;
    }
}
