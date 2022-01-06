package com.javamaster.spring_crud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity

@Data
@NoArgsConstructor
@Table (name = "users_table")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String email;


}
