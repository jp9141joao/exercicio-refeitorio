package ex2poli;

public class Natal extends CartaoWeb{
    
    public Natal(){ super(); }
    
    public Natal(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + " Feliz natal!!!");
    }
}
