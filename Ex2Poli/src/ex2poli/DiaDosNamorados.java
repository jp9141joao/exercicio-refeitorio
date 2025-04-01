package ex2poli;

public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(){ super(); }
    
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
        System.out.println(this.getDestinatario() + "Feliz dia dos namorados!!!");
    }
}
