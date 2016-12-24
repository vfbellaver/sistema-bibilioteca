/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Interfaces;

import bibliotecaTSI.DataModel.CategoriaLivro;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public interface CategoriaLivroDAO extends GenericDAO<CategoriaLivro>{
      public CategoriaLivro buscarLivroPorNome(String nome) throws SQLException;
}