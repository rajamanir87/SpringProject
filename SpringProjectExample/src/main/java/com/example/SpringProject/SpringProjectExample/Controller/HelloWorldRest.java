package com.example.SpringProject.SpringProjectExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {
	
@GetMapping(path="/Hello-World")
public String HelloWorldMe() {
	return "Hello World";
}

}
