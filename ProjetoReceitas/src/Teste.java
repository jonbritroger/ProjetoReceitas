
import java.util.ArrayList;
import java.util.List;
import model.bean.Receita;
import model.dao.ReceitaDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauane P. Oliveira
 */
public class Teste {
    
    public static void main(String[] args) throws Exception{
       ReceitaDAO dao = new ReceitaDAO();
      
       Receita receita = new Receita();
        
       
//       receita.setNome("");
//       receita.setDescricao("ovo,farinha, água");
//      
//       dao.inserir(receita);
       
      /* Receita receita1 = new Receita();
        
       
       receita1.setNome("pão");
       receita1.setDescricao("farinha, agua, fermento");
       
        Receita receita2 = new Receita();
        
       
       receita2.setNome("bolo");
       receita2.setDescricao("farinha, ovo, açucar");
       */
       
     /* ReceitaDAO dao = new ReceitaDAO();
        List<Receita> receitas = null; 
        receitas = dao.listar("");
        for (Receita receita : receitas){
            System.out.println("id: " + receita.getId() + " nome: " + receita.getNome() + " descrição: " + receita.getDescricao());
       
     
        }*/
     
     
         
        
    }
            
}
