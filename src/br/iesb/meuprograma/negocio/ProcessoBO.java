/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;
import br.iesb.meuprograma.Entidades.Processo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AdrianaAguiar
 */
public class ProcessoBO implements BO<Processo>{

    @Override
    public void validar(Processo entidade) throws NegocioException {
        
        if(entidade.getId()==0){
            throw new NegocioException ("Campo ID é obrigatório.");
        }
   /*     if (entidade.getDataProcesso()== null || entidade.getDataProcesso().isEmpty()) {
            throw new NegocioException ("Campo Data Processo é obrigatório.");
        }
        if (entidade.getAssunto()== null || entidade.getAssunto().isEmpty()) {
            throw new NegocioException ("Campo Assunto é obrigatório.");
        }
        if (entidade.getDescricao()== null || entidade.getDescricao().isEmpty()) {
            throw new NegocioException ("Campo Descrição é obrigatório.");
        }
    }
    */
   
    }
    @Override
    public void inserir(Processo entidade) throws NegocioException {
    if(entidade.getId()==0){
            throw new NegocioException ("Campo ID é obrigatório.");
        }
    }

    @Override
    public void alterar(Processo entidade) throws NegocioException {
    
    }

    @Override
    public void excluir(Processo entidade) throws NegocioException {
        
    }

    @Override
    public Processo consultar(int id) throws NegocioException {
        Processo processo = new Processo ();
        return processo;
    }

    @Override
    public List<Processo> listar() throws NegocioException {
        List<Processo> lista = new ArrayList<Processo>();
        return lista;
    }
    
}
 