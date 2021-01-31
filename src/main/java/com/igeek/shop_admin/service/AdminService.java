package com.igeek.shop_admin.service;

import com.igeek.shop_admin.dao.AdminDao;
import com.igeek.shop_admin.entity.Admin;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/24 0024 16:31
 */
public class AdminService {

    AdminDao dao = new AdminDao();

    //登录
    public Admin loginAdmin(String username,String password){
        try {
            return dao.selectOneAdmin(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
 
  