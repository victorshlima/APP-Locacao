package com.victation.AppLocacao.model.domain;

import com.victation.AppLocacao.interfaces.IPrinter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Locacao implements IPrinter {

    private String descricao;
    private LocalDateTime dataLocacao;
    private LocalDateTime dataDevolucao;
    private boolean web;
    private Locatario locatario;
    private Set<Automovel> automoveis = new HashSet<>();

    public Locacao(Locatario locatario) {
        this.dataLocacao = LocalDateTime.now();
        this.locatario = locatario;
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
}
