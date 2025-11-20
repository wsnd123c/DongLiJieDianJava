package com.powernode.spring6.service;

import com.powernode.spring6.dao.Order;

public class OrderService {
    private Order order;

    @Override
    public String toString() {
        return "OrderService{" +
                "order=" + order +
                ", od=" + od +
                ", str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getOd() {
        return od;
    }

    public void setOd(int od) {
        this.od = od;
    }

    private int od;

    private  String  str;
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    public  void init(){
        order.gennerate();
    }
}
