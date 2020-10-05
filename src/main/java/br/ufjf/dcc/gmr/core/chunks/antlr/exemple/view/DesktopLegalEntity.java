/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class DesktopLegalEntity extends JFrame{
    private JPanel panel;
    
    private JTextField lineCnpj;
    private JTextField lineBoss;
    
    public DesktopLegalEntity(){
        this.panel = new JPanel();
        
        this.lineCnpj = new JTextField("",50);
        this.lineBoss = new JTextField("",50);
    }
    
    public void addLegalEntity() throws Exception {
        if (lineCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineBoss.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        }else {
            
        }
    }
    
    private void paintPanel(){
        this.panel.setLayout(new GridLayout(6,1));
        
        JLabel label1 = new JLabel("CNPJ: ");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label2 = new JLabel("BOSS: ");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        
        this.panel.add(label1);
        this.panel.add(this.lineCnpj);
        this.panel.add(label2);
        this.panel.add(this.lineBoss);
        this.panel.add(new JLabel(""));
        this.panel.add(new JButton("TESTE"));
    }
    
    public void paintFrame(){
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 300));
        setVisible(true);
        
        paintPanel();
        add(this.panel, BorderLayout.CENTER);
    }
}
