package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.BookPrice;
import com.ssl.springbootvue.model.pojo.BookPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPriceMapper {
    long countByExample(BookPriceExample example);

    int deleteByExample(BookPriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(BookPrice record);

    int insertSelective(BookPrice record);

    List<BookPrice> selectByExample(BookPriceExample example);

    BookPrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BookPrice record, @Param("example") BookPriceExample example);

    int updateByExample(@Param("record") BookPrice record, @Param("example") BookPriceExample example);

    int updateByPrimaryKeySelective(BookPrice record);

    int updateByPrimaryKey(BookPrice record);
}