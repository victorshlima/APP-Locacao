package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Locatario;

public class LocatarioTeste {

    public static void main(String[] args)  {

        Locatario l1 = null;
        try {
            l1 = new Locatario("Victor", "Hugo", "20512365478", "vitao@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" deu ruim");
        }
        AppImpressao.relatorio("Inclusao ",l1);

        Locatario l2 = null;
        try {
            l2 = new Locatario("Joao", "Jeco", "20512365478", "vitao@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" deu ruim");
        }
        AppImpressao.relatorio("Inclusao ",l2);

        Locatario l3 = null;
        try {
            l3 = new Locatario("Roberto", "Hubert", "20512365478", "vitao@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" deu ruim");
        }
        AppImpressao.relatorio("Inclusao ",l3);

        Locatario l4 = null;
        try {
            l4 = new Locatario("Roberto", "Hubert", null, "vitao@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" deu ruim");
        }
        AppImpressao.relatorio("Inclusao ",l4);

        Locatario l5 = null;
        try {
            l5 = new Locatario("Roberto", "Hubert", "", "vitao@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" deu ruim");
        }
        AppImpressao.relatorio("Inclusao ",l5);
    }

}
