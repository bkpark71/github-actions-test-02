package com.example.github_actions_test_02.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
  public String main(){
    return "This is automated deployment server";
  }
}
