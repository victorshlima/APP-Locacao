package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.model.domain.exeptions.ValorEixosInvalidoException;

import javax.persistence.*;


@Entity
@Table
public class Caminhao extends Automovel{

     //http://www.guiadotrc.com.br/noticias/noticiaID.asp?id=36008
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String tipo; //enum - Toco - Truck - VUC ...
    public int eixos;
    public int capacidadeCarga;

    public Caminhao(Integer id, String tipo, int eixos, int capacidadeCarga) {
        this.id = id;
        this.tipo = tipo;
        this.eixos = eixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao() {

    }


    @Override
    public float calcularValorLocacao() throws ValorEixosInvalidoException {
        if(eixos < 6){
            throw new ValorEixosInvalidoException("Eixos: " +eixos + " maior que 6, quantidade invalida");
        }

        return  getEixos() > 2 ?  valor * 4.5f  :  valor * 1.5f;  };

    @Override
    public String toString() {
        return "\nCaminhao{" +
                "tipo='" + tipo + '\'' +
                ", eixos=" + eixos +
                ", capacidadeCarga=" + capacidadeCarga +
                ";" + super.toString() +
                '}';
    }




    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void impressao() {
        System.out.println("#Caminhao");
        System.out.println(this);
    }
}
