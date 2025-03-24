/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcular_hxh;

/**
 *
 * @author Davi
 */
public class Empregado {
    
    protected String nome; 
    protected String endereco; 
    protected double salario; 
    
    
    
    //metodo construtor
    
    public Empregado(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        
    } 
    
    
    //metodos de acesso
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco; 
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public double getSalario(){
        return salario;
    }
        
        
    
    public void calcularSalario(){
    
  
    }
    
    
    
    public double calcularINSS(){
        double Calculo_INSS;
        
        Calculo_INSS = salario * 0.11;
        
        return(Calculo_INSS);
    }
    
    public double calcularIPRF(){
        double Const_auxiliar;
        
        if(salario < 1800){
            Const_auxiliar = salario * 0.1;
        }else{
            Const_auxiliar = salario * 0.27;
        }
        return(Const_auxiliar);
        
    }
    
   
}
