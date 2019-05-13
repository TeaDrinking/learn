/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring自动装备,配置文件为resources目录下的beans_1.xml
 *  要启用@Autowired,配置文件中必须加上<context:annotation-config/>来注册注册“AutowiredAnnotationBeanPostProcessor'
 *  注解本身并不能够做任何事情，它们只是最基本的组成部分，我们需要能够处理这些注解的处理工具来处理这些注解
 *  http://www.cnblogs.com/leiOOlei/p/3713989.html
 *
 * @author TastingTea
 * @version $Id: SpringMain.java, v 0.1 2019年05月13日 下午4:21 TastingTea Exp $
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "beans_1.xml");
        Order order=ctx.getBean("order",Order.class);
        order.paySuccess();
    }
}