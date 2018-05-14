
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.ListagemUnidades;
import java.util.List;


public class ListagemUnidadesBO implements BO<ListagemUnidades> {

    @Override
    public void validar(ListagemUnidades entidade) throws NegocioException {
        if (entidade.getUnidade()== null){
            throw new NegocioException("Campo Unidade vazio"); 
        }
        
        
    }

    @Override
    public void inserir(ListagemUnidades entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(ListagemUnidades entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(ListagemUnidades entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListagemUnidades consultar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ListagemUnidades> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
