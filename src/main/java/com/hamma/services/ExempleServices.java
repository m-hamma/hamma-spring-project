package com.hamma.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.hamma.models.HelloWorld;

@Service
public class ExempleServices {
	public HelloWorld traiter() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		return helloWorld;
	}
}
