package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.Controller.DemoController;

@SpringBootApplication
public class DemoApplication {

  // @Value("${NAME:Ankit}")
  // String name;

  // @RestController
  // class HelloworldController {
  //   @GetMapping("/")
  //   String hello() {
  //     return "Hello " + name + "!";
  //   }
  //   @GetMapping("/new")
  //   String hello2() {
  //     return "Hello " + "google" + "!";
  //   }
  // }

  public static void main(String[] args) {
    System.out.println("started");
    SpringApplication.run(DemoApplication.class, args);
  }

}
