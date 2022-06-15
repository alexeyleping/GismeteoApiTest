package com.example.demo.controller;

import com.example.demo.client.dto.Dto;
import com.example.demo.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
    private AppService appService;
    private String city;

    public AppController(AppService appService){
        this.appService = appService;
    }

    @GetMapping("/today/{city}")
        public String getWether(String city){
            return appService.wetherServiceMethod(city);
        }
    }

