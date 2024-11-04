package com.codeq.SprintbootFlowerAPI.enkinsIntegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String home(){
        return "Chayan chowdhury";
    }
}
