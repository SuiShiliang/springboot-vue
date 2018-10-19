package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BaseRoleMenu;
import com.ssl.springbootvue.model.pojo.BaseRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRoleMenuMapper {
    long countByExample(BaseRoleMenuExample example);

    int deleteByExample(BaseRoleMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseRoleMenu record);

    int insertSelective(BaseRoleMenu record);

    List<BaseRoleMenu> selectByExample(BaseRoleMenuExample example);

    BaseRoleMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseRoleMenu record, @Param("example") BaseRoleMenuExample example);

    int updateByExample(@Param("record") BaseRoleMenu record, @Param("example") BaseRoleMenuExample example);

    int updateByPrimaryKeySelective(BaseRoleMenu record);

    int updateByPrimaryKey(BaseRoleMenu record);
}