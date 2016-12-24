/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Implements;

import bibliotecaTSI.DataModel.Autor;
import bibliotecaTSI.DataModel.Cliente;
import bibliotecaTSI.Interfaces.AutorDAO;
import bibliotecaTSI.Util.ConnectionFactory;
import bibliotecaTSI.Util.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author PC
 */
public class AutorDAOImp extends GenericDAOImp<Autor> implements AutorDAO{
     private FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager EntManager = fabGerEntidades.getEntityManager();


    @Override
    public Autor buscarPorNome(String nome) throws SQLException {
        Query query = EntManager.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :nome");
        query.setParameter("nome", nome);
        return (Autor) query.getSingleResult();
    }
    
     public List<Autor> listarTodos(Autor c) throws SQLException {
        return listarTodos(Autor.class);
    }
   
     
}
