package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Caminhao;
import com.victation.AppLocacao.service.CaminhaoService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


@Component
@Order(5)
public class CaminhaoTeste implements ApplicationRunner  {

    private final CaminhaoService caminhaoService;

    public CaminhaoTeste(CaminhaoService caminhaoService) {
        this.caminhaoService = caminhaoService;
    }

    @Override
    public void run(ApplicationArguments args)   {

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
                    if ("O".equals(campos[0])) {
                        try {
                            Caminhao caminhao = new Caminhao(
                                    Integer.parseInt(campos[1]),
                                    campos[2],
                                    Integer.parseInt(campos[3]),
                                    Integer.parseInt(campos[4])
                            );
                            caminhaoService.incluir(caminhao);
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
