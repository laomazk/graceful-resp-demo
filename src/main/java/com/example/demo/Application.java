package com.example.demo;

import com.feiniaojin.gracefulresponse.EnableGracefulResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGracefulResponse
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
