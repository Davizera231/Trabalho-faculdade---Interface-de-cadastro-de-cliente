/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia_semdao;

import java.sql.SQLException;
// import java.util.Scanner;

/**
 *
 * @author PTOLEDO
 */
public class Persistencia_SemDAO {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here 
        
        
        
        //entrada de dadps
        
      //  Scanner entrada_dados = new Scanner(System.in);
        
        
        
        
        Produto p = new Produto(); 
        //System.out.print("Delete a tabela.....");
        // p.setId(entrada_dados.nextInt());
    
        /*
        System.out.println("Escreva a descricao.....");
        p.setDescricao(entrada_dados.nextLine());
        
        System.out.println("Escreva o fornecedor.............");
        p.setFornecedor(entrada_dados.nextLine());
        
        System.out.println("Escreva a preco.....");
        p.setPreco(entrada_dados.nextDouble()); 
        
        System.out.println("Escreva a quantidade de estoque..");
        p.setQtdestoque(entrada_dados.nextInt());
        */
        
        //Precisa de uma variavel para armazenar a consulta em sql
        p = p.consultarById(5);
            
        
        if(p.getDescricao() != null){
            System.out.println("Id...." + p.getId());
            System.out.println("Descricao.." + p.getDescricao());
            System.out.println("Preco......" + p.getPreco());
        }else{
            System.out.println("Nao existe cadastro!!!");
        }
        
       
        
        try {
            
           // p.cadastrar();
           // p.deletar();
           // p.Update_product();
            p.getConexao();
           // System.out.println("Cadastrado com sucesso.");
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        

    }

}
