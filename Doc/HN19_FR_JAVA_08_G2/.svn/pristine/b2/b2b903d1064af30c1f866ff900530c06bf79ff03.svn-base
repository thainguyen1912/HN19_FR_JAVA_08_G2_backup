package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fa.training.model.User;
import fa.training.repository.UserRepository;

@SpringBootApplication
@ComponentScan(value= "fa.training.*")
@EnableJpaRepositories(basePackages="fa.training.repository")
@EntityScan("fa.training.model")
public class CandidateManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CandidateManagementApplication.class, args);
		UserRepository bean = run.getBean(UserRepository.class);
		System.out.println(bean.save(new User("name", "password", "fullName")));
	}

}
