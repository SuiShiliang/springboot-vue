package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.PublicContact;
import com.ssl.springbootvue.model.pojo.PublicContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicContactMapper {
    long countByExample(PublicContactExample example);

    int deleteByExample(PublicContactExample example);

    int deleteByPrimaryKey(String id);

    int insert(PublicContact record);

    int insertSelective(PublicContact record);

    List<PublicContact> selectByExample(PublicContactExample example);

    PublicContact selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublicContact record, @Param("example") PublicContactExample example);

    int updateByExample(@Param("record") PublicContact record, @Param("example") PublicContactExample example);

    int updateByPrimaryKeySelective(PublicContact record);

    int updateByPrimaryKey(PublicContact record);
}