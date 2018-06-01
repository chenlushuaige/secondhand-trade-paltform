package secondhandtrade.paltform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrade.paltform.dto.UserDTO;
import secondhandtrade.paltform.mapper.UserMapper;
import secondhandtrade.paltform.service.UserService;
import secondhandtrade.paltform.vo.UserVo;

/**
 * Copyright (C), XXX有限公司
 * FileName: GetUserInfoServiceImpl
 * Author:   chenlu
 * Date:     2018/5/20 11:15
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service
public class GetUserInfoServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public UserVo getUserInfo(UserDTO userDTO) {
        return mapper.selectUserByIdAndPassword(userDTO);
    }
}
