package com.igeek.shop_admin.controller;

import com.google.gson.Gson;
import com.igeek.shop_admin.entity.Category;
import com.igeek.shop_admin.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:51
 */
@WebServlet(name="CategoryServlet",urlPatterns = "/category")
public class CategoryServlet extends BasicServlet{

    CategoryService categoryService = new CategoryService();

    //查看所有商品分类
    public void viewAllCategoryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> allCategoryList = categoryService.viewAllCategory();

        Gson gson = new Gson();
        String json = gson.toJson(allCategoryList);

        response.getWriter().write(json);
    }

}
 
  