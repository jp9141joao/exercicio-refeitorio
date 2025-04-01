package ex2lista4;

import java.util.ArrayList;
import java.util.List;

public class Ex2Lista4 {

    public static void main(String[] args) {
        List<CartaoWeb> lista = new ArrayList<CartaoWeb>();
        
        lista.add(new Natal("Joao"));
        lista.add(new Aniversario("Maria"));
        lista.add(new Namorados("Pedro"));
        
        for(CartaoWeb item: lista){
            item.showMessage();
        }
    }
    
}
