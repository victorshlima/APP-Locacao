package com.victation.AppLocacao.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carro extends Automovel{

    public int portas;

    @Override
    public float calcularValorLocacao()
    {  return  getPortas() > 2 ?  valor * 3.5f  :  valor * 2.5f;  };

    @Override
    public String toString() {
        return "\nCarro{" +
                "portas=" + portas +
                ";" + super.toString() +
                '}';
    }

    @Override
    public void impressao() {
        System.out.println("#Carro");
        System.out.println(this);
    }
}
