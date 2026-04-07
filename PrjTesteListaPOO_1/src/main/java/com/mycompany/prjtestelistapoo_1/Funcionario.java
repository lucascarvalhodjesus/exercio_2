/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjtestelistapoo_1;

/**
 *
 * @author carlos
 */
class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public String toString()
    {
        return "Funcionario{nome'" + nome + "', salario="+ salario + "}";
    }
    
}
