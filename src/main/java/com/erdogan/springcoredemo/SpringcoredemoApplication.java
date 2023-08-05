package com.erdogan.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		scanBasePackages = {"com.erdogan.springcoredemo",
							"com.erdogan.util"})

*/
@SpringBootApplication
public class SpringcoredemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
