package com.otiswolf.levelupjava.habit;

public class Habit {
    String name;
    String description;
    String goal;

    public Habit(String name, String description, String goal) {
        this.name = name;
        this.description = description;
        this.goal = goal;
    }

    public Habit(String name, String goal) {
        this.name = name;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
