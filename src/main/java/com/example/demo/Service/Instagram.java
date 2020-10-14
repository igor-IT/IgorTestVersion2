package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service("I")
public class Instagram implements IntMessage {
    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to Instagram - "+text);
    }
}
