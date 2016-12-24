/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Interfaces;

import bibliotecaTSI.DataModel.Livro;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public interface LivroDAO extends GenericDAO<Livro>{
    public Livro buscarLivroPorTitulo(String titulo) throws SQLException;
    
}
