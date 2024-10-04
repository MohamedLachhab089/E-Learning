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
public class Section extends BaseEntity {
    private String name;
    @Column(name = "`order`")
    private String order;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToMany
    private List<Lecture> lectures;
}
