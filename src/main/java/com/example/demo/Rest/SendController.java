package com.example.demo.Rest;

import com.example.demo.DTO.Message;
import com.example.demo.Service.IntMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;
/**
 * @author Igor Tysh.
 */
@Controller
public class SendController {
     @Autowired
     Map<String, IntMessage> context;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessageByType(@RequestBody Message message){
       IntMessage service =  context.get(message.getType());
       if (service != null) {
           service.sendByType(message.getName(), message.getMessage());
           return ResponseEntity.status(HttpStatus.OK).build();
       }else {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
    }
}
