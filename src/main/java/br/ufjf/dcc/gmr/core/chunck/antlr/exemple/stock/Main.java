/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Adress;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Employee;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Person;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register.Register;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register.RegisterStock;
import java.util.Scanner;


/**
 *
 * @author onofre
 */
public class Main {
    
    public static void main(String[] args){
        
        Product teste = new Product();
        teste.create();
        teste.create();
        
        Stock stock = new Stock();
        stock.addProduct(teste, 3);
        stock.addProduct(teste,5);
        
        Adress ad1= new Adress();
        ad1.create();
        
        Person p1 = new Person();
        p1.create();
        
        Register r1 = new Register();
        r1.createIndividual();
        
        RegisterStock rg1 = new RegisterStock();
        //rg1.addRegister(r1);
        
        Employee el = new Employee();
        
        stock.imprime();
  
        Product product = new Product();
        product.create();
    }  
}
