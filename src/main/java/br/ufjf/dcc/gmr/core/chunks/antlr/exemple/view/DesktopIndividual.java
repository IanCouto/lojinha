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
public class DesktopIndividual extends JFrame{
    private JPanel panel;
    
    private JTextField lineCpf;
    private JTextField lineRg;
    private JTextField lineBirth;
    
    public DesktopIndividual() {
        this.panel = new JPanel();
        
        this.lineCpf = new JTextField("", 50);
        this.lineRg = new JTextField("", 50);
        this.lineBirth = new JTextField("", 50);
    }
    
    public void addIndividual() throws Exception {
        if (lineBirth.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        }else if (lineRg.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        }
        else {
            
        }
    }
    
    private void paintPanel()  {
        this.panel.setLayout(new GridLayout(8,1));
        
        JLabel label1 = new JLabel("CPF:");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label2 = new JLabel("RG:");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label3 = new JLabel("BIRTH:");
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        
        this.panel.add(label1);
        this.panel.add(this.lineCpf);
        this.panel.add(label2);
        this.panel.add(this.lineRg);
        this.panel.add(label3);
        this.panel.add(this.lineBirth);
        this.panel.add(new JLabel(""));
        this.panel.add(new JButton("TESTE"));
    }
    
    public void paintFrame() {
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 300));
        setVisible(true);
        
        paintPanel();
        add(this.panel, BorderLayout.CENTER);
    }
}
