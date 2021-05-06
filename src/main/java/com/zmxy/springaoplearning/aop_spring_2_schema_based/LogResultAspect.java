package com.zmxy.springaoplearning.aop_spring_2_schema_based;

/**
 * @author will
 * @date 2020/11/22
 */
public class LogResultAspect {

    public void logResult(Object result) {
        System.out.println("[schema-based]返回值: " + result);
    }
}
