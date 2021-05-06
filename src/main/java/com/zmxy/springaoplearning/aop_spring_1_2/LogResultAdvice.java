package com.zmxy.springaoplearning.aop_spring_1_2;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author will
 * @date 2020/11/20
 */
public class LogResultAdvice  implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法返回: " + returnValue);
    }
}
