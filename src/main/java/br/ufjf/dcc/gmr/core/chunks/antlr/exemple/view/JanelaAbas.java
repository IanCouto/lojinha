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
    private JPanel panelRed;
    private JPanel panelBlue;
    private JPanel panelYellow;
    private JPanel panelBlack;

    public JanelaAbas() {
        this.tabbedPane = new JTabbedPane();
        this.panelRed = new JPanel();
        this.panelBlue = new JPanel();
        this.panelYellow = new JPanel();
        this.panelBlack = new JPanel();
    }

    private void paintTabbedPane() {
        this.tabbedPane.addTab("VERMELHO", this.panelRed);
        this.tabbedPane.addTab("AZUL", this.panelBlue);
        this.tabbedPane.addTab("AMARELO", this.panelYellow);
        this.tabbedPane.addTab("PRETO", this.panelBlack);
    }

    private void paintPanelRed() {
        this.panelRed.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.setPreferredSize(new Dimension(500, 300));

        JPanel gap1 = new JPanel(new BorderLayout());
        gap1.setPreferredSize(new Dimension(300, 300));

        JPanel gap2 = new JPanel(new BorderLayout());
        gap2.setPreferredSize(new Dimension(600, 300));

        JLabel label1 = new JLabel("LABEL1:");
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JTextField linha1 = new JTextField(20);
        linha1.setText("DA PRA ESCREVER");
        //linha1.setHorizontalAlignment(JTextField.CENTER);
        linha1.setPreferredSize(new Dimension(500, 50));
            
        JLabel label2 = new JLabel("LABEL2");
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JTextField linha2 = new JTextField(20);
        linha2.setText("2222222222");
        //linha2.setHorizontalAlignment(JTextField.CENTER);
        linha2.setPreferredSize(new Dimension(500, 50));


        JLabel label3 = new JLabel("LABEL3:");
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        
        JTextField linha3 = new JTextField(20);
        linha3.setText("33333333333333333333");
        //linha3.setHorizontalAlignment(JTextField.CENTER);
        linha3.setPreferredSize(new Dimension(500, 50));


        panel.add(label1);
        panel.add(linha1);
        panel.add(label2);
        panel.add(linha2);
        panel.add(label3);
        panel.add(linha3);

        this.panelRed.add(panel, BorderLayout.WEST);
        this.panelRed.add(gap1, BorderLayout.SOUTH);
        this.panelRed.add(gap2, BorderLayout.CENTER);

    }

    private void paintPanelBlue() {
        this.panelBlue.setBackground(Color.blue);
        this.panelBlue.setLayout(new BorderLayout());
    }

    private void paintPanelYellow() {
        this.panelYellow.setBackground(Color.yellow);
        this.panelYellow.setLayout(new BorderLayout());
    }

    private void paintPanelBlack() {
        this.panelBlack.setBackground(Color.black);
        this.panelBlack.setLayout(new BorderLayout());
    }

    private void paintPanel() {
        paintPanelRed();
        paintPanelBlue();
        paintPanelYellow();
        paintPanelBlack();
    }

    private void paintFrame() {
        paintPanel();
        paintTabbedPane();

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
