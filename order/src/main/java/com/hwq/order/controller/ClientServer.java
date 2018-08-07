package com.hwq.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hwq
 * @date 2018/08/05
 */
@RestController
@Slf4j
public class ClientServer {

    @GetMapping("/getProdunt")
    public String getProduntMsg(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8080/msg",String.class);
        log.info("result={}",result);
        return  result;
    }
}
