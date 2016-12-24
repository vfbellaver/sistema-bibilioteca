/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Implements;

import bibliotecaTSI.DataModel.CategoriaLivro;
import bibliotecaTSI.Interfaces.CategoriaLivroDAO;
import bibliotecaTSI.Util.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
public class CategoriaLivroDAOImp extends GenericDAOImp<CategoriaLivro> implements CategoriaLivroDAO{
    private FabricaDeGerenciadorDeEntidade fabGerEntidades = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager EntManager = fabGerEntidades.getEntityManager();
    
    @Override
    public CategoriaLivro buscarLivroPorNome(String nome) throws SQLException {
       Query query = EntManager.createQuery("SELECT c FROM CategoriaLivro c WHERE c.nome LIKE :nome");
        query.setParameter("nome", nome);
        return (CategoriaLivro) query.getSingleResult();
    }
    
}
