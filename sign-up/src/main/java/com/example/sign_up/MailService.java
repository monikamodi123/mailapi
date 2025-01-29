package com.example.sign_up;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
	@Autowired
    private JavaMailSender mailSender;
	
	public String testMail() throws Exception{
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		String htmlMsg = "<h3><a href='https://google.com'>Test Mail</a></h3>";
		helper.setTo("monikahoneycomb@gmail.com");
		helper.setText(htmlMsg, true);
		helper.setSubject("test mail");
		mailSender.send(message);
		return "Success";
	}
}
