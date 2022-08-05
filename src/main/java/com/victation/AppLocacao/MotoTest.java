package com.victation.AppLocacao;

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
        System.out.println(m1);

        Moto m2 = new Moto();
        System.out.println(m2);

        Moto m3 = new Moto();
        System.out.println(m3);

    }
}
