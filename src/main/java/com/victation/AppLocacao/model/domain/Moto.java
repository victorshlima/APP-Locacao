package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.model.domain.exeptions.QuantidadePortasCarroInvalidoException;
import com.victation.AppLocacao.model.domain.exeptions.ValorMotoInvalidoException;

public class Moto extends Automovel {

    @Override
    public float calcularValorLocacao() throws ValorMotoInvalidoException {

        if(valor < 5000L){
            throw new ValorMotoInvalidoException("valor: " +valor+ " menor que 5000, valor invalida");
        }

        return  getModelo().equals("BMW") ?  valor * 4.5f  :  valor * 1.5f;
    };

    @Override
    public void impressao() {
        System.out.println("#Moto");
        System.out.println(this);
    }

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
                ", qtdVeiculos=" + qtdVeiculos +
                ", qtdVeiculosDisponiveis=" + qtdVeiculosDisponiveis +
                ":" + super.toString() +
                '}';
    }


}
