package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class JanelaAbas extends JFrame {

    private JTabbedPane tabbedPane;
    
    private JPanel panelRegisterProduct;
    
    private JTextField lineProductName;
    private JTextField lineId;
    private JTextField linePrice;
    private JTextField lineQuantity;
    
    private JButton buttonRegisterProduct;
            
    private JPanel panelBlue;
    
    private JPanel panelRegisterIndividual;
    private JPanel panelRegisterLegalEntity;
    
    private JTextField lineNumber;
    private JTextField lineStreet;
    private JTextField lineNeighborhood;
    private JTextField lineCep;
    private JTextField lineCity;
    private JTextField lineState;
    private JTextField lineCountry;
    
    private JTextField lineEmail;
    private JTextField linePassword;
    private JTextField lineDdd;
    private JTextField linePhoneNumber;
    
    private JTextField linePersonName;
    private JTextField lineSurname;
    
    private JTextField lineCpf;
    private JTextField lineRg;
    private JTextField lineBirthYear;
    
    private JButton buttonRegisterIndividual;
    private JButton buttonRegisterLegalEntity;

    public JanelaAbas() {
        this.tabbedPane = new JTabbedPane();
        
        this.panelRegisterProduct = new JPanel();
        this.lineProductName = new JTextField("", 50);
        this.lineId = new JTextField("", 50);
        this.linePrice = new JTextField("", 50);
        this.lineQuantity = new JTextField("", 50);
        
        this.buttonRegisterProduct = new JButton("REGISTER PRODUCT");
        
        this.lineNumber = new JTextField("", 50);
        this.lineStreet = new JTextField("", 50);
        this.lineNeighborhood = new JTextField("", 50);
        this.lineCep = new JTextField("", 50);
        this.lineCity = new JTextField("", 50);
        this.lineState = new JTextField("", 50);
        this.lineCountry = new JTextField("", 50);
        
        this.lineEmail = new JTextField("", 50);
        this.linePassword = new JTextField("", 50);
        this.lineDdd = new JTextField("", 50);
        this.linePhoneNumber = new JTextField("", 50);
        
        this.linePersonName = new JTextField("", 50);
        this.lineSurname = new JTextField("", 50);
        
        this.lineCpf = new JTextField("", 50);
        this.lineRg = new JTextField("", 50);
        this.lineBirthYear = new JTextField("", 50);
        
        this.buttonRegisterIndividual = new JButton("REGISTER INDIVIDUAL");
        this.buttonRegisterLegalEntity = new JButton("REGISTER LEGAL ENTITY");
        
        this.panelBlue = new JPanel();
        this.panelRegisterIndividual = new JPanel();
        this.panelRegisterLegalEntity = new JPanel();
        
    }

    private void paintTabbedPane() {
        this.tabbedPane.addTab("REGISTER PRODUCT", this.panelRegisterProduct);
        this.tabbedPane.addTab("AZUL", this.panelBlue);
        this.tabbedPane.addTab("REGISTER INDIVIDUAL", this.panelRegisterIndividual);
        this.tabbedPane.addTab("REGISTER LEGAL ENTITY", this.panelRegisterLegalEntity);
    }

    private void paintPanelRegisterProduct() {
        this.panelRegisterProduct.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(10, 1));
        panel.setPreferredSize(new Dimension(500, 300));

        JPanel gap1 = new JPanel(new BorderLayout());
        gap1.setPreferredSize(new Dimension(300, 250));
        gap1.setBackground(Color.RED);

        JPanel gap2 = new JPanel(new BorderLayout());
        gap2.setPreferredSize(new Dimension(600, 300));
        gap2.setBackground(Color.blue);
        
        JLabel label1 = new JLabel("NAME:");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
            
        JLabel label2 = new JLabel("ID:");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label3 = new JLabel("PRICE:");
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label4 = new JLabel("QUANTITY:");
        label4.setVerticalAlignment(SwingConstants.BOTTOM);   
        
        JLabel label5 = new JLabel("");

        panel.add(label1);
        panel.add(this.lineProductName);
        panel.add(label2);
        panel.add(this.lineId);
        panel.add(label3);
        panel.add(this.linePrice);
        panel.add(label4);
        panel.add(this.lineQuantity);
        panel.add(label5);
        panel.add(this.buttonRegisterProduct);

        this.panelRegisterProduct.add(panel, BorderLayout.WEST);
        this.panelRegisterProduct.add(gap1, BorderLayout.SOUTH);
        this.panelRegisterProduct.add(gap2, BorderLayout.CENTER);

    }
    
    private void paintButtonRegisterProduct() {
        this.buttonRegisterProduct.setPreferredSize(new Dimension(10, 10));
    }
    
    private void paintPanelBlue() {
      Object [][] data = {
          {"qwe", "qwe", "asd", "12"}
      }; 
        
      String [] nome = {"name", "id", "price", "quantity"};
        
      JTable table = new JTable(data, nome);
      JScrollPane pane = new JScrollPane(table);
      
      this.panelBlue.add(pane);
    }

    private void paintPanelRegisterPerson() {
        this.panelRegisterIndividual.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(20, 1));
        panel.setPreferredSize(new Dimension(500, 300));
        
        JPanel panel2 = new JPanel(new GridLayout(20, 1));
        panel2.setPreferredSize(new Dimension(500, 300));

        JPanel gap2 = new JPanel(new BorderLayout());
        gap2.setPreferredSize(new Dimension(375, 300));
        
        JLabel label1 = new JLabel("NUMBER:");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label2 = new JLabel("STREET:");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label3 = new JLabel("NEIGHBORHOOD:");
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label4 = new JLabel("CEP:");
        label4.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label5 = new JLabel("CITY:");
        label5.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label6 = new JLabel("STATE:");
        label6.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label7 = new JLabel("COUNTRY:");
        label7.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label8 = new JLabel("NAME:");
        label8.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label9 = new JLabel("SURNAME:");
        label9.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label10 = new JLabel("CPF:");
        label10.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label11 = new JLabel("RG:");
        label11.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label12 = new JLabel("BIRTH YEAR:");
        label12.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label13 = new JLabel("EMAIL:");
        label13.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label14 = new JLabel("PASSWORD:");
        label14.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label15 = new JLabel("DDD:");
        label15.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JLabel label16 = new JLabel("PHONE NUMBER:");
        label16.setVerticalAlignment(SwingConstants.BOTTOM);
        
        panel.add(label1);
        panel.add(this.lineNumber);
        panel2.add(label2);
        panel2.add(this.lineStreet);
        
        panel.add(label3);
        panel.add(this.lineNeighborhood);
        panel2.add(label4);
        panel2.add(this.lineCep);
        
        panel.add(label5);
        panel.add(this.lineCity);
        panel2.add(label6);
        panel2.add(this.lineState);
        
        panel.add(label7);
        panel.add(this.lineCountry);
        panel2.add(new JLabel(""));
        panel2.add(new JLabel(""));
        
        panel.add(label8);
        panel.add(this.linePersonName);
        panel2.add(label9);
        panel2.add(this.lineSurname);
        
        panel.add(label10);
        panel.add(this.lineCpf);
        panel2.add(label11);
        panel2.add(this.lineRg);
        
        panel.add(label12);
        panel.add(this.lineBirthYear);
        panel2.add(new JLabel(""));
        panel2.add(new JLabel(""));
        
        panel.add(label13);
        panel.add(this.lineEmail);
        panel2.add(label14);
        panel2.add(this.linePassword);
        
        panel.add(label15);
        panel.add(this.lineDdd);
        panel2.add(label16);
        panel2.add(this.linePhoneNumber);
        
        panel.add(new JLabel(""));
        panel.add(this.buttonRegisterIndividual);
        panel2.add(new JLabel(""));
        panel2.add(new JLabel(""));
        
        this.panelRegisterIndividual.add(panel, BorderLayout.WEST);
        this.panelRegisterIndividual.add(panel2, BorderLayout.CENTER);
        this.panelRegisterIndividual.add(gap2, BorderLayout.EAST);
        
    }

    private void paintPanel() {
        paintPanelRegisterProduct();
        paintPanelBlue();
        paintPanelRegisterPerson();
    }

    private void paintFrame() {
        paintPanel();
        paintTabbedPane();
        paintButtonRegisterProduct();

        this.add(this.tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        JanelaAbas janelaAbas = new JanelaAbas();

        janelaAbas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaAbas.setExtendedState(MAXIMIZED_BOTH);
        janelaAbas.setLayout(new BorderLayout());
        janelaAbas.paintFrame();

        janelaAbas.setVisible(true);
    }
}
