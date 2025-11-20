package com.powernode.spring.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dao.UserDaoImplMysql;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    //创建日志记录器对象

    @Test
    public  void testX(){
        Logger logger = LogManager.getLogger(FirstSpringTest.class);
        logger.info("我是一条信息");
        logger.debug("我是挑食信息");
    }
    @Test
    public void testFirstSpringTest(){
        //Spring容器
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml","bean.xml");
    Object user = context.getBean("userBean");
    Object object  =context.getBean("vipBean");
        Object nowTime =context.getBean("nowTime");
        System.out.println(nowTime);
        UserDaoImplMysql userDaoBean = context.getBean("userDaoBean", UserDaoImplMysql.class);
        System.out.println(userDaoBean);
        userDaoBean.Insert();

    }


}
