package ex2poli;

public class Aniversario extends CartaoWeb{
    
    public Aniversario(){ super(); }
    
    public Aniversario(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + " Feliz aniversario!!!");
    }
}
