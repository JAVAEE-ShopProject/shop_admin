package com.igeek.shop_admin.dao;

import com.igeek.shop_admin.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:42
 */
public class GoodsDao extends BaseDao<Goods> {

    //1.从数据库中查询所有商品
    public List<Goods> selectAll() throws SQLException {
        String sql = "select * from goods";
        List<Goods> list = this.getBeanList(sql, Goods.class);
        return list;
    }

    //2.添加商品到数据库中
    public int addGoods(Goods goods) throws SQLException {
        String sql = "insert into goods values(null,?,?,?,?,?,?)";
        int i = this.update(sql, goods.getName(), goods.getPrice(), goods.getImage(), goods.getGdesc(), goods.getIs_hot(), goods.getCid());
        return i;
    }

    //3.删除指定编号的商品
    public int deleteGoods(int id) throws SQLException {
        String sql = "delete from goods where id=?";
        int i = this.update(sql, id);
        return i;
    }

    //4.更新商品
    public int updateGoods(Goods goods) throws SQLException {
        String sql = "update goods set name=?,price=?,image=?,gdesc=?,is_hot=?,cid=? where id=?";
        int i = this.update(sql, goods.getName(), goods.getPrice(), goods.getImage(), goods.getGdesc(), goods.getIs_hot(), goods.getCid(), goods.getId());
        return i;
    }

    //5.通过id查找单个商品
    public Goods getSingleValue(int id) throws SQLException {
        String sql = "select * from goods where id=?";
        Goods good = this.getBean(sql, Goods.class, id);
        return good;
    }

}
 
  