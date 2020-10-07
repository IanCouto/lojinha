/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Person;
import java.util.Scanner;

/**
 *
 * @author onofre
 */
public class Register {

    private int date;
    private String email;
    private String password;
    private String phoneNumber;
    private String ddd;
    private Person person;
    
    public Register(){
        
    }

    public Register(int date, String email, String password, String phoneNumber, String ddd, Person person) {
        this.date = date;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ddd = ddd;
        this.person = person;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getPassword() {
//        return password;
//    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void createIndividual(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING REGISTER: ");
        System.out.println("Date: ");
        this.date = Integer.parseInt(teclado.nextLine());
        System.out.println("Email: ");
        this.email = teclado.nextLine();
        System.out.println("Password: ");
        this.password = teclado.nextLine();
        System.out.println("Phone Number: ");
        this.phoneNumber = teclado.nextLine();
        System.out.println("DDD: ");
        this.ddd = teclado.nextLine();
        Person aux = new Person();
        aux.create();
        this.person = aux;
    }
    
    public void imprime(){
        System.out.println("Date: " + this.date);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("DDD: " + this.ddd);
        System.out.println(this.person);
    }
}
