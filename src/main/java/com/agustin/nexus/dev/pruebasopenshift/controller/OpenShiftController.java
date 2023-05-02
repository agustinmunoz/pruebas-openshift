package com.agustin.nexus.dev.pruebasopenshift.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class OpenShiftController {
	
	 @GetMapping("/open-shift")
	    public String getUsers() throws Exception {

	        return "hola Mundo";
	    }

}
