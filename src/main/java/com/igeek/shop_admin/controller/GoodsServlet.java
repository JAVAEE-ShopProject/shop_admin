package com.igeek.shop_admin.controller;

import com.igeek.shop_admin.entity.Category;
import com.igeek.shop_admin.entity.Goods;
import com.igeek.shop_admin.service.CategoryService;
import com.igeek.shop_admin.service.GoodsService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:49
 */
@WebServlet(name = "GoodsServlet",urlPatterns = "/goods")
public class GoodsServlet extends BasicServlet{

    private GoodsService goodsService = new GoodsService();
    private CategoryService categoryService = new CategoryService();

    //添加商品
    public void addGoods(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Goods goods = new Goods();
        try {
            BeanUtils.populate(goods,map);
            goods.setImage("goods_11.png");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        boolean flag = goodsService.addGoods(goods);
        if (flag){
            //添加商品成功
            request.getRequestDispatcher("admin/admin_index.jsp").forward(request,response);
        }else {
            //添加商品失败
            request.setAttribute("msg","添加商品失败!");
            request.getRequestDispatcher("admin/add.jsp").forward(request,response);
        }
    }

    //添加商品ui
    public void addGoodsUi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> allCategory = categoryService.viewAllCategory();
        request.setAttribute("allCategory",allCategory);
        request.getRequestDispatcher("admin/add.jsp").forward(request,response);
    }

    //编辑商品
    public void editGoods(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Goods goods = new Goods();
        try {
            BeanUtils.populate(goods,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        goods.setImage("admin/images/pimages/goods_10.png");
        boolean flag = goodsService.updateGoods(goods);

        if (flag){
            //更新商品成功
            request.getRequestDispatcher("admin/admin_index.jsp").forward(request,response);
        }else {
            //更新商品失败
            request.setAttribute("msg","更新商品失败!");
            request.getRequestDispatcher("admin/edit.jsp").forward(request,response);
        }
    }

    //删除商品
    public void deleteGoods(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id!=null){
            boolean flag = goodsService.deleteGoods(Integer.parseInt(id));

            if (flag){
                //删除商品成功
                request.getRequestDispatcher("admin/admin_index.jsp").forward(request,response);
            }else {
                //删除商品失败  跳转到
                request.setAttribute("msg","删除商品失败");
                request.getRequestDispatcher("admin/edit.jsp").forward(request,response);
            }
        }
    }

    //获取商品列表
    public void getGoodsList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Goods> list = goodsService.viewGoodsList();

        if (list!=null){
            request.setAttribute("list",list);
            request.getRequestDispatcher("admin/admin_index.jsp").forward(request,response);
        }
    }
}
 
  