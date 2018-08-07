package com.hwq.product.server;

import com.hwq.product.dataobject.ProductCategory;
import com.hwq.product.repository.ProductCategoryRepository;
import com.hwq.product.repository.ProductCategoryRepositoryTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author hwq
 * @date 2018/08/03
 */
@Component
public class ProductCategoryServerTest extends ProductCategoryRepositoryTest{

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list =  productCategoryRepository.findByCategoryTypeIn(Arrays.asList(1,22));
        Assert.assertTrue(list.size() > 0);
    }

}