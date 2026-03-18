package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);

}
