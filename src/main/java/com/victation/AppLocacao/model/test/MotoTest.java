package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Moto;
import com.victation.AppLocacao.service.MotoService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


@Component
@Order(7)
public class MotoTest implements ApplicationRunner {

    MotoService motoService;

    public MotoTest(MotoService motoService) {
        this.motoService = motoService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "automoveis.txt";
        String fileName = dir + arq;
        System.out.println(fileName);

        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = null;
                while ((linha = leitura.readLine()) != null) {
                    String[] campos = linha.split(";");

                    if ("M".equals(campos[0])){

                        try {
                            Moto moto = new Moto(
                                    Integer.valueOf(campos[1]),
                                    Integer.valueOf(campos[2]),
                                    Integer.valueOf(campos[3]),
                                    campos[4]
                            );
                            motoService.incluir(moto);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                }
                System.out.println(leitura.readLine());
                fileReader.close();
                leitura.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("[ERRO] erro ao fechar o reader");
            }
        } catch (Exception e) {
        } finally {
            System.out.println("terminou");
        }

    }


}
