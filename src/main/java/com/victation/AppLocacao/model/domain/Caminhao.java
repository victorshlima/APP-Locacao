package com.victation.AppLocacao.model.domain;


import lombok.ToString;

@ToString
public class Caminhao extends Automovel{

     //http://www.guiadotrc.com.br/noticias/noticiaID.asp?id=36008
    public String tipo; //enum - Toco - Truck - VUC ...
    public int eixos;
    public int capacidadeCarga;
}
