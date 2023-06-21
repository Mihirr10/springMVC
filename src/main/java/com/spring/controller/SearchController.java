package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {


      @RequestMapping("/show")
      public String show(){
        System.out.println("hello this is showing");
        return "show";
      }

      @RequestMapping("/search")
      public RedirectView Search(@RequestParam("queryBox") String query){

       String url="https://www.google.com/search?q=" + query;
       RedirectView redirectView=new RedirectView();
       redirectView.setUrl(url);

       return redirectView;
      }
}
