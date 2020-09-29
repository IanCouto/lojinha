package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock.Product;
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.stock.Stock;
import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonRegisterStock;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JanelaAbas extends JFrame {

    private static Stock stock;

    private JTabbedPane tabbedPane;

    private JPanel panelRegisterProduct;

    private JTextField lineProductName;
    private JTextField lineId;
    private JTextField linePrice;
    private JTextField lineQuantity;

    private JButton buttonRegisterProduct;

    private JTable tableStock;

    public JTable getTableStock() {
        return tableStock;
    }

    private JPanel panelTableStock;

    private JPanel panelRegisterIndividual;
    private JPanel panelRegisterLegalEntity;

    //colocar na mesma linha
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
        this.stock = new Stock();

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

        this.panelTableStock = new JPanel();
        this.panelRegisterIndividual = new JPanel();
        this.panelRegisterLegalEntity = new JPanel();

    }

    private void paintTabbedPane() {
        this.tabbedPane.addTab("REGISTER PRODUCT", this.panelRegisterProduct);
        this.tabbedPane.addTab("AZUL", this.panelTableStock);
        this.tabbedPane.addTab("REGISTER INDIVIDUAL", this.panelRegisterIndividual);
        this.tabbedPane.addTab("REGISTER LEGAL ENTITY", this.panelRegisterLegalEntity);
    }

    private void paintPanelRegisterProduct() {
        this.panelRegisterProduct.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(10, 1));
        panel.setPreferredSize(new Dimension(500, 300));

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

    public void addProduct() throws Exception {
        if (lineProductName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (linePrice.getText().equals("") || Double.parseDouble(linePrice.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else if (lineQuantity.getText().equals("") || Integer.parseInt(lineQuantity.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
            throw new Exception();
        } else {
            Product product = new Product(Double.parseDouble(linePrice.getText()), lineProductName.getText(), lineId.getText());
            JanelaAbas.stock.addProduct(product, Integer.parseInt(lineQuantity.getText()));
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
        paintTableStock();
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

    public static Stock getStock() {
        return stock;
    }

    public static void setStock(Stock stock) {
        JanelaAbas.stock = stock;
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

    public JPanel getPanelRegisterIndividual() {
        return panelRegisterIndividual;
    }

    public void setPanelRegisterIndividual(JPanel panelRegisterIndividual) {
        this.panelRegisterIndividual = panelRegisterIndividual;
    }

    public JPanel getPanelRegisterLegalEntity() {
        return panelRegisterLegalEntity;
    }

    public void setPanelRegisterLegalEntity(JPanel panelRegisterLegalEntity) {
        this.panelRegisterLegalEntity = panelRegisterLegalEntity;
    }

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
        return linePersonName;
    }

    public void setLinePersonName(JTextField linePersonName) {
        this.linePersonName = linePersonName;
    }

    public JTextField getLineSurname() {
        return lineSurname;
    }

    public void setLineSurname(JTextField lineSurname) {
        this.lineSurname = lineSurname;
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

    public JTextField getLineBirthYear() {
        return lineBirthYear;
    }

    public void setLineBirthYear(JTextField lineBirthYear) {
        this.lineBirthYear = lineBirthYear;
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

}
