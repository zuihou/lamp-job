package com.xxl.job.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.xxl.job.admin.dao"})
public class XxlJobAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
    }

}