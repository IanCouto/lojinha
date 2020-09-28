/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ButtonRegisterStock implements ActionListener{
    private JanelaAbas panel;

    public ButtonRegisterStock(JanelaAbas panel) {
        this.panel = panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.panel.addProduct();
        } catch (Exception ex) {
            Logger.getLogger(ButtonRegisterStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
