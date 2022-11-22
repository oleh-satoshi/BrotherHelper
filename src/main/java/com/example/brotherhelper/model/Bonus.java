package com.example.brotherhelper.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "bonuses")
public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantityPoints;
    private LocalDateTime timeStart;
    private LocalDateTime timeOff;
}
