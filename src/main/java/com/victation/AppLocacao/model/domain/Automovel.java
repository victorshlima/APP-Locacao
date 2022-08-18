package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.interfaces.IPrinter;
import lombok.Data;

import java.util.Objects;

@Data
abstract class  Automovel  implements IPrinter { // autmovel por sere abstract não pode ser instaciada

    public Integer id;
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
        return "\nAutomovel{" +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automovel)) return false;
        Automovel automovel = (Automovel) o;
        return chassi == automovel.chassi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassi);
    }
}
