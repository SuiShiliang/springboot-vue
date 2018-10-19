package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BaseManage;
import com.ssl.springbootvue.model.pojo.BaseManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseManageMapper {
    long countByExample(BaseManageExample example);

    int deleteByExample(BaseManageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseManage record);

    int insertSelective(BaseManage record);

    List<BaseManage> selectByExample(BaseManageExample example);

    BaseManage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseManage record, @Param("example") BaseManageExample example);

    int updateByExample(@Param("record") BaseManage record, @Param("example") BaseManageExample example);

    int updateByPrimaryKeySelective(BaseManage record);

    int updateByPrimaryKey(BaseManage record);
}