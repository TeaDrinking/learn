/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring注解方式完成bean的定义和装配,配置文件为resources目录下的beans_2.xml
 *  xml文件中必须使用<context:component-scan base-package="com.tastingtea.spring.demo_2"/>
 *  <context:annotation-config />仅能够在已经在已经注册过的bean上面起作用,对于没有在spring容器中注册的bean,它并不能执行任何操作
 *  <context:component-scan>除了具有<context:annotation-config />的功能之外，还具有自动将带有@component,@service,@Repository等注解的对象注册到spring容器中的功能
 *  http://www.cnblogs.com/leiOOlei/p/3713989.html
 *
 *  Autowired注解放在属性上,会自动创建setter方法
 *
 * @author TastingTea
 * @version $Id: SpringMain.java, v 0.1 2019年05月13日 下午4:21 TastingTea Exp $
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "beans_2.xml");
        Order order=ctx.getBean("order",Order.class);
        order.paySuccess();
    }
}