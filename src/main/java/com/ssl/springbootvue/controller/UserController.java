package com.ssl.springbootvue.controller;

import com.ssl.springbootvue.model.DTO.RestResult;
import com.ssl.springbootvue.model.param.UserParam;
import com.ssl.springbootvue.model.pojo.User;
import com.ssl.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService ;

    @PostMapping("/findUserList")
    public RestResult<List<User>> findUserList(@RequestBody UserParam param){
        RestResult restResult = new RestResult<>();
        if (StringUtils.isEmpty(param.getUsername())|| StringUtils.isEmpty(param.getPassword())){
            restResult.setResult(false);
            restResult.setData(null);
            if(StringUtils.isEmpty(param.getUsername())){
                restResult.setCode("NullName");
                restResult.setMessage("用户名为空");
            }else {
                restResult.setCode("NullPwd");
                restResult.setMessage("密码为空");
            }
            return restResult;
        }
        List<User> userList = userService.findUserListByNameAndPwd(param);
        if(null == userList || userList.size() == 0){
            restResult.setResult(false);
            restResult.setData(null);
            restResult.setCode("NullList");
            restResult.setMessage("未找到匹配的数据");
            return restResult;
        }
        restResult.setResult(true);
        restResult.setData(userList);
        restResult.setCode("SUCCESS");
        restResult.setMessage("查询成功");
        return restResult;
    }
}
