package com.fitnesscoach;

public class Workout {
    private Long id;
    private String name;
    private String level;

    public Workout() {}

    public Workout(String name, String level) {
        this.name = name;
        this.level = level;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
 return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}