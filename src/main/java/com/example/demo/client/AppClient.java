package com.example.demo.client;


import com.example.demo.client.dto.Dto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(name = "wether-client", url = "${wether.api.url}")
@Headers("X-Gismeteo-Token: ${wether.api.token}")
public interface AppClient {
    @GetMapping("/")
    Dto getWetherClient(@RequestParam ("city") String city);
}
