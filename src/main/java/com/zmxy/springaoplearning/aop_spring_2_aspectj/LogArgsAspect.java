package com.zmxy.springaoplearning.aop_spring_2_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * @author will
 * @date 2020/11/21
 */
@Aspect
public class LogArgsAspect {

    // 这里可以设置一些自己想要的属性, 到时候在配置时候注入进来

    @Before("com.zmxy.springaoplearning.aop_spring_2_aspectj.SystemArchitecture.businessService()")
    public void logArgs(JoinPoint joinPoint) {
        System.out.println("[@AspectJ]方法执行前 打印入参: " + Arrays.toString(joinPoint.getArgs()));
    }
}
