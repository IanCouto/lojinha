/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.DesktopIndividual;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ButtonRegisterIndividual implements ActionListener {
    private JanelaAbas frame;
    private DesktopIndividual desktop;
    private JTable table;
    private DefaultTableModel model;
  
    public ButtonRegisterIndividual(JanelaAbas frame, DesktopIndividual desktop) {
        this.frame = frame;
        this.desktop = desktop;
        this.table = this.frame.getTableRegister();
        this.model = (DefaultTableModel) this.table.getModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.desktop.addIndividual();
            
            String name = this.frame.getLinePersonName().getText();
            String surname = this.frame.getLineSurname().getText();
            String email = this.frame.getLineEmail().getText();
            String phoneNumber = this.frame.getLinePhoneNumber().getText();
            
            Object[] row = {name, surname, email, phoneNumber};
            this.model.addRow(row);
            
            this.frame.getLineNumber().setText("");
            this.frame.getLineStreet().setText("");
            this.frame.getLineNeighborhood().setText("");
            this.frame.getLineCep().setText("");
            this.frame.getLineCity().setText("");
            this.frame.getLineState().setText("");
            this.frame.getLineCountry().setText("");
            this.frame.getLinePersonName().setText("");
            this.frame.getLineSurname().setText("");
            this.frame.getLineEmail().setText("");
            this.frame.getLinePassword().setText("");
            this.frame.getLineDdd().setText("");
            this.frame.getLinePhoneNumber().setText("");
            
            this.desktop.getLineCpf().setText("");
            this.desktop.getLineRg().setText("");
            this.desktop.getLineBirth().setText("");
            
        } 
        catch (Exception ex) {
        }
    }
}

