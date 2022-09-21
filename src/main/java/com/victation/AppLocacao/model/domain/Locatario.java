package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;
import com.victation.AppLocacao.model.domain.exeptions.CPFInvalidoExeption;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "locatario")
public class Locatario implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public String nome;
    public String sobrenome;
    public String cpf;
    public String email;

    public Locatario() {
    }


    public Locatario(Integer id, String nome, String sobrenome, String cpf, String email )
     throws CPFInvalidoExeption {

       if ( cpf == null){
            throw new CPFInvalidoExeption("Não é possivel aceitar cpf nulo");
        }

        if ( cpf.isEmpty()){
            throw new CPFInvalidoExeption("Não é possivel aceitar cpf nulo");
        }
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void impressao() {
        System.out.println("#Locatario");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nLocatario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
