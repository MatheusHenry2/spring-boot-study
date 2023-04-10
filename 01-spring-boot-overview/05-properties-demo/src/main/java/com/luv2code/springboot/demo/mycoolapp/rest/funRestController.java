package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {


    //Inject propertiers for: coach name and team name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for team info

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "coach :" + this.coachName  + ", Team name : " + this.teamName;
    }

    // expose "/" that return "Hello world"

    @GetMapping("/")
    public String sayHello() {
        return "hello world!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 5k!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}