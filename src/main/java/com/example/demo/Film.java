package com.example.demo;

public class Film {
    private final String name;
    private final String description;

    public Film(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
}