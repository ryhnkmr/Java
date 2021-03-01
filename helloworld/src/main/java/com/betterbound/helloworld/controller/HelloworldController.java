package com.betterbound.helloworld.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
  @RequestMapping("/")
  public String index() {
      return "index";
  }
}
