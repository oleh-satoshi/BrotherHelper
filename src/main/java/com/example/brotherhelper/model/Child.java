package com.example.brotherhelper.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Coin count;
    @OneToMany
    private List<Task> tasks;
    private Integer rating;
    @OneToOne
    private Task completeTask;
    @OneToOne
    private Task incompleteTask;
}
