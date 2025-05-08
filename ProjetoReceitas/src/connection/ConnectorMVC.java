/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lauane P. Oliveira
 */
public class ConnectorMVC {
    
    public static Connection getConnnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar com.mysql.cj.jdbc.Driver");
            e.printStackTrace();
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoreceitas?allowPublicKeyRetrieval=true&useSSL=false", "Jonas", "1234");
        }catch (SQLException e) {
            System.out.println("Erro ao iniciar conexão");
            e.printStackTrace();
        }
        return conn;
    }


}
