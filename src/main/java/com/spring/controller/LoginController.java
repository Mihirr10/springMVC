package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class LoginController {


  @RequestMapping("/login")
  public String login() {
    return "login";
  }


  @RequestMapping(path = "/processform", method = RequestMethod.POST)
  public String handleForm(@ModelAttribute User user, ModelMap model) {

    System.out.println(user);
//    @RequestParam("username")String username, @RequestParam("password")String password, Model model
////    System.out.println("user Name:"+username);
////    System.out.println("user password:"+password);
//
//      User user=new User();
//      user.setUserName(username);
//      user.setPassword(password);
//
//    System.out.println(user);
//
////    model.addAttribute("name",username);
////    model.addAttribute("password",password);
//
//    model.addAttribute("user",user);
    return "success";


  }

}
