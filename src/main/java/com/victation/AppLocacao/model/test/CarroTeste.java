package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Moto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CarroTeste implements ApplicationRunner  {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#Carro");

        Carro c1 = new Carro();
        c1.setValor(100F);
        c1.setPortas(2);
       // System.out.println(c1);

       AppLocacao.relatorio("Carro ", c1);

        Carro c2 = new Carro();
        c2.setValor(150F);
        c1.setPortas(4);
       // System.out.println(c2);

        AppLocacao.relatorio("Carro ", c2);

        Carro c3 = new Carro();
        c1.setPortas(2);
        c3.setValor(300F);
        //System.out.println(c3);


        AppLocacao.relatorio("Carro ", c3);

    }


}
