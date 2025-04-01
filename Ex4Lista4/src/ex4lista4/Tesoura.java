package ex4lista4;

public class Tesoura extends Coisa{
    
    @Override
    public void comparar(Coisa c){
        if(c.quemSouEu().equals("Tesoura")){
            System.out.println("Jogo empatado");
        }else if(c.quemSouEu().equals("Pedra")){
            System.out.println("Tesoura perde para Pedra");
        } else {
            System.out.println("Tesoura ganha de ganha de Papel");
        }
    }
    
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }
}
