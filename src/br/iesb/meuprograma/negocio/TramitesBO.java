/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.Entidades.Tramites;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AdrianaAguiar
 */
public class TramitesBO implements BO<Tramites>{

    @Override
    public void validar(Tramites entidade) throws NegocioException {
      if (entidade.getIdUnidade() == 0 ){
        throw new NegocioException("Selecione alguma unidade na listagem ao lado") ; 
        }
    }
    @Override
    public void inserir(Tramites entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public void excluir(Tramites entidade) throws NegocioException {
         consultar (entidade.getIdProcesso(),entidade.getIdAssunto(),entidade.getIdUnidade());
    }

    public Tramites consultar(int IdProc,int IdAss, int IdUni) throws NegocioException {
        return new Tramites();
    }

    @Override
    public List<Tramites> listar() throws NegocioException {
        return new ArrayList<Tramites>();
    }

    @Override
    public void alterar(Tramites entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tramites consultar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
