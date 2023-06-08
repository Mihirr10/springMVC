package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping(value = "/about", method = RequestMethod.GET)
  public String about() {
    return "about";
  }
}
