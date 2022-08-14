package com.victation.AppLocacao.model.domain;


import lombok.Data;


@Data
public class Moto extends Automovel {


    @Override
    public float calcularValorLocacao()
    {  return  getModelo().equals("BMW") ?  valor * 4.5f  :  valor * 1.5f;  };

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                ", valor=" + valor +
                ", chassi=" + chassi +
                ", placa='" + placa + '\'' +
                ", lotacao=" + lotacao +
                ";" + super.toString() +
                '}';
    }

    @Override
    public void impressao() {
        System.out.println("#Moto");
        System.out.println(this);
    }
}
