package com.vaccine;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
@EnableCaching // 开发缓存注解功能
public class VaccineApplication {
    public static void main(String[] args) {
        SpringApplication.run(VaccineApplication.class, args);
        log.info("server started");
    }
}
