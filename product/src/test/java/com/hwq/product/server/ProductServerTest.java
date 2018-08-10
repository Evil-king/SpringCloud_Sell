package com.hwq.product.server;

import com.hwq.product.dto.CarDTO;
import com.hwq.product.ProductApplicationTests;
import com.hwq.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author hwq
 * @date 2018/08/03
 */
@Component
public class ProductServerTest extends ProductApplicationTests{

    @Autowired
    private ProductServer productServer;

    @Test
    public void findUp() throws Exception {
        List<ProductInfo> list =  productServer.findUp();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdIn() throws Exception {
        List<ProductInfo> list = productServer.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception {
        CarDTO carDTO = new CarDTO("157875196366160022",2);
        productServer.decreaseStock(Arrays.asList(carDTO));
    }

}