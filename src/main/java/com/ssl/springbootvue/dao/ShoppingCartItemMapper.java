package com.ssl.springbootvue.dao;

import com.ssl.springbootvue.model.pojo.ShoppingCartItem;
import com.ssl.springbootvue.model.pojo.ShoppingCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartItemMapper {
    long countByExample(ShoppingCartItemExample example);

    int deleteByExample(ShoppingCartItemExample example);

    int insert(ShoppingCartItem record);

    int insertSelective(ShoppingCartItem record);

    List<ShoppingCartItem> selectByExample(ShoppingCartItemExample example);

    int updateByExampleSelective(@Param("record") ShoppingCartItem record, @Param("example") ShoppingCartItemExample example);

    int updateByExample(@Param("record") ShoppingCartItem record, @Param("example") ShoppingCartItemExample example);
}