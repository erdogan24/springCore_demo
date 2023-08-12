package com.erdogan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach (){
        System.out.println("In constructor :" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spring 15 minutes in batting practice";
    }
}
