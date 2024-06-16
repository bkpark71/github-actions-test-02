package com.example.github_actions_test_02.controller;

import com.example.github_actions_test_02.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @Autowired
  private MainService mainService;

  @GetMapping("/")
  public String main(){
    return mainService.main();
  }
}
