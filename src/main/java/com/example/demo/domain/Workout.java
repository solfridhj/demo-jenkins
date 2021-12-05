package com.example.demo.domain;


import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.StringJoiner;

@Component
public class Workout {
    private  Long id;
    private  String name;
    private  BigDecimal length;
    private  List<Exercise> exercises;

    public Long getId() {
        return id;
    }

    public Workout setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Workout setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getLength() {
        return length;
    }

    public Workout setLength(BigDecimal length) {
        this.length = length;
        return this;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public Workout setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Workout.class.getSimpleName() + "[", "]")
                .toString();
    }
}
