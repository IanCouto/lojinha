/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.JanelaAbas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ButtonRegisterStock implements ActionListener {

    private JanelaAbas panel;
    private JTable table;
    private DefaultTableModel model;

    public ButtonRegisterStock(JanelaAbas panel) {
        this.panel = panel;
        this.table = panel.getTableStock();
        this.model = (DefaultTableModel) this.table.getModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            this.panel.addProduct();
            String name = this.panel.getLineProductName().getText();
            String id = this.panel.getLineId().getText();
            String price = this.panel.getLinePrice().getText();
            String quantity = this.panel.getLineQuantity().getText();

            Object[] row = {name, id, price, quantity};
            this.model.addRow(row);

            this.panel.getLineProductName().setText("");
            this.panel.getLineId().setText("");
            this.panel.getLinePrice().setText("");
            this.panel.getLineQuantity().setText("");

        } catch (Exception ex) {
        }
    }
}
