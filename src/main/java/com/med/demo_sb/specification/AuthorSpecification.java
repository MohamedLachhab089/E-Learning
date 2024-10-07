package com.med.demo_sb.specification;

import com.med.demo_sb.entities.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {
    public static Specification<Author> hasFirstName(String fname) {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (fname == null) {
                return builder.conjunction(); // Returns a "true" condition if the criterion is not defined
            }
            return builder.equal(root.get("fname"), fname);
        };
    }

    public static Specification<Author> hasLastName(String lname) {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (lname == null) {
                return builder.conjunction();
            }
            return builder.equal(root.get("lname"), lname);
        };
    }

    public static Specification<Author> hasAge(int age) {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            return builder.equal(root.get("age"), age);
        };
    }
}
