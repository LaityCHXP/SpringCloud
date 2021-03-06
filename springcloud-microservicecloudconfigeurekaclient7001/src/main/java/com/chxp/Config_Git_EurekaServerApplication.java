package com.chxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer Eureka Server 服务端启动类(接收其他微服务注册)
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}
