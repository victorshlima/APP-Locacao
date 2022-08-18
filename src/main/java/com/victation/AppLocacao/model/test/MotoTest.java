package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Moto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class MotoTest implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#moto");

        Moto m1 = new Moto();
        m1.setValor(100F);
        m1.setChassi(123);
        m1.setCilindradas(100);
        m1.setModelo("YBR");
        m1.setLotacao(2);
        m1.setMarca("YAMAHA");
        m1.setPlaca("PLCA");
        m1.setQtdVeiculos(1);
        m1.setQtdVeiculosDisponiveis(1);

        AppLocacao.relatorio("",m1);

        Moto m2 = new Moto();
        m2.setValor(150F);
        m2.setModelo("HONDA");
        m2.setModelo("YBR");
        m2.setLotacao(2);
        m2.setMarca("YAMAHA");
        m2.setPlaca("PLCA");
        m2.setQtdVeiculos(1);
        m2.setQtdVeiculosDisponiveis(1);

        AppLocacao.relatorio("",m2);

        Moto m3 = new Moto();
        m3.setValor(300F);
        m3.setModelo("BMW");
        m3.setLotacao(2);
        m3.setMarca("YAMAHA");
        m3.setPlaca("PLCA");
        m3.setQtdVeiculos(1);
        m3.setQtdVeiculosDisponiveis(1);

        AppLocacao.relatorio("",m3);

    }
}
