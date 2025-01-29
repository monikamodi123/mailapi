package com.example.sign_up;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
	private MailService mailService;
    
    @GetMapping
    public String sendMail() throws Exception{
    	return mailService.testMail();
    }
    
}
