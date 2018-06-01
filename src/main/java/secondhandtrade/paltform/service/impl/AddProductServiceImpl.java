package secondhandtrade.paltform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrade.paltform.mapper.ProductMapper;
import secondhandtrade.paltform.model.Product;
import secondhandtrade.paltform.service.AddProductService;

/**
 * Copyright (C), XXX有限公司
 * FileName: AddProductServiceImpl
 * Author:   chenlu
 * Date:     2018/5/20 9:51
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service
public class AddProductServiceImpl implements AddProductService {
    @Autowired
    ProductMapper mapper;

    @Override
    public int addProduct(Product product) {
        return mapper.insert(product);
    }
}
