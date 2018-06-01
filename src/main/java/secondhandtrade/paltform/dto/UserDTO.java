package secondhandtrade.paltform.dto;

import java.io.Serializable;

/**
 * Copyright (C), XXX有限公司
 * FileName: UserDTO
 * Author:   chenlu
 * Date:     2018/5/20 11:06
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class UserDTO implements Serializable{
    private String uId;
    private String password;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
