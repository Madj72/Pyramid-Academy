package com.example.bootExample.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Entity
@Table(name = "Employee", schema = "databaseBoot")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @Column(name = "personID", nullable = false)
    private Long personID;
    @Column(name = "LastName", nullable = false)
    private String LastName;
    @Column(name = "FirstName", nullable = false)
    private String FirstName;

}
