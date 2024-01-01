package com.lsz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName BootStrapApplication
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午7:41
 * @Version 1.0.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.lsz.persistence")
public class BootStrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootStrapApplication.class, args);
    }
}
