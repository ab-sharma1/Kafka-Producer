package com.example.Kafkademo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import com.example.Kafkademo.entities.account;

@Service
public class KafkaProducer {
	
	
	 @Autowired
	    public KafkaTemplate<String, account> kafkaTemplate;


		public String sendMessage(account accountDetails) {
			
			if(!accountDetails.equals(null))
			{
				kafkaTemplate.send("acc",accountDetails);
			 System.out.println("done success");
			 return "successfully added";
			}
			 System.out.println("not done");
			return "unable to process";
		}
	
}
