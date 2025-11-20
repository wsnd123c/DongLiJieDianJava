package com.powernode.spring6.dao;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Order {
    private  static final Logger logger = LogManager.getLogger(Order.class);
    private  int interrrr;
    public  void gennerate(){
        logger.info("订单正在生成");
    }
}
