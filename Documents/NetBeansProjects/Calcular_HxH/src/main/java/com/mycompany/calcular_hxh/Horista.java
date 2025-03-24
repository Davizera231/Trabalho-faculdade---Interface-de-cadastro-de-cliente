/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcular_hxh;

/**
 *
 * @author Davi
 */
public class Horista extends Empregado{
    
   private double horas; 
   
    
    public Horista(String nome, String endereco, double horas)
    {
        super(nome, endereco); 
        this.horas = horas; 
    
        
    }
    
    public void setHoras(double horas){
        this.horas = horas;
    }
    
    public double getHoras(){
        return horas;
    }
    
    @Override
    public void calcularSalario()
    {   
        salario = horas*50;
    }
    
}
