/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.ReceitaController;
import java.util.List;
import model.bean.Receita;
import model.dao.ReceitaDAO;

public class ReceitaController {

    public boolean inserir(String nome, String descricao) throws Exception {
        nome = nome.trim();
        descricao = descricao.trim();
        System.out.println("nome" + nome +".");
        if ((!nome.equals("")) && (!descricao.equals(""))) {

            Receita receita = new Receita(nome, descricao);
            ReceitaDAO dao = new ReceitaDAO();
            dao.inserir(receita);

            return true;
        }
        return false;
        
    }

    public void deletar(int id) throws Exception {
        
            ReceitaDAO dao = new ReceitaDAO();
            dao.deletar(id);

        }
       
        
    public boolean alterar(int id, String nome, String descricao) throws Exception {
        nome = nome.trim();
        descricao = descricao.trim();
        if((!nome.equals(""))&& (!descricao.equals(""))){
            Receita receita = new Receita(id,nome,descricao);
            ReceitaDAO dao = new ReceitaDAO();
            dao.alterar(receita);
            
            return true;
        }
        
       return false; 
    }

    public List<Receita> listar(String st) throws Exception {
       
        ReceitaDAO dao = new ReceitaDAO();
        
        
        return dao.listar(st);
    }
}
