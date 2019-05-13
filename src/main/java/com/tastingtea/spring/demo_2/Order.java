/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author TastingTea
 * @version $Id: Order.java, v 0.1 2019年05月13日 下午4:08 TastingTea Exp $
 */
@Component
public class Order {

    @Autowired
    private NotifyService notifyService;

    public void paySuccess(){
        notifyService.sendMsg("mingyin完成了支付");
    }
}