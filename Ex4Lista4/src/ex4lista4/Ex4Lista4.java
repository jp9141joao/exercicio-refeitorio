package ex4lista4;

import javax.swing.*;

public class Ex4Lista4 {

    public static void main(String[] args) {
        
        String opt = JOptionPane.showInputDialog("MENU DE OPCOES\n1- PEDRA\n2- PAPEL\n3- TESOURA");
        
        Coisa user = new Pedra();
        
        /*if(opt.equals("1")){
            user = new Pedra();
        }else if(opt.equals("2")){
            user = new Papel();
        }else if(opt.equals("3")){
            user = new Tesoura();
        }else{
            int prob = (int)(Math.random() * 10);
            if(prob >=0 && prob <= 2){
                user = new Pedra();
            }else if(prob >= 3 && prob <= 5){
                user = new Papel();
            }else{
                user = new Tesoura();
            }
        }*/
        
        Coisa bot;
        int prob = (int)(Math.random() * 10);
        if(prob >=0 && prob <= 2){
            bot = new Pedra();
        }else if(prob >= 3 && prob <= 5){
            bot = new Papel();
        }else{
            bot = new Tesoura();
        }
        
        
    }
    
}
