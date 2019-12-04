
package br.com.leonardonowacki.barbearia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private Conexao() {}
    
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/barbearia","root","123");
    }
    
}
