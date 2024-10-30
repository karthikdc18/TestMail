package com.codedecode.testemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codedecode.testemail.service.SendEmailService;




@RestController
public class EmailController {
	
	
	@Autowired
	private SendEmailService sendEmailService;
	
	
	@GetMapping("sendEmail")
	public String sendEmail() {
	    try {
	        sendEmailService.sendEmail("dc.karthik.18@gmail.com", "Winner winner chicken dinner","Real_Dynamic");
	        return "Email sent successfully";
	    } catch (Exception e) {
	        // Log the error (use a logger in a real application)
	        e.printStackTrace();
	        return "Failed to send email: " + e.getMessage();
	    }
	}

}
