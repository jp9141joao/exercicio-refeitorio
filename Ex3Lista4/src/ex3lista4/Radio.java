package ex3lista4;

public class Radio extends Produto{
    
    private float estacao;
    private String banda;
    
    public Radio(){ super(); }
    
    public Radio(int serialNumber, int volume, float estacao, String banda){
        super(serialNumber, volume);
        this.trocarEstacao(estacao);
        this.trocarBanda(banda);
    }
    
    public String Escutar(){
        return "Tocando a radio: " + this.getEstacao() + " FM";
    }
    
    public final void trocarEstacao(float estacao){
        this.estacao = estacao;
    }
    
    public final void trocarBanda(String banda){
        this.banda = banda;
    }
    
    public float getEstacao(){
        return this.estacao;
    }
    
    public String getBanda(){
        return this.banda;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRadio\nEstacao: " + this.getEstacao() + "\nBanda: " + this.getBanda();
    }
}
