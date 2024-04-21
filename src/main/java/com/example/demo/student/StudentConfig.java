package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner clr(StudentRepository repository) {
        return args -> {
            Student praveen = new Student(
                    "Praveen",
                    "kolaypraveen@gmail.com",
                    LocalDate.of(1996, Month.OCTOBER, 11)
            );

            Student karn = new Student(
                    "karn",
                    "karn@gmail.com",
                    LocalDate.of(1998, Month.OCTOBER, 11)
            );

            repository.saveAll(
                    List.of(praveen, karn)
            );
        };
    }
}
