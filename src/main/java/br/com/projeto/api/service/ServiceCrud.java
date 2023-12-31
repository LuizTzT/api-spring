package br.com.projeto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.CustomResponse;
import br.com.projeto.api.model.Message;
import br.com.projeto.api.model.Person;
import br.com.projeto.api.repository.RepositoryCrud;

@Service
public class ServiceCrud {

  @Autowired
  private Message message;

  @Autowired
  private RepositoryCrud action;

  @Autowired
  private CustomResponse customResponse;

  public ResponseEntity<?> register(Person obj) {
    if (obj.getName().equals("")) {
      message.setMessage("O nome precisa ser informado.");
      return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    } else if (obj.getAge() < 0) {
      message.setMessage("Informe uma idade maior que zero.");
      return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(action.save(obj), HttpStatus.CREATED);
    }
  }

  public ResponseEntity<?> selectAll() {
    return new ResponseEntity<>(action.findAll(), HttpStatus.OK);
  }

  public ResponseEntity<?> selectById(int id) {
    if (action.countById(id) == 0) {
      message.setMessage("Nenhuma pessoa encontrada.");
      return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(action.findById(id), HttpStatus.OK);
    }
  }

  public ResponseEntity<?> edit(Person obj) {
    if (action.findById(obj.getId()) != null) {
      if (obj.getName().equals("")) {
        message.setMessage("Nome vazio.");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
      } else if (obj.getAge() < 0) {
        message.setMessage("Idade menor que zero.");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
      } else {
        return new ResponseEntity<>(action.save(obj), HttpStatus.OK);
      }
    }
    message.setMessage("Pessoa não encontrada.");
    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
  }

  public ResponseEntity<?> delete(int id) {
    Person personObj = action.findById(id);
    if (personObj != null) {
      action.delete(personObj);

      customResponse.setMessage("Pessoa removida com sucesso.");
      customResponse.setPerson(personObj);

      return new ResponseEntity<>(customResponse, HttpStatus.OK);
    }
    message.setMessage("Pessoa não encontrada");
    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
  }

}
