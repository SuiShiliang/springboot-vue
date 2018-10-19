package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.Provence;
import com.ssl.springbootvue.model.pojo.ProvenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvenceMapper {
    long countByExample(ProvenceExample example);

    int deleteByExample(ProvenceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Provence record);

    int insertSelective(Provence record);

    List<Provence> selectByExample(ProvenceExample example);

    Provence selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Provence record, @Param("example") ProvenceExample example);

    int updateByExample(@Param("record") Provence record, @Param("example") ProvenceExample example);

    int updateByPrimaryKeySelective(Provence record);

    int updateByPrimaryKey(Provence record);
}