package com.victation.AppLocacao.model.domain;


import lombok.Data;

@Data
public class Caminhao extends Automovel{

     //http://www.guiadotrc.com.br/noticias/noticiaID.asp?id=36008
    public String tipo; //enum - Toco - Truck - VUC ...
    public int eixos;
    public int capacidadeCarga;



    @Override
    public float calcularValorLocacao()
    {  return  getEixos() > 2 ?  valor * 4.5f  :  valor * 1.5f;  };

    @Override
    public String toString() {
        return "Caminhao{" +
                "tipo='" + tipo + '\'' +
                ", eixos=" + eixos +
                ", capacidadeCarga=" + capacidadeCarga +
                ";" + super.toString() +
                '}';
    }

    @Override
    public void impressao() {
        System.out.println("#Caminhao");
        System.out.println(this);
    }
}
