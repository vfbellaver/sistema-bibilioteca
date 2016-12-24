/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Implements;

import bibliotecaTSI.DataModel.Cliente;
import bibliotecaTSI.DataModel.Livro;
import bibliotecaTSI.Interfaces.LivroDAO;
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
public class LivroDAOImp extends GenericDAOImp<Livro> implements LivroDAO{
    private FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager EntManager = fabGerEntidades.getEntityManager();
    
    @Override
    public Livro buscarLivroPorTitulo(String titulo) throws SQLException {
         Query query = EntManager.createQuery("SELECT l FROM Livro l WHERE l.nome LIKE :titulo");
        query.setParameter("titulo", titulo);
        return (Livro) query.getSingleResult();
    }
    
     public List<Livro> listarTodos(Livro c) throws SQLException {
        return listarTodos(Livro.class);
    }

}

   