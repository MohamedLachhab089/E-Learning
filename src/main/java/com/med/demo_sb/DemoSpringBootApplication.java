package com.med.demo_sb;

import com.med.demo_sb.entities.Author;
import com.med.demo_sb.repositories.AuthorRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepo authorRepo) {
        return args -> {
            var author = Author.builder()
                    .fname("Mohamed")
                    .lname("LHB")
                    .email("medlhb@gmail.com")
                    .age(22)
                    .build();
            authorRepo.save(author);
        };
    }

}
