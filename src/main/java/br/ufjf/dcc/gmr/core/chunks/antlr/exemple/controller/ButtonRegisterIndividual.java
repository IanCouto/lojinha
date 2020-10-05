/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.DesktopIndividual;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ButtonRegisterIndividual implements ActionListener {
    private JanelaAbas panel;
    private JTable table;
    private DefaultTableModel model;
    
    
    public ButtonRegisterIndividual(JanelaAbas panel) {
        this.panel = panel;
        //this.table = panel.getTableStock();
        //this.model = (DefaultTableModel) this.table.getModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.panel.addPerson();
            
            this.panel.getLineNumber().setText("");
            this.panel.getLineStreet().setText("");
            this.panel.getLineNeighborhood().setText("");
            this.panel.getLineCep().setText("");
            this.panel.getLineCity().setText("");
            this.panel.getLineState().setText("");
            this.panel.getLineCountry().setText("");
            this.panel.getLinePersonName().setText("");
            this.panel.getLineSurname().setText("");
            this.panel.getLineEmail().setText("");
            this.panel.getLinePassword().setText("");
            this.panel.getLineDdd().setText("");
            this.panel.getLinePhoneNumber().setText("");
            
        } catch (Exception ex) {
            System.out.println("ERRROOO");
        }
    }
}
