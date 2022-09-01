package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.controller.ClienteController;
import com.victation.AppLocacao.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class UsuarioTeste implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Cliente cliente =  new Cliente();
        cliente.setEmail("victor@gmail.com");
        cliente.setNome("Victor");
        cliente.setSenha("123");

        ClienteController.incluir(cliente);

    }
}
