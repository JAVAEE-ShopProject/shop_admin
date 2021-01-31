package com.igeek.shop_admin.dao;

import com.igeek.shop_admin.entity.Admin;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/24 0024 16:24
 */
public class AdminDao extends BaseDao<Admin> {

    //查询单个对象
    public Admin selectOneAdmin(String username,String password) throws SQLException {
        String sql = "select * from admin where username=? and password=?";
        Admin admin = this.getBean(sql, Admin.class, username, password);
        return admin;
    }

}
 
  