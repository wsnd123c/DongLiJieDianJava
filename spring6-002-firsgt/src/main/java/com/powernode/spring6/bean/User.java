package com.powernode.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    // spring实现原理:返回机制,调用无参构造方法
   public User(){
       System.out.println("User111");
   }
}
