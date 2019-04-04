package com.test.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerIndexController {

    @GetMapping("/")
    public String showIndexMessage(){
        return "This is Index Page";
    }
}
