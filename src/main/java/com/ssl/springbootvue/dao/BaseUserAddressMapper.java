package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BaseUserAddress;
import com.ssl.springbootvue.model.pojo.BaseUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUserAddressMapper {
    long countByExample(BaseUserAddressExample example);

    int deleteByExample(BaseUserAddressExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseUserAddress record);

    int insertSelective(BaseUserAddress record);

    List<BaseUserAddress> selectByExample(BaseUserAddressExample example);

    BaseUserAddress selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseUserAddress record, @Param("example") BaseUserAddressExample example);

    int updateByExample(@Param("record") BaseUserAddress record, @Param("example") BaseUserAddressExample example);

    int updateByPrimaryKeySelective(BaseUserAddress record);

    int updateByPrimaryKey(BaseUserAddress record);
}