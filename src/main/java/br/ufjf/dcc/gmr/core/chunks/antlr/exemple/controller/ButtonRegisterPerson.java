/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author DELL
 */
public class ButtonRegisterPerson implements ActionListener {
    private JanelaAbas frame;
    private int num;
    
    
    public ButtonRegisterPerson(JanelaAbas panel, int num) {
        this.frame = panel;
        this.num = num;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.frame.addPerson(num);
        } 
        catch (Exception ex) {
        }
    }
}
