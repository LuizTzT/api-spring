package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Person;

@Repository
public interface RepositoryCrud extends CrudRepository<Person, Integer> {

  List<Person> findAll();

  Person findById(int id);

  List<Person> findByOrderByName();

  List<Person> findByNameOrderByAgeDesc(String name);

  List<Person> findByNameContaining(String term);

  List<Person> findByNameStartsWith(String term);

  List<Person> findByNameEndsWith(String term);

  @Query(value = "SELECT SUM(age) FROM people", nativeQuery = true)
  int sumAges();

  @Query(value = "SELECT * FROM people WHERE age >= :age", nativeQuery = true)
  List<Person> equalOrHigher(int age);
}
