package com.test.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerIndexController {

	
	private String appOwnerName;
	
    public TrackerIndexController( @Value("${appowner.name}")String appOwnerName) {
		super();
		this.appOwnerName = appOwnerName;
	}

	@GetMapping("/")
    public String showIndexMessage(){
        return "This is Index Page for app owner >>>"+appOwnerName;
    }
}
