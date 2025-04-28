/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia_semdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PTOLEDO
 */
public class Produto {

    private int id;
    private String descricao;
    private double preco;
    private int qtdestoque;
    private String fornecedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    } 
    
    //Adicionado para quantidade em estoque
    public void setQtdestoque(int qtdestoque){
        this.qtdestoque = qtdestoque;
    }
    
    //Adicionado para quantidade em estoque
    public int getQtdestoque(){
        return qtdestoque;
    }
    
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    
    public String getFornecedor(){
        return fornecedor;
    }

    
    
    
    public void cadastrar() throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produto(descricao, preco, qtdestoque, fornecedor) values(?,?,?,?)");
        comando.setString(1, descricao);
        comando.setDouble(2, preco);
        comando.setInt(3, qtdestoque);
        comando.setString(4, fornecedor);
        comando.execute();
        con.close();
    } 
    
    public void deletar() throws ClassNotFoundException, SQLException {
        Connection con = getConexao(); 
        PreparedStatement comando = con.prepareStatement("delete from produto where id = ?");
        comando.setInt(1,id);
        comando.execute();
        con.close();
    }
    
    public Produto consultarById(int id) throws ClassNotFoundException, SQLException {
        Connection con = getConexao(); 
        String SQL = "select * from produto where id = ?";
        PreparedStatement comando = con.prepareStatement(SQL);
        comando.setInt(1, id);
        ResultSet resultado = comando.executeQuery();
        Produto prod = new Produto();
        
        if (resultado.next()){
            prod.setId(resultado.getInt("id"));
            prod.setDescricao(resultado.getString("descricao"));
            prod.setPreco(resultado.getDouble("preco"));
        
        }
        con.close();
        return prod;
    }
    
    
    
    
    public void Update_product() throws ClassNotFoundException, SQLException {
        Connection con = getConexao(); 
        PreparedStatement comando = con.prepareStatement("update produto set descricao = ?, preco = ?, qtdestoque = ?, fornecedor = ? where id = ?");
        comando.setString(1, descricao);
        comando.setDouble(2, preco);
        comando.setInt(3, qtdestoque);
        comando.setString(4, fornecedor);
        comando.setInt(5, id);
        comando.execute();
        con.close();
    }
    

    public Connection getConexao() throws ClassNotFoundException, SQLException {
        //Database properties: verificar em seu computador
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/aula_ioo";
        String USER = "root";
        String PASSWORD = "";
        // O método forName carrega e inicia o driver passado por parâmetro
        Class.forName(DRIVER); 
        // Estabele a conexão
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
