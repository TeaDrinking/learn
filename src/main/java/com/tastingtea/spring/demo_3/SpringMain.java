/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Resource，默认安装名称进行装配，名称可以通过name属性进行指定
 *  如果没有指定name属性，当注解写在字段上时，默认取字段名进行安装名称查找
 *  如果注解写在setter方法上默认取属性名进行装配
 *  当找不到与名称匹配的bean时才按照类型进行装配
 *  但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
 *
 *  Autowired默认按类型装配
 *
 *  https://www.cnblogs.com/leiOOlei/p/3713779.html
 *
 * @author TastingTea
 * @version $Id: SpringMain.java, v 0.1 2019年05月13日 下午4:21 TastingTea Exp $
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "beans_3.xml");
        Order order=ctx.getBean("order",Order.class);
        order.paySuccess();
    }
}