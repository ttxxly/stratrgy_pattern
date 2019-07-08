package com.hxhnzmb.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述:
 * 公司信息: 星辰科技有限公司 研发部
 * 作者QQ：1952500855
 *
 * @author hxhxnzmb
 * @version v1.0
 * @date 2019/7/8 11:28
 */
@SpringBootApplication
@MapperScan("com.hxhnzmb.example.mapper")
public class AppSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(AppSpringBoot.class, args);
    }
}
