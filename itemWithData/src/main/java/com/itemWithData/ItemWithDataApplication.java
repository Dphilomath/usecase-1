package com.itemWithData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.itemWithData"})
public class ItemWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemWithDataApplication.class, args);
	}

}
