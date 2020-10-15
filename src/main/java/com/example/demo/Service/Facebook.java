package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service()
public class Facebook implements IntMessage {

    private final String type = "F";

    @Override
    public void sendByType(String name, String text) {
        System.out.println("Message from: "+name+" sent to Facebook - "+text);
    }
    @Override
    public String getType(){
        return type;
    }

}
