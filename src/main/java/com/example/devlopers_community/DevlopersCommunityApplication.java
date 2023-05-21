package com.example.devlopers_community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class DevlopersCommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevlopersCommunityApplication.class, args);
	}

}
