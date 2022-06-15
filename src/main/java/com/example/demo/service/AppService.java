package com.example.demo.service;

import com.example.demo.client.AppClient;
import com.example.demo.client.dto.Dto;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private AppClient appClient;


    public AppService(AppClient appClient){
        this.appClient = appClient;
    }

    public String wetherServiceMethod(String city){
        Dto dto = appClient.getWetherClient(city);
        return dto.toString();
    }


}
