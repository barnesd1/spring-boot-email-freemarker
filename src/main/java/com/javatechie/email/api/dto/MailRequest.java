package com.javatechie.email.api.dto;

import lombok.Data;

@Data
public class MailRequest {
	
	private String toName;
	private String fromName;
	private String body;
	private String to;
	private String from;
	private String subject;
	private String location;

}
