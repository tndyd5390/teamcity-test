package com.example.teamcitytest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamcityController {

  @GetMapping("/test")
  public String test(){
    System.out.println("tes
    return "test";
  }
}
