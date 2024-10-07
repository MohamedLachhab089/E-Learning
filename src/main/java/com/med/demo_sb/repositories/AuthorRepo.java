package com.med.demo_sb.repositories;

import com.med.demo_sb.entities.Author;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthorAge(@Param("id") int id, @Param("age") int age);

    List<Author> findByFnameIgnoreCase(String firstName);

    List<Author> findByLnameIgnoreCase(String lastName);

    Author findByEmail(String email);

    int countAllByAge(int age);

    List<Author> findByFnameContainingIgnoreCase(String firstName);

    List<Author> findByFnameStartsWithIgnoreCase(String firstName);

    List<Author> findByFnameEndsWithIgnoreCase(String firstName);

    List<Author> findByFnameInIgnoreCase(List<String> fNames);


}
