package br.com.projeto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Message;

@Service
public class ServiceCrud {

  @Autowired
  private Message message;

}
