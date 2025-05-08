/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import connection.ConnectorMVC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Receita;

/**
 *
 * @author Jonas
 */
public class ReceitaDAO {
    
 public void inserir (Receita receita) throws Exception{
     
     String sql = "insert into receita (receita, descricao) value (?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectorMVC().getConnnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, receita.getNome());
            pStatement.setString(2, receita.getDescricao());
            pStatement.execute();

        } catch (SQLException e) {
            throw new Exception("Erro no insert do cliente " + e);

        } finally {

            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar pStatiment do insert " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar connection do insert " + e);

            }
        }
     
 }
 
 public void deletar (int id) throws Exception{
     
      String sql = "delete from receita where id = ? ";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectorMVC().getConnnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, id);
            pStatement.execute();

        } catch (SQLException e) {
            throw new Exception("Erro no insert do cliente " + e);

        } finally {

            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar pStatiment do insert " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar connection do insert " + e);

            }
        }
     
 } 
 
 public void alterar (Receita receita) throws Exception{
     
      String sql = "update receita set  receita = ?, descricao = ? where id = ? ";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectorMVC().getConnnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, receita.getNome());
            pStatement.setString(2, receita.getDescricao());
            pStatement.setInt(3, receita.getId());
            pStatement.execute();

        } catch (SQLException e) {
            throw new Exception("Erro no insert do cliente " + e);

        } finally {

            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar pStatiment do insert " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar connection do insert " + e);

            }
        }
     
 }
 
 public List<Receita> listar (String nome) throws Exception{
     
     String sql = "select * From receita where receita like '%" + nome + "%' order by id";
        PreparedStatement pStatement = null;
        Connection connection = null;
        ArrayList<Receita> receitas = new ArrayList<Receita>();

        try {
            connection = new ConnectorMVC().getConnnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if (rs != null){
                
                while (rs.next()){
                    Receita receita = new Receita();
                    receita.setId(rs.getInt("id"));
                    receita.setNome(rs.getString("receita"));
                    receita.setDescricao(rs.getString("descricao"));
                    receitas.add(receita);
                }
            }
        } catch (SQLException e) {
            throw new Exception("Erro no selectcliente " + e);

        } finally {

            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar pStatiment do select " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar connection do select " + e);

            }
        }
        
        return receitas;
     
    
 }

 
}
