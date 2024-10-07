package com.med.demo_sb;

import com.med.demo_sb.entities.Author;
import com.med.demo_sb.entities.Video;
import com.med.demo_sb.repositories.AuthorRepo;
import com.med.demo_sb.repositories.VideoRepo;
import com.med.demo_sb.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootApplication
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepo authorRepo, VideoRepo videoRepo) {
        return args -> {
            /*var author = Author.builder()
                    .id(1)
                    .fname("Mohamed")
                    .lname("LHB")
                    .email("medlhb@gmail.com")
                    .age(22)
                    .build();
            authorRepo.save(author);*/
            /*var video = Video.builder()
                    .name("abc")
                    .length(12)
                    .build();
            videoRepo.save(video);*/

            // update an author age:
            authorRepo.updateAuthorAge(1, 23);


            // the annotation @NamedQuery
            // it's useful but not practical


            Specification<Author> spec = Specification
                    .where(AuthorSpecification.hasAge(20))
                    .and(AuthorSpecification.hasFirstName("Mohamed"));

            authorRepo.findAll(spec).forEach(System.out::println);

        };
    }

}
