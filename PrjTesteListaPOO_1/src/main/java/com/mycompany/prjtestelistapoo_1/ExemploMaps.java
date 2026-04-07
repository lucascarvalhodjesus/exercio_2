/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjtestelistapoo_1;
import java.util.HashMap;
import java.util.Map;


public class ExemploMaps { // chave e valor, map  e baseado nisso    
    public void exHashMapSimples()
    {
        Map<String, Integer> idades = new HashMap<>();
        idades.put("Joao",30);
        idades.put("Maria", 25);
        idades.put("Jose", 35);
        idades.put("Carlos",40);
        System.out.println("Mapa de idades: "+ idades);
        
        int idadePessoa1 = idades.get("Joao");
        System.out.println("A idade de Joao e: "+ idadePessoa1);
        Integer idadePessoa2 = idades.get("Pedro");
        System.out.println("A idade de Pedro e: "+ idadePessoa2);
        boolean contemKey = idades.containsKey("Maria");
        System.out.println("O mapa contem a chave de Maria? "+ contemKey);
        boolean contemIdade = idades.containsValue(40);
        System.out.println("O mapa contem a idade 40? "+ contemIdade);
        idades.remove("Jose");
        System.out.println("Mapa apos remover Jose: "+ idades);
        System.out.println("\n Iterando sobre as chaves e valores: ");
        for(Map.Entry<String, Integer> entry : idades.entrySet())
        {
            System.out.println("Chave: "+entry.getKey() + ", Valor: "+ entry.getValue());
        }
                
    }
    
    
    
    public void exHashMapComObjetos()
    {
        Map<String, Funcionario> funcionarios = new HashMap<>();
        funcionarios.put("Fun001", new Funcionario("Joao", 5000.00));
        funcionarios.put("Fun002", new Funcionario("Jose", 6500.00));
        funcionarios.put("Fun003", new Funcionario("Maria",4800.00));
        System.out.println("Mapa de Funcionarios: "+ funcionarios);
        String idParaBuscar = "Fun002";
        Funcionario funcionarioEncontrado = funcionarios.get(idParaBuscar);
        if(funcionarioEncontrado != null)
        {
            System.out.println("\nFuncionario encontrado com ID "+ idParaBuscar + ":");
            System.out.println(funcionarioEncontrado);
        }else{
            System.out.println("\nNenhum funcionario encontrado com ID "+ idParaBuscar);
        }
    }
    
}
