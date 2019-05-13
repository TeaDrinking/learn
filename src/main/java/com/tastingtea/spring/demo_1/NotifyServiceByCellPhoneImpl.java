/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.spring.demo_1;

/**
 *
 * @author TastingTea
 * @version $Id: NotifyServiceByCellPhoneImpl.java, v 0.1 2019年05月13日 下午4:07 TastingTea Exp $
 */
public class NotifyServiceByCellPhoneImpl implements NotifyService {
    @Override
    public void sendMsg(String msg) {
        System.out.println("发送手机短信:" + msg);
    }
}