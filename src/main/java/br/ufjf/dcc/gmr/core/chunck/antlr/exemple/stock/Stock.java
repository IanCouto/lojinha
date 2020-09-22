/*
 * To change Stock license header, choose License Headers in Project Properties.
 * To change Stock template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onofre
 */
public class Stock {

    private static List< Product> products;
    private static List< Integer> quantitys;

    public Stock() {
        Stock.products = new ArrayList<>();
        Stock.quantitys = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {

        int controle = 0;
        for (int i = 0; i < Stock.products.size(); i++) {
            if (Stock.products.get(i).getId() == product.getId()) {
                Stock.quantitys.set(i, quantity + Stock.quantitys.get(i));
                controle++;
            }
        }
        if (controle == 0) {
            Stock.products.add(product);
            Stock.quantitys.add(quantity);
        }

    }

    public void removeProduct(Product product, int quantity) {
        for (int i = 0; i < Stock.products.size(); i++) {
            if (Stock.products.get(i).getId().equals(product.getId())) {
                if (quantity < Stock.quantitys.get(i)) {
                    Stock.quantitys.set(i, Stock.quantitys.get(i) - quantity);
                } else {
                    Stock.products.remove(i);
                    Stock.quantitys.remove(i);
                }
            }
        }
    }

    public boolean contain(Product product) {
        for (int i = 0; i < Stock.products.size(); i++) {
            if (Stock.products.get(i).getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public void imprime() {
        for (int i = 0; i < Stock.products.size(); i++) {
            System.out.println(Stock.products.get(i));
            System.out.println("Quantitidade: " + Stock.quantitys.get(i));
            System.out.println("");
        }
    }

}
