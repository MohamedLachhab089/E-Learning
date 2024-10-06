package com.med.demo_sb.entities.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
// This annotation indicates that the Address class is integrable in another entity.
// It will not have a separate table in the database, but its attributes will be stored
// in the same table as the entity in which it is used.
public class OrderId {
    private String username;
    private LocalDate orderDate;
}
