package com.tooltime.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.tooltime.demo.controller.PurchaseController;
@ComponentScan("com.tooltime.demo")
@SpringBootApplication
//@EnableJpaRepositories
@EntityScan(basePackages="com.tooltime.demo.*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		PurchaseController pr = new PurchaseController();
		
	}

}
