package ex2poli;

public abstract class CartaoWeb {
    
    protected String destinatario;
    
    public CartaoWeb(){}
    
    public CartaoWeb(String destinatario){
        this.setDestinatario(destinatario);
    }
    
    public abstract void showMessage();
    
    public final void setDestinatario(String destinatario){
        this.destinatario = destinatario; 
    }
    
    public String getDestinatario(){
        return this.destinatario;
    }
}
