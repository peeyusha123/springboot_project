package com.shelake.piyusha.student.configuration;

import com.shelake.piyusha.student.entity.Student;
import com.shelake.piyusha.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student piyusha1 = new Student(
                    "piyusha",
                    "piysha1@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 13)

            );
            Student piyusha2 = new Student(
                    "piyusha1",
                    "piyusha2@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 21)
            );
            Student piyusha3 = new Student(
                    "Piyusha3",
                    "piyusha3@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 13)
            );

            repository.saveAll(List.of(piyusha1,piyusha2,piyusha3));
        };
    }
}
