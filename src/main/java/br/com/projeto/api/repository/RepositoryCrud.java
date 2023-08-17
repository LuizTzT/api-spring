package br.com.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Person;

@Repository
public interface RepositoryCrud extends CrudRepository<Person, Integer>{
  
}
