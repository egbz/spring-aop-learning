package com.zmxy.springaoplearning.aop_spring_2_schema_based;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author will
 * @date 2020/11/22
 */
public class LogArgsAspect {

    public void logArgs(JoinPoint joinPoint) {
        System.out.println("[schema-based]方法执行前 打印入参" + Arrays.toString(joinPoint.getArgs()));
    }
}
