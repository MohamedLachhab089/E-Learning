package com.med.demo_sb.repositories;

import com.med.demo_sb.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
