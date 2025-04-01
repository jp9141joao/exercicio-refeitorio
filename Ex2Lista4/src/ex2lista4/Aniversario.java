package ex2lista4;

public class Aniversario extends CartaoWeb{
    
    public Aniversario(){ super(); }
    
    public Aniversario(String dest){
        super(dest);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + " Feliz Aniversario!!!");
    }
}
