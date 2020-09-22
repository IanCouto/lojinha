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
public class Individual extends Person {

    private int birthYear;
    private String cpf;
    private String rg;

    public Individual() {
        
    }

    public Individual(int birthYear, String cpf, String rg) {
        this.birthYear = birthYear;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Individual(int birthYear, String cpf, String rg, String name, String surname, Adress adress) {
        super(name, surname, adress);
        this.birthYear = birthYear;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void createIndividual(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING INDIVIDUAL: ");
        System.out.println("Birth year: ");
        this.birthYear = Integer.parseInt(teclado.nextLine());
        System.out.println("CPF: ");
        this.cpf = teclado.nextLine();
        System.out.println("RG: ");
        this.rg = teclado.nextLine();
        Person aux = new Person();
        aux.create();
        super.setName(aux.getName());
        super.setSurname(aux.getSurname());
        super.setAdress(aux.getAdress());
    }
}
