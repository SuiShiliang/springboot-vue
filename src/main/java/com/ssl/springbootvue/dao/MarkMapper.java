package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.Mark;
import com.ssl.springbootvue.model.pojo.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkMapper {
    long countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(Mark record);

    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    Mark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByPrimaryKeySelective(Mark record);

    int updateByPrimaryKey(Mark record);
}