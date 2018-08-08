package com.hwq.product.server.impl;

import com.hwq.product.dataobject.ProductInfo;
import com.hwq.product.enums.ProductStatusEnum;
import com.hwq.product.repository.ProductInfoRepository;
import com.hwq.product.server.ProductServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hwq
 * @date 2018/08/03
 */
@Service
public class ProductServerImpl implements ProductServer {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUp() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findByProductIdIn(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }
}
