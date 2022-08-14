package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.interfaces.IPrinter;
import lombok.Data;
import lombok.ToString;

@Data
abstract class  Automovel  implements IPrinter { // autmovel por sere abstract não pode ser instaciada

    public String marca;
    public String modelo;
    public int cilindradas;
    public Float valor;
    public int chassi;
    public String placa;
    public int lotacao;
    public int qtdVeiculos;
    public int qtdVeiculosDisponiveis;

    public abstract float calcularValorLocacao();



    @Override
    public String toString() {
        return "Automovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindradas=" + cilindradas +
                ", valor=" + valor +
                ", chassi=" + chassi +
                ", placa='" + placa + '\'' +
                ", lotacao=" + lotacao +
                ", valor locacao" + calcularValorLocacao() +
                '}';
    }

    public abstract void impressao();

}
