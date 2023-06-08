package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

  @RequestMapping("/home")

  public String home(Model model) {

    model.addAttribute("name", "Mihir parmar");
    model.addAttribute("number", 57);

    List<String> list = new ArrayList<String>();
    list.add("mihir");
    list.add("shailesh");
    list.add("parth");
    list.add("arpit");
    list.add("yash");
    list.add("hardeek");

    model.addAttribute("f", list);
    return "index";
  }

  @RequestMapping("/about")
  public String about() {
    return "about";
  }

  @RequestMapping("/help")
  public ModelAndView help() {

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("name", "mihir");
    modelAndView.addObject("hobby", "cricket");


    LocalDate localDate = LocalDate.now();
    modelAndView.addObject("time", localDate);

    modelAndView.setViewName("view");

    return modelAndView;
  }


}
