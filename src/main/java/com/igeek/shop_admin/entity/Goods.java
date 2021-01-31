package com.igeek.shop_admin.entity;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/1/24 0024 15:37
 */
public class Goods {

    private Integer id;
    private String name;
    private Double price;
    private String image;
    private String gdesc;
    private Integer is_hot;
    private Integer cid;

    public Goods() {
    }

    public Goods(Integer id, String name, Double price, String image, String gdesc, Integer is_hot, Integer cid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.gdesc = gdesc;
        this.is_hot = is_hot;
        this.cid = cid;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取
     * @return gdesc
     */
    public String getGdesc() {
        return gdesc;
    }

    /**
     * 设置
     * @param gdesc
     */
    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    /**
     * 获取
     * @return is_hot
     */
    public Integer getIs_hot() {
        return is_hot;
    }

    /**
     * 设置
     * @param is_hot
     */
    public void setIs_hot(Integer is_hot) {
        this.is_hot = is_hot;
    }

    /**
     * 获取
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", price = " + price + ", image = " + image + ", gdesc = " + gdesc + ", is_hot = " + is_hot + ", cid = " + cid + "}";
    }
}
 
  