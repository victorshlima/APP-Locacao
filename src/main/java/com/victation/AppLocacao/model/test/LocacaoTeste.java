package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.controller.LocacaoController;
import com.victation.AppLocacao.model.domain.*;
import com.victation.AppLocacao.model.domain.exeptions.AutomovelNullExecption;
import com.victation.AppLocacao.model.domain.exeptions.CPFInvalidoExeption;
import com.victation.AppLocacao.model.domain.exeptions.LocatarioNullExecption;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


@Component
@Order(1)
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)   {

//---------------------------------------------------------------


        Moto m1 = new Moto();
        m1.setValor(100F);
        m1.setChassi(1234234);
        m1.setCilindradas(100);
        m1.setModelo("YBR");
        m1.setLotacao(2);
        m1.setMarca("YAMAHA");
        m1.setPlaca("PLCA");
        m1.setQtdVeiculos(1);
        m1.setQtdVeiculosDisponiveis(1);

        Carro c1 = new Carro();
        c1.setValor(100F);
        c1.setChassi(123234344);
        c1.setCilindradas(100);
        c1.setModelo("YBR");
        c1.setLotacao(2);
        c1.setMarca("YAMAHA");
        c1.setPlaca("PLCA");
        c1.setQtdVeiculos(1);
        c1.setQtdVeiculosDisponiveis(1);
        c1.setValor(100F);
        c1.setPortas(2);


        Caminhao ca1 = new Caminhao();
        ca1.setValor(100F);
        ca1.setChassi(1234);
        ca1.setCilindradas(100);
        ca1.setModelo("YBR");
        ca1.setLotacao(2);
        ca1.setMarca("YAMAHA");
        ca1.setPlaca("PLCA");
        ca1.setQtdVeiculos(1);
        ca1.setQtdVeiculosDisponiveis(1);
        ca1.setValor(100F);
        ca1.setValor(100F);
        ca1.setEixos(1);

        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "locacoes.txt";
        String fileName =dir + arq;
        System.out.println(fileName);


        System.out.println("#################################################################");
        System.out.println("############################LOCACAO##############################");
        System.out.println("#################################################################");
        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha =  null;
                while ((linha = leitura.readLine()) != null){
                    String[] campos = linha.split(";");

                    try {
                        Set<Automovel> automoveis1 = new HashSet<>();
                        automoveis1.add(c1);
                        automoveis1.add(ca1);
                        automoveis1.add(ca1);

                        var locatario1 = new Locatario(
                                campos[2],
                                campos[3],
                                campos[4],
                                campos[5]
                        );
                        Locacao l1 = new Locacao(locatario1, automoveis1);
                        l1.setDescricao(campos[0]);
                        l1.setWeb(Boolean.valueOf(campos[1]));
                        LocacaoController.incluir( l1);
                    } catch ( AutomovelNullExecption | CPFInvalidoExeption| LocatarioNullExecption e) {
                        e.printStackTrace();
                    }

                }

                System.out.println(leitura.readLine());

                fileReader.close();
                leitura.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
                e.printStackTrace();
            } catch (IOException e){
                System.out.println("[ERRO] erro ao fechar o reader");
            }
        }
        catch (Exception e){

        }
        finally {
            System.out.println("terminou");
        }


        System.out.println("#################################################################");
        System.out.println("#################################################################");

////---------------------------------------------------------------
//    try{
//        Moto m2 = new Moto();
//        m2.setValor(100F);
//        m2.setChassi(1235);
//        m2.setCilindradas(100);
//        m2.setModelo("YBR");
//        m2.setLotacao(2);
//        m2.setMarca("YAMAHA");
//        m2.setPlaca("PLCA");
//        m2.setQtdVeiculos(1);
//        m2.setQtdVeiculosDisponiveis(1);
//
//        Set<Automovel> automoveis2 = new HashSet<>();
//        automoveis2.add(m2);
//        automoveis2.add(m2);
//
//        var locatario2 = new Locatario(
//                "12345678921",
//                "maria@gmail.com",
//                "maria",
//                "testina"
//        );
//
//        Locacao l2 = new Locacao(locatario2,automoveis2);
//        l2.setDescricao("Locacao 2");
//
//        l2.setWeb(true);
//        LocacaoController.incluir( l2);
//    }catch (AutomovelNullExecption | CPFInvalidoExeption | LocatarioNullExecption e){
//        System.out.println("ERRO - Locação");
//    }
////---------------------------------------------------------------
//    try{
//        Caminhao ca3 = new Caminhao();
//        ca3.setValor(100F);
//        ca3.setChassi(123444);
//        ca3.setCilindradas(100);
//        ca3.setModelo("YBR");
//        ca3.setLotacao(2);
//        ca3.setMarca("YAMAHA");
//        ca3.setPlaca("PLCA");
//        ca3.setQtdVeiculos(1);
//        ca3.setQtdVeiculosDisponiveis(1);
//        ca3.setValor(100F);
//        ca3.setEixos(1);
//
//        Caminhao ca4 = new Caminhao();
//        ca4.setValor(100F);
//        ca4.setChassi(123444);
//        ca4.setCilindradas(100);
//        ca4.setModelo("YBR");
//        ca4.setLotacao(2);
//        ca4.setMarca("YAMAHA");
//        ca4.setPlaca("PLCA");
//        ca4.setQtdVeiculos(1);
//        ca4.setQtdVeiculosDisponiveis(1);
//        ca4.setValor(100F);
//        ca4.setValor(100F);
//        ca4.setEixos(1);
//
//
//        Set<Automovel> automoveis3 = new HashSet<>();
//        automoveis3.add(ca3);
//        automoveis3.add(ca4);
//        automoveis3.add(ca4);
//        automoveis3.add(ca4);
//
//        var locatario3 = new Locatario(
//                "12345678921",
//                "marla@gmail.com",
//                "marla",
//                "testina"
//                );
//
//        Locacao l3 = new Locacao(locatario3, automoveis3);
//
//        l3.setDescricao("Locacao 3");
//        l3.setWeb(false);
//        l3.setAutomovel(ca3);
//        l3.setAutomovel(ca4);
//        l3.setAutomovel(ca4);
//        l3.setAutomovel(ca4);
//
//        LocacaoController.incluir( l3);
//    }catch (AutomovelNullExecption | CPFInvalidoExeption | LocatarioNullExecption e){
//        System.out.println("ERRO - Locação");
//    }
//
//        try{
//            Caminhao ca3 = new Caminhao();
//            ca3.setValor(100F);
//            ca3.setChassi(123444);
//            ca3.setCilindradas(100);
//            ca3.setModelo("YBR");
//            ca3.setLotacao(2);
//            ca3.setMarca("YAMAHA");
//            ca3.setPlaca("PLCA");
//            ca3.setQtdVeiculos(1);
//            ca3.setQtdVeiculosDisponiveis(1);
//            ca3.setValor(100F);
//            ca3.setEixos(1);
//
//            Caminhao ca4 = new Caminhao();
//            ca4.setValor(100F);
//            ca4.setChassi(123444);
//            ca4.setCilindradas(100);
//            ca4.setModelo("YBR");
//            ca4.setLotacao(2);
//            ca4.setMarca("YAMAHA");
//            ca4.setPlaca("PLCA");
//            ca4.setQtdVeiculos(1);
//            ca4.setQtdVeiculosDisponiveis(1);
//            ca4.setValor(100F);
//            ca4.setValor(100F);
//            ca4.setEixos(1);
//
//
//            Set<Automovel> automoveis4 = new HashSet<>();
////            automoveis4.add(ca3);
////            automoveis4.add(ca4);
////            automoveis4.add(ca4);
////            automoveis4.add(ca4);
//
//            var locatario4 = new Locatario(
//                    null,
//                    "marla@gmail.com",
//                    "marla",
//                    "testina"
//            );
//
//            Locacao l4 = new Locacao(null, automoveis4);
//
//            l4.setDescricao("Locacao 3");
//            l4.setWeb(false);
//            l4.setAutomovel(ca3);
//            l4.setAutomovel(ca4);
//            l4.setAutomovel(ca4);
//            l4.setAutomovel(ca4);
//
//            LocacaoController.incluir( l4);
//        }catch (AutomovelNullExecption | CPFInvalidoExeption | LocatarioNullExecption e){
//            System.out.println("ERRO - Locação");
//        }



    }

}
