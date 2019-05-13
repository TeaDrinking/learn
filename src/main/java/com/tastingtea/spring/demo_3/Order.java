/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_3;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 *
 * @author TastingTea
 * @version $Id: Order.java, v 0.1 2019年05月13日 下午4:08 TastingTea Exp $
 */
@Component
public class Order {

    //@Resource(name = "notifyServiceByWeixinImpl")
    @Resource
    private NotifyService notifyService;

    public void paySuccess(){
        notifyService.sendMsg("mingyin完成了支付");
    }
}