package com.igeek.shop_admin.vo;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/29 0029 19:59
 */
public class PageVO<T> {
    //查询条件
    private String query;
    //当前页
    private Integer pageNow;
    //总页数
    private Integer myPage;
    //数据
    private List<T> list;

    public PageVO() {
    }

    public PageVO(String query, Integer pageNow, Integer myPage, List<T> list) {
        this.query = query;
        this.pageNow = pageNow;
        this.myPage = myPage;
        this.list = list;
    }

    /**
     * 获取
     * @return query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 设置
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 获取
     * @return pageNow
     */
    public Integer getPageNow() {
        return pageNow;
    }

    /**
     * 设置
     * @param pageNow
     */
    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    /**
     * 获取
     * @return myPage
     */
    public Integer getMyPage() {
        return myPage;
    }

    /**
     * 设置
     * @param myPage
     */
    public void setMyPage(Integer myPage) {
        this.myPage = myPage;
    }

    /**
     * 获取
     * @return list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * 设置
     * @param list
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    public String toString() {
        return "PageVO{query = " + query + ", pageNow = " + pageNow + ", myPage = " + myPage + ", list = " + list + "}";
    }
}
 
  