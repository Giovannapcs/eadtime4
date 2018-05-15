
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.ListagemAssuntos;
import java.util.ArrayList;
import java.util.List;


public class ListagemAssuntosBO implements BO<ListagemAssuntos> {

    @Override
    public void validar(ListagemAssuntos entidade) throws NegocioException {
        if (entidade.getAssunto() == null) {
          throw new NegocioException("Por favor selecione um assunto");  
        }
    }

    @Override
    public void inserir(ListagemAssuntos entidade) throws NegocioException {
        validar(entidade);
    }

    @Override
    public void alterar(ListagemAssuntos entidade) throws NegocioException {
        validar(entidade);
        consultar(entidade.getId());
       
    }

    @Override
    public void excluir(ListagemAssuntos entidade) throws NegocioException {
        consultar(entidade.getId());
        
    }

    @Override
    public ListagemAssuntos consultar(int id) throws NegocioException {
        return new ListagemAssuntos ();
    }

    @Override
    public List<ListagemAssuntos> listar() throws NegocioException {
        return new ArrayList<ListagemAssuntos>();
        
    }
    
}
