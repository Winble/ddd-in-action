package com.winble.tutorial.presentation;

import com.winble.tutorial.presentation.service.TestServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create on 2020/7/10
 *
 * @author bowenzhang
 */
public class TestConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/consumer.xml"});
        context.start();
        TestService demoService = new TestServiceImpl();
        String hello = demoService.test("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果

    }
}
