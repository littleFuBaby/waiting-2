package org.fuys.ownservice.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.fuys.ownrapi.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

	@Override
	public String echo(String message) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) 
				+ " --> " + message;
	}

}
