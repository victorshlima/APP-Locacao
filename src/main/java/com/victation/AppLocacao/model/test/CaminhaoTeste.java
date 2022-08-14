package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.model.domain.Carro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class CaminhaoTeste implements ApplicationRunner  {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#Caminhao");

        Caminhao c1 = new Caminhao();
        c1.setValor(100F);
        c1.setEixos(1);
        System.out.println(c1);

        Caminhao c2 = new Caminhao();
        c2.setValor(150F);
        c2.setEixos(1);
        System.out.println(c2);

        Caminhao c3 = new Caminhao();
        c3.setValor(300F);
        c3.setEixos(1);
        System.out.println(c3);

    }


}
