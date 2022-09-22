package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;

public class Cliente implements IPrinter {

    private Integer id;
    public String nome;
    public String email;
    public String senha;

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Cliente(Integer id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente() {
    }

    @Override
    public void impressao() {
        System.out.println("#usuario");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nLocatario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
