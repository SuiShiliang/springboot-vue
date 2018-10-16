package com.ssl.springbootvue.service.impl;

import com.ssl.springbootvue.dao.UserMapper;
import com.ssl.springbootvue.model.param.UserParam;
import com.ssl.springbootvue.model.pojo.User;
import com.ssl.springbootvue.model.pojo.UserExample;
import com.ssl.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findUserListByNameAndPwd(UserParam param) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andUsernameEqualTo(param.getUsername())
                .andPasswordEqualTo(param.getPassword());
        List<User> list = userMapper.selectByExample(example);
        return list;
    }
}
