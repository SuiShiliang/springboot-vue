package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.ChapterPrice;
import com.ssl.springbootvue.model.pojo.ChapterPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterPriceMapper {
    long countByExample(ChapterPriceExample example);

    int deleteByExample(ChapterPriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChapterPrice record);

    int insertSelective(ChapterPrice record);

    List<ChapterPrice> selectByExample(ChapterPriceExample example);

    ChapterPrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChapterPrice record, @Param("example") ChapterPriceExample example);

    int updateByExample(@Param("record") ChapterPrice record, @Param("example") ChapterPriceExample example);

    int updateByPrimaryKeySelective(ChapterPrice record);

    int updateByPrimaryKey(ChapterPrice record);
}