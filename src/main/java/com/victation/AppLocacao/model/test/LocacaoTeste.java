package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.*;
import com.victation.AppLocacao.model.domain.exeptions.AutomovelNullExecption;
import com.victation.AppLocacao.model.domain.exeptions.LocatarioNullExecption;
import com.victation.AppLocacao.service.LocacaoService;
import com.victation.AppLocacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.*;

@Order(99)
@Component
public class LocacaoTeste implements ApplicationRunner {

    @Autowired
    private  LocacaoService locacaoService;

    @Autowired
    private UsuarioService usuarioService;

    private static Integer id =1;
    @Override
    public void run(ApplicationArguments args)   {

       String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "locacoes.txt";
        String fileName =dir + arq;
        System.out.println(fileName);

        Usuario usuario = new Usuario();
        usuario.setNome("teste");
        usuario.setSenha("teste");
        usuario.setEmail("teste");
        usuarioService.incluir(usuario);

        Locatario locatario = new Locatario();
        locatario.setId(1);


       List<Automovel> automoveis = new ArrayList<Automovel>();

        var moto = new Moto();
        moto.setId(1);
        automoveis.add(moto);

        var carro = new Carro();
        carro.setId(1);
        automoveis.add(carro);

        var caminhao = new Caminhao();
        caminhao.setId(1);
        automoveis.add(caminhao);

        Locacao locacao = null;
        try {
            locacao = new Locacao(locatario, automoveis);
            locacao.setUsuario(usuario);

        } catch (LocatarioNullExecption e) {
            e.printStackTrace();
        } catch (AutomovelNullExecption e) {
            e.printStackTrace();
        }
        locacao.setDescricao("teste");
        locacao.setWeb(true);

        locacaoService.incluir(locacao);



//        System.out.println("#################################################################");
//        System.out.println("############################LOCACAO##############################");
//        System.out.println("#################################################################");
//        try {
//            try {
//                FileReader fileReader = new FileReader(fileName);
//                BufferedReader leitura = new BufferedReader(fileReader);
//                String linha =  null;
//                Set<Automovel> automoveis = null;
//                List<Locacao> locacoes = new ArrayList<Locacao>();
//
//                while ((linha = leitura.readLine()) != null){
//                    String[] campos = linha.split(";");
//                    switch (campos[0].toUpperCase()) {
//                        case "L":
//                            try {
//                                automoveis = new HashSet<>();
//
//                                var locatario = new Locatario(id++,
//                                        campos[3],
//                                        campos[4],
//                                        campos[5],
//                                        campos[6]
//                                );
//
//                                Locacao locacao = new Locacao(locatario, automoveis);
//                                locacao.setDescricao(campos[1]);
//                                locacao.setWeb(Boolean.valueOf(campos[2]));
//                            locacoes.add(locacao);
//
//                            } catch ( AutomovelNullExecption | //CPFInvalidoExeption|
//                                    LocatarioNullExecption e) {
//                                e.printStackTrace();
//                            }
//                            break;
//                        case "M":
//                        try {
//                                Moto moto = new Moto(
//                                        Integer.valueOf(campos[1]),
//                                        Integer.valueOf(campos[2]),
//                                        Integer.valueOf(campos[3]),
//                                        campos[4]
//                                );
//
//                              automoveis.add(moto);
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                            break;
//
//                        case "C":
//                            try {
//                                Carro carro = new Carro(
//                                        Integer.valueOf(campos[1]),
//                                        campos[2],
//                                        campos[3],
//                                        Integer.valueOf(campos[4])
//                                );
//                                automoveis.add(carro);
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                            break;
//
//                        case "O":
//                            try {
//                                Caminhao caminhao = new Caminhao(
//                                        Integer.parseInt(campos[1]),
//                                        campos[2],
//                                        Integer.parseInt(campos[3]),
//                                        Integer.parseInt(campos[4])
//                                );
//                                automoveis.add(caminhao);
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                            break;
//                        default:
//                        break;
//                    }
//                    for (Locacao l: locacoes){
//                        System.out.println(">>>>> INCLUIR ");
//                        System.out.println(">>>>>  "  + l.getId());
//                        locacaoService.incluir(l);
//                    }
//                }
//
//                System.out.println(leitura.readLine());
//                fileReader.close();
//                leitura.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("[ERRO] O arquivo não existe!!!");
//                e.printStackTrace();
//            } catch (IOException e){
//                System.out.println("[ERRO] erro ao fechar o reader");
//            }
//        }
//        catch (Exception e){
//
//        }
//        finally {
//            System.out.println("terminou");
//        }
//
//        System.out.println("#################################################################");
//        System.out.println("#################################################################");


    }

}
