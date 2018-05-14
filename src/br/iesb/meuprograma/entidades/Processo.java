/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.entidades;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Giovanna
 */
public class Processo {
     private Integer numeroProcesso;
    private File anexo;
    private String assunto;
    private String descricao;
    private Date dataProcesso;

    public Processo(){}
    
    public Processo(Integer numeroProcesso, File anexo, String situacao, String descricao, Date dataProcesso){
        this.numeroProcesso = numeroProcesso;
        this.anexo = anexo;
        this.assunto = situacao;
        this.descricao = descricao;
        this.dataProcesso = dataProcesso;
        
    }
    public Integer getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Integer numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public File getAnexo() {
        return anexo;
    }

    public void setAnexo(File anexo) {
        this.anexo = anexo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataProcesso() {
        return dataProcesso;
    }

    public void setDataProcesso(Date dataProcesso) {
        this.dataProcesso = dataProcesso;
    }
    
}


