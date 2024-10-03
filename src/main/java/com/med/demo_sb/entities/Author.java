package com.med.demo_sb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "auth_id_gen")
    //@SequenceGenerator(name = "auth_seq", sequenceName = "auth_seq", allocationSize = 1)
    private Integer id;
    @Column(nullable = false, length = 10)
    private String fname;
    @Column(nullable = false, length = 10)
    private String lname;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    private int age;
    /*@Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private LocalDateTime updatedAt;*/

//    @ManyToMany
//    private List<Course> courses;
}
