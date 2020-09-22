package br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.register;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ufjf.dcc.gmr.core.chunck.antlr.exemple.lojinha.Register;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onofre
 */

public class RegisterStock {

    private static List<Register> list;

    public RegisterStock() {
        RegisterStock.list = new ArrayList<>();
    }

    public void addRegister(Register register) {
          if(!RegisterStock.this.contain(register)){
              RegisterStock.list.add(register);
          }
          else
              System.out.println("***Existing record***"); 
    }

    public boolean contain(Register register) {
        for(int i = 0; i<RegisterStock.list.size(); i++) {
            if(RegisterStock.list.get(i).getEmail().equals(register.getEmail()))
                return true;
        }
        return false;
    }
}
