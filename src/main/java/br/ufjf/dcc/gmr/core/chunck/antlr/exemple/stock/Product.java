/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author onofre
 */
public class Product {

    private double price;
    private String name;
    private String id;

    public Product() {

    }

    public Product(double price, String name, String id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void create() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING PRODUCT: ");
        System.out.println("Name: ");
        this.name = teclado.nextLine();
        System.out.println("Id: ");
        this.id = teclado.nextLine();
        System.out.println("Price: ");
        this.price = Double.parseDouble(teclado.nextLine());
    }

    @Override
    public String toString() {
        return "\nNome: " + this.name + "\nId: " + this.id + "\nPrice: " + this.price;
    }
}
