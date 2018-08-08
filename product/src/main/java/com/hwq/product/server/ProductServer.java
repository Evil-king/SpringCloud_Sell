package com.hwq.product.server;

import com.hwq.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author hwq
 * @date 2018/08/03
 */
public interface ProductServer {

    /**
     * 查询所有在架商品
     */

    List<ProductInfo> findUp();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findByProductIdIn(List<String> productIdList);

}
