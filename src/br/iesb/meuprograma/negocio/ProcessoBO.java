/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.negocio.BO;
import br.iesb.meuprograma.negocio.NegocioException;
import br.iesb.meuprograma.entidades.Processo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giovanna
 */
public class ProcessoBO implements BO<Processo>{
    

    @Override
    public void validar(Processo entidade) throws NegocioException {
        if (!entidade.getAssunto().isEmpty()){
        } else {
            throw new NegocioException("Campo Assunto é obrigatório");
        }
        if (entidade.getDescricao().isEmpty()){
            throw new NegocioException("Campo Descrição é obrigatório");
        }
        boolean isFile = entidade.getAnexo().isFile();
        boolean exists = entidade.getAnexo().exists();
        if (entidade.getAnexo()==null || !entidade.getAnexo().isFile()){
            throw new NegocioException("É obrigatório adicionar um anexo.");
        }
    }

    /**
     *
     * @param entidade
     * @throws NegocioException
     */
    public void salvar(Processo entidade) throws NegocioException {
        validar(entidade);
        entidade.setNumeroProcesso(0);
        consultar(entidade.getNumeroProcesso());
    }

    @Override
    public void excluir(Processo entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Processo consultar(int id) throws NegocioException {
        return new Processo();
    }

    @Override
    public List<Processo> listar() throws NegocioException {
        return new ArrayList<Processo>();
    }

    @Override
    public void inserir(Processo entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Processo entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

