package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service()
public class WhatsAppImpl implements IntMessage {

    private final String type = "W";

    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to WhatsApp - "+text);
    }
    @Override
    public String getType(){
        return type;
    }
}
