package com.wanshan.tuanyuan.util;

public class PageBean {

    /*
    页码
     */
    private Integer page;

    /*
    行数
     */
    private Integer rows;
    /*
    排序的字段
     */

    private String sort;

    /*
    排序的顺序
     */
    private String order;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public PageBean(Integer page,Integer rows){
        this.page=page;
        this.rows=rows;
    }

    public PageBean() {
    }
}
