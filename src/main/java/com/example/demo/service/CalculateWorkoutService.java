package com.example.demo.service;

import com.example.demo.domain.Exercise;
import com.example.demo.domain.Workout;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

@Service
public class CalculateWorkoutService {

    public BigDecimal calculateWorkoutDurationInSeconds(Workout workout){
        List<Exercise> exerciseList = workout.getExercises();

        Long totalNumberOfReps = exerciseList.stream()
                .map(totalNumberOfRepsForExercise())
                .reduce(0L, Long::sum);

        Long totalNumberOfSets = exerciseList.stream()
                .map(Exercise::getSets)
                .reduce(0L, Long::sum);

        return totalTimeInSeconds(totalNumberOfReps, totalNumberOfSets);

    }

    private Function<Exercise, Long> totalNumberOfRepsForExercise(){
        return exercise -> exercise.getReps()*exercise.getSets();
    }

    private BigDecimal totalTimeInSeconds(Long totalNumberOfReps, Long totalNumberOfSets) {
        return BigDecimal.valueOf(totalNumberOfReps)
                .add(BigDecimal.valueOf(totalNumberOfSets).multiply(BigDecimal.valueOf(180)));
    }
}
