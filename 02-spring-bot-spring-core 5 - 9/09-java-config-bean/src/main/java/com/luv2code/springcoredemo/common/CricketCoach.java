package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("in Constructor:" + getClass().getSimpleName());
    }

    //define our init method

    @Override
    public String getDailyWorkout() {
        return "Pratice fast bowing for 1 minuts";
    }

}
