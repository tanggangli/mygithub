package cn.itcast.test;

import cn.itcast.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
    @Test
    public void Test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        BookServiceImpl bs = ac.getBean("bookServiceImpl", BookServiceImpl.class);
        bs.findByBook();
    }
}
