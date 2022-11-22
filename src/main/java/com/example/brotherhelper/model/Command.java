package com.example.brotherhelper.model;

import lombok.Getter;

@Getter
public enum Command {
    START("f", "Поможет познакомиться с приложением"),
    ADD_LESSON("add_lesson", "Новый урок? Вноси его здесь!");

    private final String name;
    private final String description;

    Command(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
