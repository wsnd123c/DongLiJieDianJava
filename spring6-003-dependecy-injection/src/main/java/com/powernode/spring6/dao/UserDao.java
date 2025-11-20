package com.powernode.spring6.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserDao {

    private  static  final Logger logger = LogManager.getLogger(UserDao.class);

    public void insert(){
        logger.info("12");
    }
}
