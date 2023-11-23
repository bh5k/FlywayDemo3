package com.barclay.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "person_seq")
    @SequenceGenerator(
            name = "person_seq",
            sequenceName = "person_seq",
            initialValue = 1,
            allocationSize = 1
    )
    Long id;

    @OneToMany(mappedBy = "person")
    private List<Post> posts;
}
