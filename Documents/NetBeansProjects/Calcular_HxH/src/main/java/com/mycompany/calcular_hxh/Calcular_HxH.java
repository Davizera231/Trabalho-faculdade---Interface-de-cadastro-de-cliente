/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcular_hxh;

/**
 *
 * @author Davi
 */
public class Calcular_HxH {

    public static void main(String[] args) {
      
        
      Empregado calcularSalario;
      Mensalista  mensalista;
      Horista  horista; 
        
      
      
      //Criar Mensalista
      
      mensalista = new Mensalista("Joao", "Rua dos testes", "Junior"); 
      
      //Apontar Empregado para Mensalista
      
      calcularSalario = mensalista; 
      calcularSalario.calcularSalario();
      calcularSalario.calcularINSS();
      calcularSalario.calcularIPRF(); 
      
      
      
      System.out.println("Nome:"+mensalista.getNome());
      System.out.println("Endereco:"+mensalista.getEndereco());
      System.out.println("Salario:"+mensalista.getSalario());
      
      //Criar Horista 
      
      horista = new Horista("Joao", "Rua dos testes", 100); 
      
      calcularSalario = horista; 
      calcularSalario.calcularSalario();
      calcularSalario.calcularINSS();
      calcularSalario.calcularIPRF(); 
      
      
      System.out.println("Nome:"+horista.getNome());
      System.out.println("Endereco:"+horista.getEndereco());
      System.out.println("Salario:"+horista.getSalario());
      
      
      
      
      
      
      
        
    }
}
