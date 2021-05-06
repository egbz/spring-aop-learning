package com.zmxy.springaoplearning;

import com.zmxy.springaoplearning.entity.User;
import com.zmxy.springaoplearning.service.OrderService;
import com.zmxy.springaoplearning.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author will
 * @date 2020/11/20
 */
public class Application {
    public static void main(String[] args) {
        test_spring_1_2_advice();
//        test_spring_1_2_advisor();
//        test_spring_1_2_BeanNameAutoProxy();
//        test_spring_1_2_DefaultAdvisorAutoProxy();
//        test_spring_2_0_AspectJ();
//        test_spring_2_0_Schema_Based();

    }

    public static void test_spring_1_2_advice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advice.xml");

        UserService userService = (UserService) context.getBean("userServiceProxy");
        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }

    public static void test_spring_1_2_advisor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advisor.xml");

        UserService userService = (UserService) context.getBean("userServiceProxy");
        userService.createUser("Violet", "Evergarden", 14);
        userService.queryUser();
    }

    public static void test_spring_1_2_BeanNameAutoProxy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_BeanNameAutoProxy.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Violet", "Evergarden", 14);
        userService.queryUser();

        orderService.createOrder("leo", "随便做点什么");
        orderService.queryOrder("Leo");
    }

    public static void test_spring_1_2_DefaultAdvisorAutoProxy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_DefaultAdvisorAutoProxy.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Violet", "Evergarden", 14);
        userService.queryUser();

        orderService.createOrder("leo", "随便做点什么");
        orderService.queryOrder("Leo");
    }

    public static void test_spring_2_0_AspectJ () {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_2_0_AspectJ.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Violet", "Evergarden", 14);
        userService.queryUser();
        orderService.createOrder("leo", "随便做点什么");
        orderService.queryOrder("Leo");
    }

    public static void test_spring_2_0_Schema_Based() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_2_0_SchemaBased.xml");
        UserService userService = context.getBean(UserService.class);
        userService.createUser("Violet", "Evergarden", 14);
    }

}
