/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcular_hxh;

/**
 *
 * @author Davi
 */
public class Mensalista extends Empregado {
    
    private String cargo;
    
    
    public Mensalista(String nome, String endereco, String cargo)
    {
        
        super(nome, endereco);
        this.cargo = cargo;
      
    }
    
    @Override
    public void calcularSalario(){
        switch (cargo) {
            case "Junior":
                salario = 2500;
                break;
            case "Pleno":
                salario = 3500;
                break;
            case "Senior":
                salario = 5500;
                break;
        }
       
    }
    
    
    
    
    
    
    
    
    
}
