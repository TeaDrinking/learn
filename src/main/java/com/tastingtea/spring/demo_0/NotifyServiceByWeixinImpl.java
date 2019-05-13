/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_0;

/**
 *
 * @author TastingTea
 * @version $Id: NotifyServiceByWeixinImpl.java, v 0.1 2019年05月13日 下午4:07 TastingTea Exp $
 */
public class NotifyServiceByWeixinImpl implements NotifyService {
    @Override
    public void sendMsg(String msg) {
        System.out.println("发送微信短信:" + msg);
    }

    public void initBean() {
        System.out.println("Init Bean for : NotifyServiceByWeixinImpl");
    }

    public void destroyBean() {
        System.out.println("Destory Bean for : NotifyServiceByWeixinImpl");
    }
}