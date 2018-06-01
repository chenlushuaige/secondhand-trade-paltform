package secondhandtrade.paltform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secondhandtrade.paltform.common.ApiResult;
import secondhandtrade.paltform.dto.UserDTO;
import secondhandtrade.paltform.mapper.UserMapper;
import secondhandtrade.paltform.service.UserService;
import secondhandtrade.paltform.vo.UserVo;

/**
 * Copyright (C), XXX有限公司
 * FileName: GetUserController
 * Author:   chenlu
 * Date:     2018/5/20 10:58
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class GetUserController {
    @Autowired
    UserService userService;
    @RequestMapping("user")
    public ApiResult<UserVo> getUserInfo(@RequestBody UserDTO userDTO){
        ApiResult<UserVo> result=new ApiResult<>();
        UserVo userVo=userService.getUserInfo(userDTO);
        result.setResult(userVo);
        if(userDTO==null){
            result.setIsSuccess(false);
        }
        return result;
    }
}
