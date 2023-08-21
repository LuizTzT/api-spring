package br.com.projeto.api.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CustomResponse {
  private String message;
  private Person person;

}
