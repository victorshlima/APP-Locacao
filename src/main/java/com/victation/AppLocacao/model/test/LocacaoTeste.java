package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Order(1)
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

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


        System.out.println("#pedido");

        Locacao l1 = new Locacao(Locatario.builder()
                .cpf("12345678921")
                .email("Joao@gmail.com")
                .nome("Joao")
                .sobrenome("Testino")
                .build());
        l1.setDescricao("");
        l1.setWeb(false);

     //   l1.setAutomoveis(m1);
        l1.setAutomovel(c1);
        l1.setAutomovel(ca1);
        l1.setAutomovel(ca1);

        AppLocacao.relatorio("Locação 1", l1);
//---------------------------------------------------------------

        Moto m2 = new Moto();
        m2.setValor(100F);
        m2.setChassi(1235);
        m2.setCilindradas(100);
        m2.setModelo("YBR");
        m2.setLotacao(2);
        m2.setMarca("YAMAHA");
        m2.setPlaca("PLCA");
        m2.setQtdVeiculos(1);
        m2.setQtdVeiculosDisponiveis(1);

        Locacao l2 = new Locacao(Locatario.builder()
                .cpf("12345678921")
                .email("maria@gmail.com")
                .nome("maria")
                .sobrenome("Testino")
                .build());
        l2.setDescricao("Locacao 2");

        l2.setAutomovel(m2);

        l2.setWeb(true);
        AppLocacao.relatorio("Locação 2", l2);

//---------------------------------------------------------------

        Caminhao ca3 = new Caminhao();
        ca3.setValor(100F);
        ca3.setChassi(123444);
        ca3.setCilindradas(100);
        ca3.setModelo("YBR");
        ca3.setLotacao(2);
        ca3.setMarca("YAMAHA");
        ca3.setPlaca("PLCA");
        ca3.setQtdVeiculos(1);
        ca3.setQtdVeiculosDisponiveis(1);
        ca3.setValor(100F);
        ca3.setEixos(1);

        Caminhao ca4 = new Caminhao();
        ca4.setValor(100F);
        ca4.setChassi(123444);
        ca4.setCilindradas(100);
        ca4.setModelo("YBR");
        ca4.setLotacao(2);
        ca4.setMarca("YAMAHA");
        ca4.setPlaca("PLCA");
        ca4.setQtdVeiculos(1);
        ca4.setQtdVeiculosDisponiveis(1);
        ca4.setValor(100F);
        ca4.setValor(100F);
        ca4.setEixos(1);


        Locacao l3 = new Locacao(Locatario.builder()
                .cpf("12345678921")
                .email("marla@gmail.com")
                .nome("marla")
                .sobrenome("testina")
                .build());

        l3.setDescricao("Locacao 3");
        l3.setWeb(false);
        l3.setAutomovel(ca3);
        l3.setAutomovel(ca4);
        l3.setAutomovel(ca4);
        l3.setAutomovel(ca4);

        AppLocacao.relatorio("Locação 3", l3);

    }

}
