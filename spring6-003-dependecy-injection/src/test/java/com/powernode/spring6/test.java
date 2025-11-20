package com.powernode.spring6;
import com.powernode.spring6.dao.YuQian;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test000(){
        ApplicationContext context=new ClassPathXmlApplicationContext("springAutoWire.xml");
        OrderService bean = context.getBean(OrderService.class);
        bean.init();
//        System.out.println(bean);
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        OrderService orderService = context.getBean("orderBeanService", OrderService.class);
    }
    @Test
    public   void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        OrderService orderService = context.getBean("orderBeanService", OrderService.class);
        System.out.println(orderService);
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = context.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }
}
