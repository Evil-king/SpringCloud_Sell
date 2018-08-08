package com.hwq.order.controller;

import com.google.gson.JsonObject;
import com.hwq.order.client.ProductClient;
import com.hwq.order.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author hwq
 * @date 2018/08/05
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProdunt")
    public String getProduntMsg(){
        String result = productClient.productMsg();
        log.info("result={}",result);
        return  result;
    }

    @GetMapping("/getProduntList")
    public String getProduntList(){
        List<ProductInfo> productInfoList = productClient.listForOrder(Arrays.asList("164103465734242707"));
        log.info("productInfoList={}", productInfoList);
        return  "Ok";
    }
}
