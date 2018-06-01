package secondhandtrade.paltform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secondhandtrade.paltform.common.ApiResult;
import secondhandtrade.paltform.model.Product;
import secondhandtrade.paltform.service.AddProductService;

import java.util.Date;

/**
 * Copyright (C), XXX有限公司
 * FileName: AddProductController
 * Author:   chenlu
 * Date:     2018/5/20 9:47
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class AddProductController {
    @Autowired
    AddProductService addProductService;

    @RequestMapping("addProduct")
    public ApiResult<String> addProduct(@RequestBody Product product){
        ApiResult<String> result=new ApiResult<>();
        product.setpId(product.getuId().hashCode()+"");
        product.setFlag(0);
        product.setStartDate(new Date());
        product.setState(0);
        if(addProductService.addProduct(product)>0){
            result.setIsSuccess(true);
        }
        return result;
    }
}
