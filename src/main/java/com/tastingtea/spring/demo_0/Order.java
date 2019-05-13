/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_0;

/**
 *
 * @author TastingTea
 * @version $Id: Order.java, v 0.1 2019年05月13日 下午4:08 TastingTea Exp $
 */
public class Order {
    private NotifyService notifyService;

    /**
     * Setter method for property <tt>notifyService</tt>.
     *
     * @param notifyService value to be assigned to property notifyService
     */
    public void setNotifyService(NotifyService notifyService) {
        this.notifyService = notifyService;
    }

    public void paySuccess(){
        notifyService.sendMsg("mingyin完成了支付");
    }
}