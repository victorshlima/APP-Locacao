package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;
import com.victation.AppLocacao.model.domain.exeptions.AutomovelNullExecption;
import com.victation.AppLocacao.model.domain.exeptions.LocatarioNullExecption;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class Locacao implements IPrinter {

    private Integer id;
    private String descricao;
    private LocalDateTime dataLocacao;
    private LocalDateTime dataDevolucao;
    private boolean web;
    private Locatario locatario;
    private Set<Automovel> automoveis = new HashSet<>();

    public Locacao(Locatario locatario, Set<Automovel> automoveis) throws LocatarioNullExecption, AutomovelNullExecption {

        if(locatario == null){
            throw new LocatarioNullExecption("Solicitante não pode ser nulo");
        }
//
//        if(automoveis.isEmpty()){
//            throw new AutomovelNullExecption("Objeto Nulo, necessario associar um objeto automóvel na locação");
//        }
//
//        if(automoveis.isEmpty()){
//            throw new AutomovelNullExecption("Nõa pode fazer uma solicitação sem Automoveis");
//        }

        this.dataLocacao = LocalDateTime.now();
        this.locatario = locatario;
        this.automoveis =automoveis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Set<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomovel(Automovel automovel) {
        this.automoveis.add(automovel);
    }

    public void setAutomoveis(Set<Automovel> automoveis) {
        this.automoveis= automoveis;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }


    @Override
    public void impressao() {
        System.out.println("#usuario");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "descricao='" + descricao + '\'' +
                ", dataLocacao=" + dataLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", web=" + web +
                ", locatario=" + locatario +
                ", automoveis=" + automoveis +
                '}';
    }

    public Locacao(Integer id, String descricao, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, boolean web, Locatario locatario, Set<Automovel> automoveis) {
        this.id = id;
        this.descricao = descricao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.web = web;
        this.locatario = locatario;
        this.automoveis = automoveis;
    }



}
