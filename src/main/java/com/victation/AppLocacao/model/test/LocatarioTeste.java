package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Locatario;

public class LocatarioTeste {

    public static void main(String[] args){

        Locatario l1 = new Locatario("Victor", "Hugo", "20512365478", "vitao@gmail.com");
        AppLocacao.relatorio("Inclusao ",l1);

        Locatario l2 = new Locatario("Joao", "Jeco", "20512365478", "vitao@gmail.com");
        AppLocacao.relatorio("Inclusao ",l2);

        Locatario l3 = new Locatario("Roberto", "Hubert", "20512365478", "vitao@gmail.com");
        AppLocacao.relatorio("Inclusao ",l3);
    }




}
