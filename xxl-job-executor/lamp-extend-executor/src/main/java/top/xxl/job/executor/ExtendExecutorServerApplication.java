package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import static top.tangyh.lamp.common.constant.BizConstant.BUSINESS_PACKAGE;
import static top.tangyh.lamp.common.constant.BizConstant.UTIL_PACKAGE;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
@ComponentScan({
		UTIL_PACKAGE, BUSINESS_PACKAGE, "com.xxl.job.executor"
})
@EnableFeignClients({
		BUSINESS_PACKAGE
})
public class ExtendExecutorServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(ExtendExecutorServerApplication.class, args);
	}

}
