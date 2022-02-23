package com.javaweb.cursoSpring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student maria = new Student(
                    "Maria", "maria@gmail.com", LocalDate.of(2000, APRIL, 5));

            Student ramon = new Student(
                    "Ramon", "ramon@gmail.com", LocalDate.of(1992, MAY, 13));

            repository.saveAll(List.of(maria, ramon));
        };
    }
}
