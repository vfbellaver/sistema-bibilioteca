/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaTSI.Interfaces;

import bibliotecaTSI.DataModel.Cliente;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public interface ClienteDAO extends GenericDAO<Cliente>{
    public Cliente buscarClientePorCPF(String cpf) throws SQLException;
   
   
}
