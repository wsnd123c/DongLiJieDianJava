package com.powernode.spring6.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vip {
    private String username;
    private  static  final Logger logger = LogManager.getLogger(Vip.class);
    public void insert(){
        logger.info("Vip init");
    }
    public  void update() {
        logger.info("Vip update");
    }
}
