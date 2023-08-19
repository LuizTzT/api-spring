package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Person;

@Repository
public interface RepositoryCrud extends CrudRepository<Person, Integer>{
  
  List<Person> findAll();
  Person findById(int id);
  List<Person> findByOrderByName();
  List<Person> findByNameOrderByAgeDesc(String name);
  List<Person> findByNameContaining(String term);

}
