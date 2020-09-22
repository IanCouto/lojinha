/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.register.RegisterStock;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock.Product;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock.Stock;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author onofre
 */
public class Employee extends Person {

    private String position;
    private int salary;
    
    public Employee(){
        
    }

    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String position, int salary, String name, String surname, Adress adress) {
        super(name, surname, adress);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void purchase(Product product, int quantity){
        Stock stock = new Stock();
        stock.addProduct(product, quantity);
    }
    
    public void sale(Register register, RegisterStock registerStock, Product product, Stock stock, int quantity){
        if(registerStock.contain(register))
            stock.removeProduct(product,quantity);
        else{
            //System.out.printl("SEM REGISTRO")
            registerStock.addRegister(register);
            this.sale(register, registerStock, product, stock, quantity);
        }
    }
    
    public void createEmployee(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CREATING EMPLOYEE: ");
        System.out.println("Position: ");
        this.position = teclado.nextLine();
        System.out.println("Salary: ");
        this.salary = Integer.parseInt(teclado.nextLine());
        Person aux = new Person();
        aux.create();
        super.setName(aux.getName());
        super.setSurname(aux.getSurname());
        super.setAdress(aux.getAdress());
       
    }
    
    public void imprime(){
        System.out.println("Position: " + this.position);
        System.out.println("Salary: " + this.salary);
        System.out.println("Name: " + super.getName());
        System.out.println("Surname: " + super.getSurname());
        System.out.println("Adress: ");
        super.getAdress().imprime();
    }
}
