package secondhandtrade.paltform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrade.paltform.dto.ProductDTO;
import secondhandtrade.paltform.mapper.ProductMapper;
import secondhandtrade.paltform.service.IOProduct;
import secondhandtrade.paltform.vo.ProductVo;

import java.util.List;

/**
 * Copyright (C), XXX有限公司
 * FileName: IOProductImpl
 * Author:   chenlu
 * Date:     2018/5/19 21:12
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service
public class IOProductImpl implements IOProduct {


    @Autowired
    ProductMapper mapper;

    @Override
    public List<ProductVo> getProducts(ProductDTO productDTO) {
        return mapper.getProduct(productDTO);
    }
}
