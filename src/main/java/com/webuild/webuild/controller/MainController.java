package com.webuild.webuild.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

  @GetMapping("")
  public String renderMainpage(){
    return "Welcome to WeBuild! We build the future together!";
  }
}
