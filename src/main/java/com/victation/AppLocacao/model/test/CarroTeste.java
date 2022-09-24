package com.victation.AppLocacao.model.test;


import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.domain.Usuario;
import com.victation.AppLocacao.service.CarroService;
import com.victation.AppLocacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(4)
public class CarroTeste implements ApplicationRunner  {

    private final CarroService carroService;

    @Autowired
    private UsuarioService usuarioService;


    public CarroTeste(CarroService carroService) {
        this.carroService = carroService;
    }
    @Override
    public void run(ApplicationArguments args) {

        String dir = "//home//wid_vlima//dev//git_study//infnet//APP-Locacao//dev//";
        String arq = "automoveis.txt";
        String fileName = dir + arq;
        System.out.println(fileName);

        Usuario usuario = new Usuario();
        usuario.setNome("teste");
        usuario.setSenha("teste");
        usuario.setEmail("teste");
        usuarioService.incluir(usuario);


        try {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = null;
                while ((linha = leitura.readLine()) != null) {
                    String[] campos = linha.split(";");
                    if ("C".equals(campos[0])) {
                        try {
                            Carro carro = new Carro(
                                    Integer.valueOf(campos[1]),
                                    campos[2],
                                    campos[3],
                                    Integer.valueOf(campos[4])
                            );
                            carro.setUsuario(usuario);
                            carroService.incluir(carro,usuario);
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
