package com.zmxy.springaoplearning.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author will
 * @date 2020/11/21
 */
@Aspect
public class LogResultAspect {

    @AfterReturning(pointcut = "com.zmxy.springaoplearning.aop_spring_2_aspectj.SystemArchitecture.businessService()",
                    returning = "result")
    public void logResult(Object result) {
        System.out.println("[@AspectJ]方法执行后 " + result);
    }
}
