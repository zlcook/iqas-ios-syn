package com.zlcook.iqas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class IqasIosSynApplication {

	public static void main(String[] args) {
		SpringApplication.run(IqasIosSynApplication.class, args);
	}
}
