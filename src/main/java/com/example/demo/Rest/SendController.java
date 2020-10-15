package com.example.demo.Rest;

import com.example.demo.DTO.Message;
import com.example.demo.Service.IntMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;
/**
 * @author Igor Tysh.
 */
@Controller
public class SendController {

     @Autowired
     Map<String, IntMessage> context;
    //Version 2
    @PostMapping("/send")
    public ResponseEntity<String> sendMessageByType(@RequestBody Message message){
        Collection<IntMessage> messages = context.values();
       if (!messages.isEmpty()){
           IntMessage obj =  messages.stream().filter(f -> f.getType().equalsIgnoreCase(message.getType())).findFirst().get();
           obj.sendByType(message.getName(), message.getMessage());
           return ResponseEntity.status(HttpStatus.OK).build();
       }else {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
    }
}
