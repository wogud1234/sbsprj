package com.sbs.qnaService.boundedContext.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  @GetMapping("/main")
  @ResponseBody
  public String showMain(){
    return "안녕";
  }
}
