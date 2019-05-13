/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring最基本的使用，xml方式完成注入，配置文件在resources目录下的beans_0.xml
 *  初步测试BeanPostProcessor的功能
 *
 * @author TastingTea
 * @version $Id: SpringMain.java, v 0.1 2019年05月13日 下午4:21 TastingTea Exp $
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "beans_0.xml");
        Order order=ctx.getBean("order",Order.class);
        order.paySuccess();
    }
}