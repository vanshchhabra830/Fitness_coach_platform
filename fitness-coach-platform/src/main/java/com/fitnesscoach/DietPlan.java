package com.fitnesscoach;

public class DietPlan {
    private Long id;
    private String name;
    private String goal;

    public DietPlan() {}

    public DietPlan(String name, String goal) {
        this.name = name;
        this.goal = goal;
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

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}