package com.lab9.oddeven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

  @GetMapping("/validate")
  public String isNumberPrime(@RequestParam("number1") Integer
      number1, @RequestParam("number2") Integer number2) {
    return number1 % 2 == 0 && number2 % 2 == 0 ? "Even" : "Odd";
  }

  @GetMapping("/add")
  public int add(@RequestParam("value1") Integer value1, @RequestParam("value2") Integer value2) {
    return value1 + value2;
  }

  @GetMapping("/double")
  public String add(@RequestParam("number") Integer number) {
    return number + number + "";
  }
}
