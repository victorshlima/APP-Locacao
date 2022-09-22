package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Locatario;
import com.victation.AppLocacao.service.LocatarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Order(1)
@Component
public class LocatarioTeste implements ApplicationRunner {

    private final LocatarioService locatarioService;

    public LocatarioTeste(LocatarioService locatarioService) {
        this.locatarioService = locatarioService;
    }

    @Override
    public void run(ApplicationArguments args) {

        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "locatario.txt";
        String fileName = dir + arq;
        System.out.println(fileName);

        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = null;
                while ((linha = leitura.readLine()) != null) {
                    String[] campos = linha.split(";");

                    try {
                        Locatario locatario = new Locatario(
                                Integer.valueOf(campos[0]),
                                campos[1],
                                campos[2],
                                campos[3],
                                campos[4]
                        );
                        locatarioService.incluir(locatario);
                    } catch (Exception e) {
                        e.printStackTrace();
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
