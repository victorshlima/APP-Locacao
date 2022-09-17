package com.victation.AppLocacao.model.test;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
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
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Order(3)
@Component
public class LocacaoTeste implements ApplicationRunner {
    private static Integer id =1;
    @Override
    public void run(ApplicationArguments args)   {

        Moto m1 = new Moto(100, 2022, 2022, "xb1");
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

                        var locatario1 = new Locatario(id++,
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


    }

}
