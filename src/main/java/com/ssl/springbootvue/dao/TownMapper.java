package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.Town;
import com.ssl.springbootvue.model.pojo.TownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TownMapper {
    long countByExample(TownExample example);

    int deleteByExample(TownExample example);

    int deleteByPrimaryKey(String id);

    int insert(Town record);

    int insertSelective(Town record);

    List<Town> selectByExample(TownExample example);

    Town selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Town record, @Param("example") TownExample example);

    int updateByExample(@Param("record") Town record, @Param("example") TownExample example);

    int updateByPrimaryKeySelective(Town record);

    int updateByPrimaryKey(Town record);
}