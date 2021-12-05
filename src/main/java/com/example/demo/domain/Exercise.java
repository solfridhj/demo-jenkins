package com.example.demo.domain;

import com.example.demo.enums.ExerciseNames;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
public class Exercise {

    private  Long id;
    private  Long sets;
    private  Long reps;
    private  ExerciseNames name;


    public Long getId() {
        return id;
    }

    public Exercise setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSets() {
        return sets;
    }

    public Exercise setSets(Long sets) {
        this.sets = sets;
        return this;
    }

    public Long getReps() {
        return reps;
    }

    public Exercise setReps(Long reps) {
        this.reps = reps;
        return this;
    }

    public ExerciseNames getName() {
        return name;
    }

    public Exercise setName(ExerciseNames name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Exercise.class.getSimpleName() + "[", "]")
                .toString();
    }
}
