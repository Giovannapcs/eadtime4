/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.Entidades;

/**
 *
 * @author AdrianaAguiar
 */
public class Tramites {
    
private int idProcesso; 
private int idAssunto;
private int idUnidade;

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }
    public void setIdProcesso(String idProcesso) {
       try{
           this.idProcesso = Integer.valueOf(idProcesso) ;
       }catch(NumberFormatException e){
         this.idProcesso=0;  
       }
    }
    public int getIdAssunto() {
        return idAssunto;
    }

    public void setIdAssunto(int idAssunto) {
        this.idAssunto = idAssunto;
    }
    
    public void setIdAssunto(String idAssunto) {
       try{
           this.idAssunto = Integer.valueOf(idAssunto) ;
       }catch(NumberFormatException e){
         this.idAssunto=0;  
       }
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }
    public void setIdUnidade(String idUnidade) {
       try{
           this.idUnidade = Integer.valueOf(idUnidade) ;
       }catch(NumberFormatException e){
         this.idUnidade=0;  
       }
    }
 
}
