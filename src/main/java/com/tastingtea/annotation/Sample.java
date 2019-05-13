/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.annotation;

/**
 *
 * @author TastingTea
 * @version $Id: Sample.java, v 0.1 2019年05月13日 上午11:09 TastingTea Exp $
 */
public class Sample {

    @Test
    public static void m1() {

    }

    @Test
    public static void m2() {
        throw new RuntimeException("Crash");
    }

    public static void m3() {

    }

    @Test
    public void m4() {

    }

    @Test
    private void m5() {

    }

    @Test
    public static void m6(String a) {

    }

    @ExceptionTest(ArithmeticException.class)
    public static void m10() {
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m11() {
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m12() {
    }
}