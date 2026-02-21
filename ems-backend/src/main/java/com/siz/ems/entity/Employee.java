package com.siz.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // a no argument constructor
@AllArgsConstructor // add all argument constructor
@Entity // specify a class as a JP entity
@Table(name = "employees") // specify the table details
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment the primary key
    private Long id;

    @Column(name = "first_name") // specify the column's name
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
