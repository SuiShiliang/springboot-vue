package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BaseUserInfo;
import com.ssl.springbootvue.model.pojo.BaseUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUserInfoMapper {
    long countByExample(BaseUserInfoExample example);

    int deleteByExample(BaseUserInfoExample example);

    int insert(BaseUserInfo record);

    int insertSelective(BaseUserInfo record);

    List<BaseUserInfo> selectByExample(BaseUserInfoExample example);

    int updateByExampleSelective(@Param("record") BaseUserInfo record, @Param("example") BaseUserInfoExample example);

    int updateByExample(@Param("record") BaseUserInfo record, @Param("example") BaseUserInfoExample example);
}