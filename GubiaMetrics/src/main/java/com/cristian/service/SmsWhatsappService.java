package com.cristian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.DAO.SmsWhatsappDAO;
import com.cristian.model.SmsWhatsapp;

@Service
public class SmsWhatsappService {

	@Autowired
	SmsWhatsappDAO dao;
	
	
	public List<SmsWhatsapp> getSmsWhatsapp(){
		
		return dao.findAll();
		
	}
}
