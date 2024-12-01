package com.sys.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "console-consumer-9836")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
