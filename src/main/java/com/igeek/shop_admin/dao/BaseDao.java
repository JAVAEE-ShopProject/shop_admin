package com.igeek.shop_admin.dao;

import com.igeek.shop_admin.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.poi.ss.formula.functions.T;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/24 0024 16:18
 */
public class BaseDao<T> {

    private QueryRunner runner = new QueryRunner();

    //增删改
    public int update(String sql,Object...params) throws SQLException {
        int i = runner.update(DataSourceUtils.getConnection(), sql, params);
        return i;
    }

    //查询单个对象
    public T getBean(String sql,Class<T> clazz,Object...params) throws SQLException {
        T t = runner.query(DataSourceUtils.getConnection(), sql, new BeanHandler<>(clazz), params);
        return t;
    }

    //查询多个对象
    public List<T> getBeanList(String sql,Class<T> clazz,Object...params) throws SQLException {
        List<T> list = runner.query(DataSourceUtils.getConnection(), sql, new BeanListHandler<>(clazz), params);
        return list;
    }

    //查询单个值
    public Object getSingleValue(String sql,Object...params) throws SQLException {
        Object o = runner.query(DataSourceUtils.getConnection(), sql, new ScalarHandler<>(), params);
        return o;
    }

}
 
  