package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller.ButtonActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class View extends JFrame {
    private JPanel panel;
    private JButton button;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem, menuItem2;
    
    private JTabbedPane fundo;
    private JTabbedPane registro;
    private JTabbedPane stock;
    
    
    public View() {
        this.panel = new JPanel();
        this.button = new JButton("botao");
        this.menuBar = new JMenuBar();
        this.menu = new JMenu("Menu1");
        this.menuItem = new JMenuItem("Stock", KeyEvent.VK_T);
        this.menuItem2 = new JMenuItem("Register", KeyEvent.VK_T);
        
        this.fundo = new JTabbedPane();
        this.registro = new JTabbedPane();
        this.stock = new JTabbedPane();
    }
    
    private void paintTabbedPane(){
        this.fundo.setLayout(new BorderLayout());
        this.fundo.setBackground(Color.white);
        this.fundo.add("STOCK", this.stock);
        this.fundo.add("REGISTRO", this.registro);
    }
    
    private void paintPanel() {
        this.panel.setBackground(Color.gray);
        this.panel.setLayout(new BorderLayout());        
    }
    
    private void paintButton() {
        this.button.addActionListener(new ButtonActionListener(this));
    }
    
    private void paintMenus(){
        this.menuBar.setBackground(Color.yellow);
        this.menu.setBackground(Color.green);
        this.menuItem.setBackground(Color.pink);
        this.menuItem2.setBackground(Color.pink);
        this.menuItem.setBorder(BorderFactory.createLineBorder(Color.black));
        this.menuItem2.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
    private void paintFrame() {
        paintPanel();
        paintButton();
        paintMenus();
        paintTabbedPane();
        this.add(this.panel, BorderLayout.CENTER);
        this.panel.add(this.button, BorderLayout.SOUTH);
        this.menu.add(this.menuItem);
        this.menu.add(this.menuItem2);
        this.menuBar.add(this.menu);
        
        this.setJMenuBar(menuBar);
       
        this.panel.add(this.fundo, BorderLayout.NORTH);
//        
    }
     
    
    public static void main(String[] args) {
        View view = new View();
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setExtendedState(MAXIMIZED_BOTH);
        view.setLayout(new BorderLayout());
        view.setVisible(true);
        
        view.paintFrame();
    }
    
    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}
