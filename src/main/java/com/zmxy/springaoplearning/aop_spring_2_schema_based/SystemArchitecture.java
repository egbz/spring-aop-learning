package com.zmxy.springaoplearning.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author will
 * @date 2020/11/22
 */
public class SystemArchitecture {

    @Pointcut("within(com.zmxy.springaoplearning.service..*)")
    public void inServiceLayer() {}

    @Pointcut("execution(* com.zmxy.springaoplearning.service.*.*(..))")
    public void businessService() {}
}
