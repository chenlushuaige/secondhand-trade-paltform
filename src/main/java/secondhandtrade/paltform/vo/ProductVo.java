package secondhandtrade.paltform.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Copyright (C), XXX有限公司
 * FileName: ProductVo
 * Author:   chenlu
 * Date:     2018/5/19 21:06
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class ProductVo implements Serializable{
    private String pName;
    private Integer type;
    private BigDecimal price;
    private String description;
    private String image;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
