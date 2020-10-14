package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service("F")
public class Facebook implements IntMessage {
    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to Facebook - "+text);
    }
}
