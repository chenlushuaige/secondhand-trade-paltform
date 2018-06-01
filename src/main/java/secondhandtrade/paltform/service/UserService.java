package secondhandtrade.paltform.service;

import secondhandtrade.paltform.dto.UserDTO;
import secondhandtrade.paltform.vo.UserVo;

public interface UserService {
    UserVo getUserInfo(UserDTO userDTO);
}
