package br.ufjf.dcc.gmr.core.chunks.antlr.exemple.controller;

import br.ufjf.dcc.gmr.core.chunks.antlr.exemple.view.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
    
    private View view;
    
    public ButtonActionListener(View view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(view.getPanel().getBackground() == Color.red) {
            view.getPanel().setBackground(Color.blue);
        }
        else {
            view.getPanel().setBackground(Color.red);
        }
    }
    
}
