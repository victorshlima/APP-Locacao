package com.victation.AppLocacao.model.domain;



import com.victation.AppLocacao.model.domain.exeptions.ValorMotoInvalidoException;

import java.time.LocalDateTime;

public class Moto extends Automovel {

    private int peso;
    private LocalDateTime ano;
    private String  tipoRoda;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public LocalDateTime getAno() {
        return ano;
    }

    public void setAno(LocalDateTime ano) {
        this.ano = ano;
    }

    public String getTipoRoda() {
        return tipoRoda;
    }

    public void setTipoRoda(String tipoRoda) {
        this.tipoRoda = tipoRoda;
    }

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
