package com.igeek.shop_admin.entity;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/24 0024 15:36
 */
public class Admin {

    private String id;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Admin{id = " + id + ", username = " + username + ", password = " + password + "}";
    }
}
 
  