package com.luv2code.springcoredemo.common;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Pratice fast bowing for 1 minuts";
    }

}
