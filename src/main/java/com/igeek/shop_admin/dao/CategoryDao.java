package com.igeek.shop_admin.dao;

import com.igeek.shop_admin.entity.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:50
 */
public class CategoryDao extends BaseDao<Category> {

    //查询所有的商品类别
    public List<Category> selectAllCategory() throws SQLException {
        String sql = "select * from category";
        List<Category> list = this.getBeanList(sql, Category.class);
        return list;
    }

}
 
  