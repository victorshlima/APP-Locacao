package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.interfaces.IPrinter;
import com.victation.AppLocacao.model.domain.exeptions.QuantidadePortasCarroInvalidoException;
import com.victation.AppLocacao.model.domain.exeptions.ValorEixosInvalidoException;
import com.victation.AppLocacao.model.domain.exeptions.ValorMotoInvalidoException;
//import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED) // possibilita acessar todas as tabelas que herdam...
public abstract class  Automovel  implements IPrinter { // autmovel por sere abstract não pode ser instaciada

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(mappedBy = "automoveis")
    private List<Locacao> locacoes;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    protected Automovel() {
    }

    public abstract float calcularValorLocacao() throws QuantidadePortasCarroInvalidoException, ValorMotoInvalidoException, ValorEixosInvalidoException;



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

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }

    public void setQtdVeiculos(int qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public int getQtdVeiculosDisponiveis() {
        return qtdVeiculosDisponiveis;
    }

    public void setQtdVeiculosDisponiveis(int qtdVeiculosDisponiveis) {
        this.qtdVeiculosDisponiveis = qtdVeiculosDisponiveis;
    }
}
