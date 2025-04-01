package ex2lista4;

public class Natal extends CartaoWeb{
 
    public Natal(){ super(); }
    
    public Natal(String dest){
        super(dest);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + " FELIZ NATAL!!!");
    }
    
    
}
