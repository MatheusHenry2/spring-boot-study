package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class TenisCoach implements  Coach{

    public TenisCoach(){
        System.out.println("in Constructor:" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Pratice your backhand volley";
    }
}
