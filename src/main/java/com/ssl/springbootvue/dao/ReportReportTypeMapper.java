package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.ReportReportType;
import com.ssl.springbootvue.model.pojo.ReportReportTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportReportTypeMapper {
    long countByExample(ReportReportTypeExample example);

    int deleteByExample(ReportReportTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReportReportType record);

    int insertSelective(ReportReportType record);

    List<ReportReportType> selectByExample(ReportReportTypeExample example);

    ReportReportType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReportReportType record, @Param("example") ReportReportTypeExample example);

    int updateByExample(@Param("record") ReportReportType record, @Param("example") ReportReportTypeExample example);

    int updateByPrimaryKeySelective(ReportReportType record);

    int updateByPrimaryKey(ReportReportType record);
}