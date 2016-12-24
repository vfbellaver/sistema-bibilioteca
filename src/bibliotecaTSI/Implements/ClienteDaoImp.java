/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Implements;

import bibliotecaTSI.DataModel.Cliente;
import bibliotecaTSI.DataModel.Livro;
import bibliotecaTSI.Interfaces.ClienteDAO;
import bibliotecaTSI.Util.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class ClienteDaoImp extends GenericDAOImp<Cliente> implements ClienteDAO{
    private FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager EntManager = fabGerEntidades.getEntityManager();
    
    public Livro buscarLivroPorTitulo(String nome) throws SQLException {
         Query query = EntManager.createQuery("SELECT c FROM Cliente c WHERE c.Nome LIKE :nome");
    query.setParameter("Nome", nome);
        return (Livro) query.getSingleResult();
    }
    
     public List<Cliente> listarTodos(Cliente c) throws SQLException {
        return listarTodos(Cliente.class);
    }

    @Override
    public Cliente buscarClientePorCPF(String cpf) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

   
    
}
