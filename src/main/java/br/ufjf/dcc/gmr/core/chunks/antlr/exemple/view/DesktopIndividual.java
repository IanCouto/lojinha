/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Adress;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Individual;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register.Register;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonRegisterIndividual;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class DesktopIndividual extends JFrame{
    private JanelaAbas frame;
    
    private JPanel panel;
    
    private JTextField lineCpf;
    private JTextField lineRg;
    private JTextField lineBirth;
    
    private JButton button;
    
    public DesktopIndividual(JanelaAbas frame) {
        this.frame = frame;
        
        this.panel = new JPanel();
        
        this.lineCpf = new JTextField("", 50);
        this.lineRg = new JTextField("", 50);
        this.lineBirth = new JTextField("", 50);
        
        this.button = new JButton("SUBMIT");
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
        this.panel.add(this.button);
    }
    
    public void paintFrame() {
        setLayout(new BorderLayout());
        setSize(new Dimension(700, 300));
        setVisible(true);
        
        paintPanel();
        paintButton();
        add(this.panel, BorderLayout.CENTER);
    }
    
    public void paintButton() {
        this.button.addActionListener(new ButtonRegisterIndividual(this.frame, this));
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
            Adress adress = new Adress(Integer.parseInt(this.frame.getLineNumber().getText()), this.frame.getLineStreet().getText(), this.frame.getLineNeighborhood().getText(), this.frame.getLineCep().getText(), this.frame.getLineCity().getText(), this.frame.getLineState().getText(), this.frame.getLineCountry().getText());
            Individual individual = new Individual(lineBirth.getText(), lineCpf.getText(), lineRg.getText(), this.frame.getLinePersonName().getText(), this.frame.getLineSurname().getText(), adress);
            Register register = new Register(0, this.frame.getLineEmail().getText(), this.frame.getLinePassword().getText(), this.frame.getLinePhoneNumber().getText(), this.frame.getLineDdd().getText(), individual);
        
            this.frame.getRegisterStock().addRegister(register);
        }
    }

    public JTextField getLineCpf() {
        return lineCpf;
    }

    public void setLineCpf(JTextField lineCpf) {
        this.lineCpf = lineCpf;
    }

    public JTextField getLineRg() {
        return lineRg;
    }

    public void setLineRg(JTextField lineRg) {
        this.lineRg = lineRg;
    }

    public JTextField getLineBirth() {
        return lineBirth;
    }

    public void setLineBirth(JTextField lineBirth) {
        this.lineBirth = lineBirth;
    }
}
