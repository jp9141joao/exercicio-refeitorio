package ex4lista4;

public class Pedra extends Coisa{
    
    @Override
    public void comparar(Coisa c){
        if(c.quemSouEu().equals("Tesoura")){
            System.out.println("Papel ganha de pedra");
        }else if(c.quemSouEu().equals("Pedra")){
            System.out.println("Jogo empatado");
        } else {
            System.out.println("Pedra perde para Papel");
        }
    }
    
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
}
