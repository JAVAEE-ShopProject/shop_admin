package com.igeek.shop_admin.service;

import com.igeek.shop_admin.dao.CategoryDao;
import com.igeek.shop_admin.entity.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:50
 */
public class CategoryService {

    CategoryDao dao = new CategoryDao();

    //查询到所有的商品列表
    public List<Category> viewAllCategory(){
        List<Category> categories = null;
        try {
            categories = dao.selectAllCategory();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

}
 
  