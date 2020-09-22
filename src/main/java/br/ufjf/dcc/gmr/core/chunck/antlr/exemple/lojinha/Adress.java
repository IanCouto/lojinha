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
public class Adress {

    private int number;
    private String street;
    private String neighborhood;
    private String cep;
    private String city;
    private String state;
    private String country;

    public Adress() {

    }

    public Adress(int number, String street, String neighborhood, String cep, String city, String state, String contry) {
        this.number = number;
        this.street = street;
        this.neighborhood = neighborhood;
        this.cep = cep;
        this.city = city;
        this.state = state;
        this.country = contry;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContry() {
        return country;
    }

    public void setContry(String contry) {
        this.country = contry;
    }
    
    public void create() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING ADRESS: ");
        System.out.println("Number: ");
        this.number = Integer.parseInt(teclado.nextLine());
        System.out.println("Street: ");
        this.street = teclado.nextLine();
        System.out.println("Neighborhood: ");
        this.neighborhood = teclado.nextLine();
        System.out.println("Cep: ");
        this.cep = teclado.nextLine();
        System.out.println("City: ");
        this.city = teclado.nextLine();
        System.out.println("State: ");
        this.state = teclado.nextLine();
        System.out.println("Country: ");
        this.country = teclado.nextLine();
    }
    
    public void imprime(){
        System.out.println("Number: " + this.number);
        System.out.println("Street: "+ this.street);
        System.out.println("Neighborhood: " + this.neighborhood);
        System.out.println("Cep: " + this.cep);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Country: " + this.country);
    }
}
