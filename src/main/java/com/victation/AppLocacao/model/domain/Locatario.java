package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;
import com.victation.AppLocacao.model.domain.exeptions.CPFInvalidoExeption;
import lombok.*;

@Data
@NoArgsConstructor
public class Locatario implements IPrinter {

    public String nome;
    public String sobrenome;
    public String cpf;
    public String email;

    public Locatario(String cpf, String email, String nome, String sobrenome )
     throws CPFInvalidoExeption {


       if ( cpf == null){
            throw new CPFInvalidoExeption("Não é possivel aceitar cpf nulo");
        }

        if ( cpf.isEmpty()){
            throw new CPFInvalidoExeption("Não é possivel aceitar cpf nulo");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
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
