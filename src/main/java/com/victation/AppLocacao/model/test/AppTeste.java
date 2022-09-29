package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.app.Atributo;
import com.victation.AppLocacao.model.domain.app.Classe;
import com.victation.AppLocacao.model.domain.app.Projeto;
import com.victation.AppLocacao.service.AppService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Order(6)
@Component
public class AppTeste implements ApplicationRunner {

    private final AppService appService;

    public AppTeste(AppService appService) {
        this.appService = appService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "app.txt";
        String fileName =dir + arq;
        System.out.println(fileName);

        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);
                Projeto projeto = null;
                List<Classe> classes = null;
                List<Atributo> atributos = null;
                String linha =  null;
                while ((linha = leitura.readLine()) != null){
                    String[] campos = linha.split(";");

                    //System.out.println(">>>>> "+ linha);
                    System.out.println(">>>>> "+ Arrays.asList(campos));

                        switch (campos[0]){
                            case "P":
                                projeto = new Projeto();
                                classes = new ArrayList<>();
                                projeto.setNome(campos[1]);
                                projeto.setDescricao(campos[2]);
                                projeto.setClasses(classes);
                                break;
                            case "C":
                                atributos = new ArrayList<>();
                                Classe classe =  new Classe();
                                classe.setNome(campos[1]);
                                classe.setAtributos(atributos);
                                classes.add(classe);

                                break;
                            case "A":
                                Atributo  atributo= new Atributo(campos[1], campos[2], campos[3]);
                                atributos.add(atributo);
                                break;
                        }




                }

                System.out.println("<<<<<<<<<<INCLUIR>>>>>>>>>");
                appService.incluir(projeto);

                System.out.println(leitura.readLine());
                fileReader.close();
                leitura.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
                e.printStackTrace();
            } catch (IOException e){
                System.out.println("[ERRO] erro ao fechar o reader");
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("terminou");
        }





    }
}
