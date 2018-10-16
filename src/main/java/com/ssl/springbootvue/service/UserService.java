package com.ssl.springbootvue.service;

import com.ssl.springbootvue.model.param.UserParam;
import com.ssl.springbootvue.model.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findUserListByNameAndPwd(UserParam param);
}
