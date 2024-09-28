package kr.ac.devops.devopts_step0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DevopsController {
  
  @GetMapping("/")
  public String index() {
      System.out.println("log : hello ");
      return "index.html";
  }
  
}
