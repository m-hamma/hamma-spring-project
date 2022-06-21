package com.hamma.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hamma.models.HelloWorld;
import com.hamma.services.ExempleServices;

@Controller
public class HelloWorldController {
	@Autowired
	private ExempleServices exempleServices;

    @RequestMapping("/helloworld")
    public String handler(Model model) {

        HelloWorld helloWorld = exempleServices.traiter();
        model.addAttribute("helloWorld", helloWorld);
        return "helloworld";
    }
}
