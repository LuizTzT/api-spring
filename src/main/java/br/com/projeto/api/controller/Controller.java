package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Person;

@RestController
public class Controller {

  @GetMapping("/message")
  public String message() {
    return "Hello World!";
  }

  @GetMapping("/welcome/{name}")
  public String welcome(@PathVariable String name){
    return String.format("Welcome %s", name);
  }

  @PostMapping("/pessoa")
  public Person person(@RequestBody Person p){
    return p;
  }
}
