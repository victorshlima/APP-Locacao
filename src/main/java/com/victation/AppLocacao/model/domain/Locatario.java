package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.interfaces.IPrinter;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Locatario implements IPrinter {

    public String nome;
    public String sobrenome;
    public String cpf;
    public String email;

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
