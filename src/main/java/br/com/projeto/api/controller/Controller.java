package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Person;
import br.com.projeto.api.repository.RepositoryCrud;
import br.com.projeto.api.service.ServiceCrud;

@RestController
public class Controller {

  @Autowired
  private RepositoryCrud action;

  @Autowired
  private ServiceCrud service;

  @PostMapping("/api")
  public ResponseEntity<?> register(@RequestBody Person obj){
    return service.register(obj);
  }

  @GetMapping("/api")
  public List<Person> selectAll(){
    return action.findAll();
  }

  @GetMapping("/api/{id}")
  public Person selectById(@PathVariable int id){
    return action.findById(id);
  }

  @PutMapping("/api")
  public Person edit(@RequestBody Person obj){
    return action.save(obj);
  }

  @DeleteMapping("/api/{id}")
  public void delete(@PathVariable int id){
    Person personObj = selectById(id);
    action.delete(personObj);
  }

  @GetMapping("/api/count")
  public String countPeople(){
    long count = action.count();
    String formatted = String.format("%d elements.", count);
    return formatted;
  }

  @GetMapping("/api/orderByName")
  public List<Person> orderByName(){
    return action.findByOrderByName();
  }

  @GetMapping("/api/orderByAgeDesc")
  public List<Person> findByNameOrderByAgeDesc(String name){
    return action.findByNameOrderByAgeDesc("Renata");
  }

  @GetMapping("/api/containing")
  public List<Person> findByNameContaining(){
    return action.findByNameContaining("br");
  }

  @GetMapping("/api/starts")
  public List<Person> nameStartsWith(){
    return action.findByNameStartsWith("re");
  }

  @GetMapping("/api/ends")
  public List<Person> nameEndsWith(){
    return action.findByNameEndsWith("o");
  }

  @GetMapping("/api/sumAges")
  public int sumAges(){
    return action.sumAges();
  }

  @GetMapping("/api/equalOrHigher")
  public List<Person> equalOrHigher(){
    return action.equalOrHigher(30);
  }

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
