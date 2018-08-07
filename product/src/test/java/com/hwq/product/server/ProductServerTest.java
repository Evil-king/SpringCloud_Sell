package com.hwq.product.server;

import com.hwq.product.dataobject.ProductInfo;
import com.hwq.product.enums.ProductStatusEnum;
import com.hwq.product.repository.ProductInfoRepository;
import com.hwq.product.repository.ProductInfoRepositoryTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author hwq
 * @date 2018/08/03
 */
@Component
public class ProductServerTest extends ProductInfoRepositoryTest{

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findUp() throws Exception {

        List<ProductInfo> list =  productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertTrue(list.size() > 0);
    }

}