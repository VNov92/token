package com.vunt.token.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

  @GetMapping
  public ResponseEntity<?> index() {
    return ResponseEntity.ok("Hello from my API");
  }
}
