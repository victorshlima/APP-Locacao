package com.victation.AppLocacao;

import com.victation.AppLocacao.model.domain.Locacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Order(1)
public class SolicitacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {


        System.out.println("#pedido");

        Locacao p1 = new Locacao();
        p1.setDescricao("Locacao 1");
        p1.setData(LocalDateTime.now());
        p1.setWeb(false);
        System.out.println(p1);

        Locacao p2 = new Locacao();
        p2.setDescricao("Locacao 2");
        p2.setData(LocalDateTime.now());
        p2.setWeb(true);
        System.out.println(p2);

        Locacao p3 = new Locacao();
        p3.setDescricao("Locacao 3");
        p3.setData(LocalDateTime.now());
        p3.setWeb(false);
        System.out.println(p3);

    }



}
