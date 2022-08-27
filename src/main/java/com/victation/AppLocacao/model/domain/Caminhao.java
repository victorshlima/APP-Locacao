package com.victation.AppLocacao.model.domain;


import com.victation.AppLocacao.model.domain.exeptions.ValorEixosInvalidoException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Caminhao extends Automovel{

     //http://www.guiadotrc.com.br/noticias/noticiaID.asp?id=36008
    public String tipo; //enum - Toco - Truck - VUC ...
    public int eixos;
    public int capacidadeCarga;



    @Override
    public float calcularValorLocacao() throws ValorEixosInvalidoException {
        if(eixos < 6){
            throw new ValorEixosInvalidoException("Eixos: " +eixos + " maior que 6, quantidade invalida");
        }

        return  getEixos() > 2 ?  valor * 4.5f  :  valor * 1.5f;  };

    @Override
    public String toString() {
        return "\nCaminhao{" +
                "tipo='" + tipo + '\'' +
                ", eixos=" + eixos +
                ", capacidadeCarga=" + capacidadeCarga +
                ";" + super.toString() +
                '}';
    }

    @Override
    public void impressao() {
        System.out.println("#Caminhao");
        System.out.println(this);
    }
}
