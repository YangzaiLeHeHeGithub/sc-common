package com.yz.git.sc.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xy
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.yz.git.sc.common.redis","com.yz.git.sc.common.*"})
public class ScCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScCommonApplication.class, args);
    }

}
