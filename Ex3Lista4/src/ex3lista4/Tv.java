package ex3lista4;

public class Tv extends Produto{
    
    private String canal;
    
    public Tv(){ super(); }
    
    public Tv(int serialNumber, int volume, String canal){
        super(serialNumber, volume);
        this.trocarCanal(canal);
    }
    
    public String Assistir(){
        return this.canal;
    }
    
    public final void trocarCanal(String c){
        this.canal = c;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTV\nCanal: " + this.canal;
    }
}
