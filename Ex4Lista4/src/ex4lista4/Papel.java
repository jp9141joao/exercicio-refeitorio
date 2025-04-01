package ex4lista4;

public class Papel extends Coisa{
    
    @Override
    public void comparar(Coisa c){
        if(c.quemSouEu().equals("Tesoura")){
            System.out.println("Papel perde para tesoura");
        }else if(c.quemSouEu().equals("Pedra")){
            System.out.println("Papel ganha de pedra");
        } else {
            System.out.println("Jogo empatado");
        }
    }
    
    @Override
    public String quemSouEu(){
        return "Papel";
    }
}
