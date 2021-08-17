package com.cristian.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.model.SmsWhatsapp;
import com.cristian.model.SmsWhatsappDto;
import com.cristian.service.SmsWhatsappService;

@RestController
public class SmsWhatsappController {
	
	@Autowired
	SmsWhatsappService smsWhatsappService;
	
	@Autowired
	ModelMapper mapper;

	@GetMapping("/smswhatsapp")
	public List<SmsWhatsappDto> getSmsWhatapp(){
		
		return smsWhatsappService.getSmsWhatsapp().stream().map(this::convertToDto).collect(Collectors.toList());
				
		
	}
	
	
	
	private SmsWhatsappDto convertToDto(SmsWhatsapp smsWhats) {
		return mapper.map(smsWhats, SmsWhatsappDto.class);
	}
}
