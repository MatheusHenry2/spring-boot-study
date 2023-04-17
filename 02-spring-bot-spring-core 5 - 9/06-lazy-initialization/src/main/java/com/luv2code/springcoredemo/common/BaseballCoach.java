package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{

    public BaseballCoach(){
        System.out.println("in Constructor:" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting praticse";
    }
}
