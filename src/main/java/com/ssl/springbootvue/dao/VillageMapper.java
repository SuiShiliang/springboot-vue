package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.Village;
import com.ssl.springbootvue.model.pojo.VillageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageMapper {
    long countByExample(VillageExample example);

    int deleteByExample(VillageExample example);

    int deleteByPrimaryKey(String id);

    int insert(Village record);

    int insertSelective(Village record);

    List<Village> selectByExample(VillageExample example);

    Village selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByExample(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKey(Village record);
}