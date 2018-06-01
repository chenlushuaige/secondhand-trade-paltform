package secondhandtrade.paltform.service;


import secondhandtrade.paltform.dto.ProductDTO;
import secondhandtrade.paltform.vo.ProductVo;

import java.util.List;

public interface IOProduct {
    List<ProductVo> getProducts(ProductDTO productDTO);
}
