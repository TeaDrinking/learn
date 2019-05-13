/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tastingtea.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  自定义annotation的demo,mini版的单元测试框架
 *
 * @author TastingTea
 * @version $Id: RunTests.java, v 0.1 2019年05月13日 上午11:15 TastingTea Exp $
 */
public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class) || m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    if (m.isAnnotationPresent(ExceptionTest.class)) {
                        Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                        if (excType.isInstance(exc)) {
                            passed++;
                        } else {
                            System.out.printf("Test %s failed: excepted %s, got %s%n", m, excType.getName(), exc);
                        }
                    } else {
                        System.out.println(m + " failed: " + exc);
                    }
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m + "; exc:" + exc);
                }

            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);

    }
}