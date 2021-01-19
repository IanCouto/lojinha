/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Adress;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.LegalEntity;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register.Register;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonRegisterLegalEntity;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class DesktopLegalEntity extends JFrame{
    
    private JanelaAbas frame;
    
    private JPanel panel;
    
    private JTextField lineCnpj;
    private JTextField lineBoss;
    
    private JButton button;
    
    public DesktopLegalEntity(JanelaAbas frame){
        this.frame = frame;
        
        this.panel = new JPanel();
        
        this.lineCnpj = new JTextField("",50);
        this.lineBoss = new JTextField("",50);
        
        this.button = new JButton("SUBMIT");
    }
    
    private void paintPanel(){
        System.out.println(JanelaAbas.stock.toString());
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
        this.panel.add(this.button);
    }
    
    public void paintFrame(){
        setLayout(new BorderLayout());
        setSize(new Dimension(700, 300));
        setVisible(true);
        
        paintPanel();
        paintButton();
        add(this.panel, BorderLayout.CENTER);
    }
    
    public void paintButton() {
        this.button.addActionListener(new ButtonRegisterLegalEntity(this.frame, this));
    }
    
    public void addLegalEntity() throws Exception {
        if (lineCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineBoss.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        }else {
            Adress adress = new Adress(Integer.parseInt(this.frame.getLineNumber().getText()), this.frame.getLineStreet().getText(), this.frame.getLineNeighborhood().getText(), this.frame.getLineCep().getText(), this.frame.getLineCity().getText(), this.frame.getLineState().getText(), this.frame.getLineCountry().getText());
            LegalEntity legalEntity = new LegalEntity(lineCnpj.getText(), lineBoss.getText(), this.frame.getLinePersonName().getText(), this.frame.getLineSurname().getText(), adress);
            Register register = new Register(0, this.frame.getLineEmail().getText(), this.frame.getLinePassword().getText(), this.frame.getLinePhoneNumber().getText(), this.frame.getLineDdd().getText(), legalEntity);
        
            this.frame.getRegisterStock().addRegister(register);
        }
    }

    public JTextField getLineCnpj() {
        return lineCnpj;
    }

    public void setLineCnpj(JTextField lineCnpj) {
        this.lineCnpj = lineCnpj;
    }

    public JTextField getLineBoss() {
        return lineBoss;
    }

    public void setLineBoss(JTextField lineBoss) {
        this.lineBoss = lineBoss;
    }
}
