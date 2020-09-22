/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha;

import java.util.Scanner;

/**
 *
 * @author onofre
 */
public class Person {
    
    private String name;
    private String surname;
    private Adress adress;
    
    public Person(){
        
    }

    public Person(String name, String surname, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    
    public void create() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING PERSON");
        System.out.println("Name: ");
        this.name = teclado.nextLine();
        System.out.println("Surname: ");
        this.surname = teclado.nextLine();
        Adress aux = new Adress();
        aux.create();
        this.adress = aux;
    }
    
    public void imprimeName(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Adress: ");
        this.adress.imprime();
    }
}
