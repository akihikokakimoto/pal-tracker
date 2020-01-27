package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${welcome.message}")
    private String _message;

    public WelcomeController(){
    }

    public WelcomeController(String message){
        _message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return _message;
    }
}