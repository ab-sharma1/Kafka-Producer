package com.example.Kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kafkademo.entities.account;
import com.example.Kafkademo.services.KafkaProducer;


@RestController
@RequestMapping("/rest/api")
public class FetchMessages {

	@Autowired
    KafkaProducer kafkaProducer;

    
	  @PostMapping(value = "/send")
	    public void send(@RequestBody account account) {

			kafkaProducer.sendMessage(account);
	    }

}
