package secondhandtrade.paltform.vo;

/**
 * Copyright (C), XXX有限公司
 * FileName: UserVo
 * Author:   chenlu
 * Date:     2018/5/20 10:59
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class UserVo {
    private String name;
    private String uId;
    private String dormitory;
    private String phone;
    private String bNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }
}
