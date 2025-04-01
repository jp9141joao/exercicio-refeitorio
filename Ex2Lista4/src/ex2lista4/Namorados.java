package ex2lista4;

public class Namorados extends CartaoWeb{
    
    public Namorados(){ super(); }
    
    public Namorados(String dest){
        super(dest);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + "FELIZ DIA DOS NAMORADOS!!!");
    }
}
