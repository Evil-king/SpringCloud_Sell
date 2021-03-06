package com.hwq.product.exception;

import com.hwq.product.enums.ResultEnum;

/**
 * @author hwq
 * @date 2018/08/09
 */
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public  ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
