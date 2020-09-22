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
public class LegalEntity extends Person {
    
    private String cnpj;
    private String boss; 
    
    public LegalEntity(){
        
    }

    public LegalEntity(String cnpj) {
        this.cnpj = cnpj;
    }

    public LegalEntity(String cnpj, String name, String surname, Adress adress) {
        super(name, surname, adress);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void createLegalEntity(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING LEGAL ENTITY: ");
        System.out.println("CNPJ: ");
        this.cnpj = teclado.nextLine();
        System.out.println("Boss: ");
        this.boss = teclado.nextLine();
        Person aux = new Person();
        aux.create();
        super.setName(aux.getName());
        super.setSurname(aux.getSurname());
        super.setAdress(aux.getAdress());
    }
    
    public void imprime(){
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Boss: " + this.boss);
        System.out.println("Name: " + super.getName());
        System.out.println("Surname: " + super.getSurname());
        System.out.println("Adress: ");
        super.getAdress().imprime();
    }
    
}
