package com.zmxy.springaoplearning.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author will
 * @date 2020/11/21
 */
@Aspect
public class SystemArchitecture {

    // web 层
//    @Pointcut("within(com.zmxy.springaoplearning.web..*)")
//    public void inWebLayer() {}

    // service 层
    @Pointcut("within(com.zmxy.springaoplearning.service..*)")
    public void inServiceLayer() {}

    // dao 层
//    @Pointcut("within(com.zmxy.springaoplearning.dao..*)")
//    public void inDataAccessLayer() {}

    // service实现, 注意这里指的是方法实现, 其实通常也可以用 bean(*ServiceImpl)
    @Pointcut("execution(* com.zmxy.springaoplearning.service.*.*(..))")
    public void businessService() {}

    // dao 实现
//    @Pointcut("execution(* com.zmxy.springaoplearning.dao.*.*(..))")
//    public void dataAccessOperation(){}
}
