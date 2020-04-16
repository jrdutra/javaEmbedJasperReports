/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojasperreports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionFactory {
     
    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/gestaoPessoal"; //Nome da base de dados
        String user = "jrdutra"; //nome do usuário do MySQL
        String password = "Jrcdutra1"; //senha do MySQL
         
        Connection conexao = null;
        conexao = DriverManager.getConnection(url, user, password);
         
        return conexao;
    }
}
