package secondhandtrade.paltform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import secondhandtrade.paltform.common.ApiResult;
import secondhandtrade.paltform.dto.ProductDTO;
import secondhandtrade.paltform.service.IOProduct;
import secondhandtrade.paltform.vo.ProductVo;

import java.util.List;

/**
 * Copyright (C), XXX有限公司
 * FileName: AddProductController
 * Author:   chenlu
 * Date:     2018/5/19 21:02
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class GetProductController {
    @Autowired
    IOProduct product;
    @RequestMapping(path="/index" ,method = RequestMethod.POST)
    public ApiResult getProducts(@RequestBody ProductDTO productDTO){
        ApiResult<List<ProductVo>> result=new ApiResult<>();
        List<ProductVo> list=product.getProducts(productDTO);
        if(list.size()<=0){
            result.setIsSuccess(false);
        }
        result.setResult(list);
        return result;
    }
}
