package com.med.demo_sb.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@DiscriminatorColumn(name = "resource_type")
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String size;
    private String url;
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
