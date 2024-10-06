package com.med.demo_sb.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class Author extends BaseEntity {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    //@SequenceGenerator(name = "auth_seq", sequenceName = "auth_seq", allocationSize = 1)
    //private Integer id;
    @Column(nullable = false, length = 10)
    private String fname;
    @Column(nullable = false, length = 10)
    private String lname;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    private int age;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
