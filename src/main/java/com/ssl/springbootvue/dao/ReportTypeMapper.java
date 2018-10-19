package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.ReportType;
import com.ssl.springbootvue.model.pojo.ReportTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportTypeMapper {
    long countByExample(ReportTypeExample example);

    int deleteByExample(ReportTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReportType record);

    int insertSelective(ReportType record);

    List<ReportType> selectByExample(ReportTypeExample example);

    ReportType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReportType record, @Param("example") ReportTypeExample example);

    int updateByExample(@Param("record") ReportType record, @Param("example") ReportTypeExample example);

    int updateByPrimaryKeySelective(ReportType record);

    int updateByPrimaryKey(ReportType record);
}