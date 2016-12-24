/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Interfaces;

import bibliotecaTSI.DataModel.Autor;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public interface AutorDAO extends GenericDAO<Autor>{
    public Autor buscarPorNome(String nome) throws SQLException;   
    
}
