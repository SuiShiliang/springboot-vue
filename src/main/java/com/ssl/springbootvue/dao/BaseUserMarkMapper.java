package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BaseUserMark;
import com.ssl.springbootvue.model.pojo.BaseUserMarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUserMarkMapper {
    long countByExample(BaseUserMarkExample example);

    int deleteByExample(BaseUserMarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseUserMark record);

    int insertSelective(BaseUserMark record);

    List<BaseUserMark> selectByExample(BaseUserMarkExample example);

    BaseUserMark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseUserMark record, @Param("example") BaseUserMarkExample example);

    int updateByExample(@Param("record") BaseUserMark record, @Param("example") BaseUserMarkExample example);

    int updateByPrimaryKeySelective(BaseUserMark record);

    int updateByPrimaryKey(BaseUserMark record);
}