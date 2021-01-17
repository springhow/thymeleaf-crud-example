package com.springhow.examples.springboot.thymeleaf.crud;

import com.springhow.examples.springboot.thymeleaf.crud.domain.entities.Role;
import com.springhow.examples.springboot.thymeleaf.crud.domain.entities.UserInfo;
import com.springhow.examples.springboot.thymeleaf.crud.domain.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafCrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafCrudExampleApplication.class, args);
    }
}
