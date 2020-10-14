package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service("W")
public class WhatsAppImpl implements IntMessage {
    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to WhatsApp - "+text);
    }
}
