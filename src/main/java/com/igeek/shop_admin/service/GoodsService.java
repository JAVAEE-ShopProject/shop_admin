package com.igeek.shop_admin.service;

import com.igeek.shop_admin.dao.GoodsDao;
import com.igeek.shop_admin.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:48
 */
public class GoodsService {

    GoodsDao dao = new GoodsDao();

    //查看商品列表
    public List<Goods> viewGoodsList(){
        List<Goods> goods = null;
        try {
            goods = dao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goods;
    }

    //通过id查找单个商品
    public Goods viewSingleGood(int id){
        Goods good = null;
        try {
            good = dao.getSingleValue(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return good;
    }

    //添加商品
    public boolean addGoods(Goods goods){
        int i = 0;
        try {
            i = dao.addGoods(goods);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i>0?true:false;
    }

    //通过id删除商品
    public boolean deleteGoods(int id){
        int i = 0;
        try {
            i = dao.deleteGoods(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i>0?true:false;
    }

    //更新商品
    public boolean updateGoods(Goods goods){
        int i = 0;
        try {
            i = dao.updateGoods(goods);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i>0?true:false;
    }


}
 
  