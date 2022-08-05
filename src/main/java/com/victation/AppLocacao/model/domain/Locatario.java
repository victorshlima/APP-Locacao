package com.victation.AppLocacao.model.domain;


import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Locatario {

    public String nome;
    public String sobrenome;
    public String cpf;
    public String email;

}
