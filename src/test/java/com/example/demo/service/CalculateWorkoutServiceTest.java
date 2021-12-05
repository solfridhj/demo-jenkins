package com.example.demo.service;

import com.example.demo.domain.Exercise;
import com.example.demo.domain.Workout;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculateWorkoutServiceTest {


    private final CalculateWorkoutService calculateWorkoutService = new CalculateWorkoutService();

    @Test
    void calculateWorkoutDurationInSeconds(){
        Workout workout = new Workout().setExercises(List.of(
                new Exercise().setReps(8L).setSets(3L),
                new Exercise().setReps(3L).setSets(6L)
        ));

        BigDecimal actual = calculateWorkoutService.calculateWorkoutDurationInSeconds(workout);

        BigDecimal expecte= BigDecimal.valueOf(1662);

        assertThat(actual).isEqualByComparingTo(expected);
    }


}