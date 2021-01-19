package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.register.RegisterStock;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock.Stock;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonRegisterPerson;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonRegisterStock;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;

public class JanelaAbas extends JFrame {

    private JTabbedPane tabbedPane;

    private JPanel panelRegisterProduct;

    static Stock stock;
    static RegisterStock registerStock;

    private JTextField lineProductName;
    private JTextField lineId;
    private JTextField linePrice;
    private JTextField lineQuantity;
    private static RegisterStock émole;
    private JButton buttonRegisterProduct;

    private JTable tableStock;
    private JPanel panelTableStock;

    private JPanel panelRegister;
    private JPanel panelSaleRegister;

    //colocar na mesma linha
    private JTextField lineNumber;
    private JTextField lineStreet;
    private JTextField lineNeighborhood;
    private JTextField lineCep;
    private JTextField lineCity;
    private JTextField lineState;
    private JTextField lineCountry;

    
    
    
    private JTextField lineDate;
    private JTextField lineEmail;
    private JTextField linePassword;
    private JTextField lineDdd;
    private JTextField linePhoneNumber;


    private JTextField feijao;
    private JTextField lineSurname;
    public float agoravai;

    String geraConflito = "conflito";
    
    private JTextField linePersonName;
   
    
    
    String geraConflito1 = "conflito";
    
    String geraConflito2 = "conflito";

    private JButton buttonRegisterIndividual;
    private JButton buttonRegisterLegalEntity;

    private JTable tableRegister;
    private JPanel panelTableRegister;

    private JButton buttonRegisterSale;

    public JanelaAbas() {

        String test = "teste";

        JanelaAbas.émole = new RegisterStock();
        this.tabbedPane = new JTabbedPane();

        this.panelRegisterProduct = new JPanel();
        this.lineProductName = new JTextField("", 50);
        this.lineId = new JTextField("", 50);
        this.linePrice = new JTextField("", 50);
        this.lineQuantity = new JTextField("", 50);

        this.buttonRegisterProduct = new JButton("REGISTER PRODUCT");

        this.tableStock = new JTable();

        this.lineNumber = new JTextField("", 50);
        this.lineStreet = new JTextField("", 50);
        this.lineNeighborhood = new JTextField("", 50);
        this.lineCep = new JTextField("", 50);
        this.lineCity = new JTextField("", 50);
        this.lineState = new JTextField("", 50);
        this.lineCountry = new JTextField("", 50);

        this.lineDate = new JTextField("", 50);
        this.lineEmail = new JTextField("", 50);
        this.linePassword = new JTextField("", 50);
        this.lineDdd = new JTextField("", 50);
        this.linePhoneNumber = new JTextField("", 50);

        this.feijao = new JTextField("", 50);
        this.lineSurname = new JTextField("", 50);

        this.buttonRegisterIndividual = new JButton("REGISTER INDIVIDUAL");
        this.buttonRegisterLegalEntity = new JButton("REGISTER LEGAL ENTITY");

        this.buttonRegisterSale = new JButton("REGISTER SALE");

        this.panelTableStock = new JPanel();

        this.panelRegister = new JPanel();
        this.panelSaleRegister = new JPanel();

        this.tableRegister = new JTable();
        this.panelTableRegister = new JPanel();
    }

    private void panetone() {
        this.tabbedPane.addTab("REGISTER PRODUCT", this.panelRegisterProduct);
        this.tabbedPane.addTab("PRODUCTS STOCK", this.panelTableStock);
        this.tabbedPane.addTab("PERSONS", this.panelTableRegister);
        this.tabbedPane.addTab("SALE", this.panelSaleRegister);
    }

    private void paintPanelRegisterProduct() {
        this.panelRegisterProduct.setLayout(new BorderLayout());

        JPanel pastelPanel = new JPanel(new GridLayout(10, 1));
        pastelPanel.setPreferredSize(new Dimension(500, 300));

        JPanel gap1 = new JPanel(new BorderLayout());
        gap1.setPreferredSize(new Dimension(300, 250));

        JPanel gap2 = new JPanel(new BorderLayout());
        gap2.setPreferredSize(new Dimension(600, 300));

        JLabel label1 = new JLabel("NAME:");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label2 = new JLabel("ID:");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label3 = new JLabel("PRICE:");
        label3.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label4 = new JLabel("QUANTITY:");
        label4.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label5 = new JLabel("");

        pastelPanel.add(label1);
        pastelPanel.add(this.lineProductName);
        pastelPanel.add(label2);
        pastelPanel.add(this.lineId);
        pastelPanel.add(label3);
        pastelPanel.add(this.linePrice);
        pastelPanel.add(label4);
        pastelPanel.add(this.lineQuantity);
        pastelPanel.add(label5);
        pastelPanel.add(this.buttonRegisterProduct);

        this.panelRegisterProduct.add(pastelPanel, BorderLayout.WEST);
        this.panelRegisterProduct.add(gap1, BorderLayout.SOUTH);
        this.panelRegisterProduct.add(gap2, BorderLayout.CENTER);

    }

    public void addProdutoresRurais() throws Exception {
        if (lineId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (linePrice.getText().equals("") || Double.parseDouble(linePrice.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineQuantity.getText().equals("") || Integer.parseInt(lineQuantity.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        }

    }

    private void paintButtonRegisterProduct() {
        this.buttonRegisterProduct.addActionListener(new ButtonRegisterStock(this));
    }

    private void paintTableStock() {
        this.panelTableStock.setLayout(new BorderLayout());

        DefaultTableModel model = (DefaultTableModel) tableStock.getModel();
        model.addColumn("NAME");
        model.addColumn("ID");
        model.addColumn("PRICE");
        model.addColumn("QUANTITY");

        this.tableStock.setModel(model);
        this.tableStock.setVisible(true);
        this.panelTableStock.add(new JScrollPane(this.tableStock), BorderLayout.CENTER);
    }

    private void paintPanelRegister() {
        this.panelRegister.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new GridLayout(20, 1));
        panel1.setPreferredSize(new Dimension(500, 300));

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

        JLabel label13 = new JLabel("EMAIL:");
        label13.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label14 = new JLabel("PASSWORD:");
        label14.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label15 = new JLabel("DDD:");
        label15.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label16 = new JLabel("PHONE NUMBER:");
        label16.setVerticalAlignment(SwingConstants.BOTTOM);

        panel1.add(label1);
        panel1.add(this.lineNumber);
        panel2.add(label2);
        panel2.add(this.lineStreet);

        panel1.add(label3);
        panel1.add(this.lineNeighborhood);
        panel2.add(label4);
        panel2.add(this.lineCep);

        panel1.add(label5);
        panel1.add(this.lineCity);
        panel2.add(label6);
        panel2.add(this.lineState);

        panel1.add(label7);
        panel1.add(this.lineCountry);
        panel2.add(new JLabel(""));
        panel2.add(new JLabel(""));

        panel1.add(label8);
        panel1.add(this.feijao);
        panel2.add(label9);
        panel2.add(this.lineSurname);

        panel1.add(label13);
        panel1.add(this.lineEmail);
        panel2.add(label14);
        panel2.add(this.linePassword);

        panel1.add(label15);
        panel1.add(this.lineDdd);
        panel2.add(label16);
        panel2.add(this.linePhoneNumber);

        panel1.add(new JLabel(""));
        panel1.add(this.buttonRegisterIndividual);
        panel2.add(new JLabel(""));
        panel2.add(this.buttonRegisterLegalEntity);

        this.panelRegister.add(panel1, BorderLayout.WEST);
        this.panelRegister.add(panel2, BorderLayout.CENTER);
        this.panelRegister.add(gap2, BorderLayout.EAST);
    }

    public void addPerson(int num) throws Exception {

        if (lineNumber.getText().equals("") || Integer.parseInt(lineNumber.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineStreet.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineNeighborhood.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineCep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineCity.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineState.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineCountry.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (feijao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineSurname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (linePassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineDdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (linePhoneNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else {
            if (num == 1) {
                DesktopIndividual di = new DesktopIndividual(this);
                di.paintFrame();
            } else if (num == 2) {
                DesktopLegalEntity dl = new DesktopLegalEntity(this);
                dl.paintFrame();
            }
        }
    }

    private void paintButtonRegisterIndividual() {
        this.buttonRegisterIndividual.addActionListener(new ButtonRegisterPerson(this, 1));
    }

    private void paintButtonRegisterLegalEntity() {
        this.buttonRegisterLegalEntity.addActionListener(new ButtonRegisterPerson(this, 2));
    }

    private void paintTableRegister() {
        this.panelTableRegister.setLayout(new BorderLayout());

        DefaultTableModel model = (DefaultTableModel) tableRegister.getModel();
        model.addColumn("NAME");
        model.addColumn("Surname");
        model.addColumn("EMAIL");
        model.addColumn("PHONE NUMBER");

        this.tableRegister.setModel(model);
        this.tableRegister.setVisible(true);
        this.panelTableRegister.add(new JScrollPane(this.tableRegister), BorderLayout.CENTER);
    }

//    private void paintPanelSaleRegister() {
//        this.panelSaleRegister.setLayout(new BorderLayout());
//
//        JPanel panel = new JPanel(new GridLayout(10, 1));
//        panel.setPreferredSize(new Dimension(500, 300));
//
//        JPanel gap1 = new JPanel(new BorderLayout());
//        gap1.setPreferredSize(new Dimension(300, 250));
//
//        JPanel gap2 = new JPanel(new BorderLayout());
//        gap2.setPreferredSize(new Dimension(600, 300));
//
//        JLabel label1 = new JLabel("PRODUTO: ");
//        label1.setVerticalAlignment(SwingConstants.BOTTOM);
//
//        JLabel label2 = new JLabel("ID: ");
//        label2.setVerticalAlignment(SwingConstants.BOTTOM);
//
//        JLabel label3 = new JLabel("QUANTITY: ");
//        label3.setVerticalAlignment(SwingConstants.BOTTOM);
//
////        JLabel label4 = new JLabel("TOTAL:");
////        label4.setVerticalAlignment(SwingConstants.BOTTOM);
//
//        JLabel label5 = new JLabel("");
//
//        panel.add(label1);
//        panel.add(this.lineProductName);
//        panel.add(label2);
//        panel.add(this.lineId);
//        panel.add(label3);
//        panel.add(this.lineQuantity);
////        panel.add(label4);
////        panel.add(this.lineQuantity);
//        panel.add(label5);
//        panel.add(this.buttonRegisterSale);
//
//        this.panelSaleRegister.add(panel, BorderLayout.WEST);
//        this.panelSaleRegister.add(gap1, BorderLayout.SOUTH);
//        this.panelSaleRegister.add(gap2, BorderLayout.CENTER);
//
//    }
//    
//    private void paintButtonSaleRegister(){
//        this.buttonRegisterSale.addActionListener(new ButtonRegisterSale(this));
//    }
    private void paintPanel() {
        paintPanelRegisterProduct();
        paintTableStock();
        paintPanelRegister();
        paintTableRegister();
        //paintPanelSaleRegister();
    }

    private void paintFrame() {
        paintPanel();
        panetone();
        paintButtonRegisterProduct();
        paintButtonRegisterIndividual();
        paintButtonRegisterLegalEntity();
        //paintButtonSaleRegister();

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

    public static RegisterStock getRegisterStock() {
        return émole;
    }

    public static void setRegisterStock(RegisterStock registerStock) {
        JanelaAbas.émole = registerStock;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public JPanel getPanelRegisterProduct() {
        return panelRegisterProduct;
    }

    public void setPanelRegisterProduct(JPanel panelRegisterProduct) {
        this.panelRegisterProduct = panelRegisterProduct;
    }

    public JTextField getLineProductName() {
        return lineProductName;
    }

    public void setLineProductName(JTextField lineProductName) {
        this.lineProductName = lineProductName;
    }

    public JTextField getLineId() {
        return lineId;
    }

    public void setLineId(JTextField lineId) {
        this.lineId = lineId;
    }

    public JTextField getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(JTextField linePrice) {
        this.linePrice = linePrice;
    }

    public JTextField getLineQuantity() {
        return lineQuantity;
    }

    public void setLineQuantity(JTextField lineQuantity) {
        this.lineQuantity = lineQuantity;
    }

    public JButton getButtonRegisterProduct() {
        return buttonRegisterProduct;
    }

    public void setButtonRegisterProduct(JButton buttonRegisterProduct) {
        this.buttonRegisterProduct = buttonRegisterProduct;
    }

    public JPanel getPanelBlue() {
        return panelTableStock;
    }

    public void setPanelBlue(JPanel panelBlue) {
        this.panelTableStock = panelBlue;
    }

    public JPanel getPanelSaleRegister() {
        return panelSaleRegister;
    }

    public void setPanelSaleRegister(JPanel panelSale) {
        this.panelSaleRegister = panelSale;
    }

//    public JPanel getPanelRegisterLegalEntity() {
//        return panelRegisterLegalEntity;
//    }
//
//    public void setPanelRegisterLegalEntity(JPanel panelRegisterLegalEntity) {
//        this.panelRegisterLegalEntity = panelRegisterLegalEntity;
//    }
    public JTextField getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(JTextField lineNumber) {
        this.lineNumber = lineNumber;
    }

    public JTextField getLineStreet() {
        return lineStreet;
    }

    public void setLineStreet(JTextField lineStreet) {
        this.lineStreet = lineStreet;
    }

    public JTextField getLineNeighborhood() {
        return lineNeighborhood;
    }

    public void setLineNeighborhood(JTextField lineNeighborhood) {
        this.lineNeighborhood = lineNeighborhood;
    }

    public JTextField getLineCep() {
        return lineCep;
    }

    public void setLineCep(JTextField lineCep) {
        this.lineCep = lineCep;
    }

    public JTextField getLineCity() {
        return lineCity;
    }

    public void setLineCity(JTextField lineCity) {
        this.lineCity = lineCity;
    }

    public JTextField getLineState() {
        return lineState;
    }

    public void setLineState(JTextField lineState) {
        this.lineState = lineState;
    }

    public JTextField getLineCountry() {
        return lineCountry;
    }

    public void setLineCountry(JTextField lineCountry) {
        this.lineCountry = lineCountry;
    }

    public JTextField getLineEmail() {
        return lineEmail;
    }

    public void setLineEmail(JTextField lineEmail) {
        this.lineEmail = lineEmail;
    }

    public JTextField getLinePassword() {
        return linePassword;
    }

    public void setLinePassword(JTextField linePassword) {
        this.linePassword = linePassword;
    }

    public JTextField getLineDdd() {
        return lineDdd;
    }

    public void setLineDdd(JTextField lineDdd) {
        this.lineDdd = lineDdd;
    }

    public JTextField getLinePhoneNumber() {
        return linePhoneNumber;
    }

    public void setLinePhoneNumber(JTextField linePhoneNumber) {
        this.linePhoneNumber = linePhoneNumber;
    }

    public JTextField getLinePersonName() {
        return feijao;
    }

    public void setLinePersonName(JTextField linePersonName) {
        this.feijao = linePersonName;
    }

    public JTextField getLineSurname() {
        return lineSurname;
    }

    public void setLineSurname(JTextField lineSurname) {
        this.lineSurname = lineSurname;
    }

    public JButton getButtonRegisterIndividual() {
        return buttonRegisterIndividual;
    }

    public void setButtonRegisterIndividual(JButton buttonRegisterIndividual) {
        this.buttonRegisterIndividual = buttonRegisterIndividual;
    }

    public JButton getButtonRegisterLegalEntity() {
        return buttonRegisterLegalEntity;
    }

    public void setButtonRegisterLegalEntity(JButton buttonRegisterLegalEntity) {
        this.buttonRegisterLegalEntity = buttonRegisterLegalEntity;
    }

    public JTable getTableStock() {
        return tableStock;
    }

    public void setTableStock(JTable tableStock) {
        this.tableStock = tableStock;
    }

    public JPanel getPanelTableStock() {
        return panelTableStock;
    }

    public void setPanelTableStock(JPanel panelTableStock) {
        this.panelTableStock = panelTableStock;
    }

    public JPanel getPanelRegister() {
        return panelRegister;
    }

    public void setPanelRegister(JPanel panelRegister) {
        this.panelRegister = panelRegister;
    }

    public JTextField getLineDate() {
        return lineDate;
    }

    public void setLineDate(JTextField lineDate) {
        this.lineDate = lineDate;
    }

    public JTable getTableRegister() {
        return tableRegister;
    }

    public void setTableRegister(JTable tableRegister) {
        this.tableRegister = tableRegister;
    }

    public JPanel getPanelTableRegister() {
        return panelTableRegister;
    }

    public void setPanelTableRegister(JPanel panelTableRegister) {
        this.panelTableRegister = panelTableRegister;
    }

}
