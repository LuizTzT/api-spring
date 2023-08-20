package br.com.projeto.api.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Message {
  private String message;
}
