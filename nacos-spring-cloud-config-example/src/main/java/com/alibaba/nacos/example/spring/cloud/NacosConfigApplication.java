package com.alibaba.nacos.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Document: https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html
 */
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigApplication.class, args);
        /**
         * 入门
         */
//        String userName = applicationContext.getEnvironment().getProperty("user.name");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :" + userName + "; age: " + userAge);
        /**
         * 支持配置的动态更新
         */
//        while(true) {
//            //当动态配置刷新时，会更新到 Enviroment中，因此这里每隔3秒中从Enviroment中获取配置
//            String userName = applicationContext.getEnvironment().getProperty("user.name");
//            String userAge = applicationContext.getEnvironment().getProperty("user.age");
//            System.err.println("user name :" + userName + "; age: " + userAge);
//            TimeUnit.SECONDS.sleep(3);
//        }

        /**
         *可支持profile粒度的配置
         */
        while(true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            //获取当前部署的环境
            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
            System.err.println("in "+currentEnv+" enviroment; "+"user name :" + userName + "; age: " + userAge);
            TimeUnit.SECONDS.sleep(3);
        }
    }
}


