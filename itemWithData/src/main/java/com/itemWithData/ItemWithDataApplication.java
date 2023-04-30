package com.itemWithData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

<<<<<<< HEAD
@SpringBootApplication(scanBasePackages = {"com.itemWithData"})
=======
@SpringBootApplication
//(scanBasePackages = "com.itemWithData.Item.ItemRepository")
//@EnableJpaRepositories
>>>>>>> a8d8ffbd7c71705f4d47485c740abb45f6d163b4
public class ItemWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemWithDataApplication.class, args);
	}

}
