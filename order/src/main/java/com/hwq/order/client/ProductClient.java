package com.hwq.order.client;

import com.hwq.order.dataobject.ProductInfo;
import com.hwq.order.dto.CarDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author hwq
 * @date 2018/08/08
 */
@FeignClient(name="product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CarDTO> carDTOList);
}
