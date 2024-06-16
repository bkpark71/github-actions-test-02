package com.example.github_actions_test_02.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainServiceTest {
  @Autowired
  private MainService mainService;

  @Test
  void test(){
    String main = mainService.main();
    assertThat(main).isEqualTo("This is automated deployment server");
  }

}