package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.controller.CarroController;
import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.model.domain.exeptions.QuantidadePortasCarroInvalidoException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CarroTeste implements ApplicationRunner  {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#Carro");

        Carro c1 = new Carro();
        c1.setValor(100F);
        c1.setChassi(123234344);
        c1.setCilindradas(100);
        c1.setModelo("YBR");
        c1.setLotacao(2);
        c1.setMarca("YAMAHA");
        c1.setPlaca("PLCA123");
        c1.setQtdVeiculos(1);
        c1.setQtdVeiculosDisponiveis(1);
        c1.setValor(100F);
        c1.setPortas(2);

        try {
            c1.calcularValorLocacao();
        } catch (QuantidadePortasCarroInvalidoException e) {
            e.printStackTrace();
        }
        CarroController.incluir(c1);

        Carro c2 = new Carro();
        c2.setValor(100F);
        c2.setChassi(12423844);
        c2.setCilindradas(100);
        c2.setModelo("YBR");
        c2.setLotacao(2);
        c2.setMarca("YAMAHA");
        c2.setPlaca("PLCA321");
        c2.setQtdVeiculos(1);
        c2.setQtdVeiculosDisponiveis(1);
        c2.setValor(100F);
        c2.setPortas(2);

        try {
            c2.calcularValorLocacao();
        } catch (QuantidadePortasCarroInvalidoException e) {
            e.printStackTrace();
        }
        CarroController.incluir(c2);

        Carro c3 = new Carro();
        c3.setValor(100F);
        c3.setChassi(123234333);
        c3.setCilindradas(100);
        c3.setModelo("YBR");
        c3.setLotacao(2);
        c3.setMarca("YAMAHA");
        c3.setPlaca("PLCA1233");
        c3.setQtdVeiculos(1);
        c3.setQtdVeiculosDisponiveis(1);
        c3.setValor(100F);
        c3.setPortas(2);

        try {
            c3.calcularValorLocacao();
        } catch (QuantidadePortasCarroInvalidoException e) {
            e.printStackTrace();
        }
        CarroController.incluir(c3);

    }


}
