package ru.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int clientId;

    private String first_name;

    private String middle_name;

    private String last_name;

    private int age;

}

