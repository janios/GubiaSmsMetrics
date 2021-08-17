package com.cristian.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian.model.SmsWhatsapp;

public interface SmsWhatsappDAO extends JpaRepository<SmsWhatsapp, Long> {

}
