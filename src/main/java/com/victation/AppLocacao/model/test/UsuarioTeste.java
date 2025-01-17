package com.victation.AppLocacao.model.test;

import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.service.UsuarioService;
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
public class UsuarioTeste implements ApplicationRunner {

    private final UsuarioService usuarioService;
    public UsuarioTeste(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "usuario.txt";
        String fileName =dir + arq;
        System.out.println(fileName);

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("teste");
        usuario.setSenha("teste");
        usuario.setEmail("teste@gmail.com");
        usuarioService.incluir(usuario);

        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha =  null;
                while ((linha = leitura.readLine()) != null){
                    String[] campos = linha.split(";");

                    try {
                     Usuario usuario1 = new Usuario(
                                campos[0],
                                campos[1],
                                campos[2]
                        );
                        usuarioService.incluir(usuario1);
                    } catch ( Exception e) {
                        e.printStackTrace();
                    }
                }
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
        }
        finally {
            System.out.println("terminou");
        }
    }
}
