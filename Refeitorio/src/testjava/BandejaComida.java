package testjava;
import java.util.ArrayList;

public class BandejaComida {
    
    private String local;
    private float valorRefeicao, caloriasRefeicao;
    private ArrayList<ItensBandeja> itensBandeja;
    
    public BandejaComida(){}
    
    public BandejaComida(String local, Comida comida, int qntd){
        this.itensBandeja = new ArrayList<>();
        this.caloriasRefeicao = 0;
        this.valorRefeicao = 0;
        this.setLocal(local);
        this.addItem(comida, qntd);
    }
    
    public final void addItem(Comida comida, int qntd){
        this.itensBandeja.add(new ItensBandeja(comida, qntd));
        this.setValorRefeicao(comida, qntd);
        this.setCaloriasRefeicao(comida, qntd);
    }
    
    public final void setLocal(String local){
        this.local = local;
    }
    
    private void setValorRefeicao(Comida comida, int qntd){
        this.valorRefeicao += comida.getValor() * qntd;
    }
    
    private void setCaloriasRefeicao(Comida comida, int qntd){
        this.caloriasRefeicao += comida.getCalorias() * qntd;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public float getValorRefeicao(){
        return this.valorRefeicao;
    }
    
    public float getCaloriasRefeicao(){
        return this.caloriasRefeicao;
    }
    
    public ArrayList<ItensBandeja> getAddItem(){
        return this.itensBandeja;
    }

    @Override
    public String toString() {
        return "\nBandeja Comida\nLocal: " + this.getLocal() + "\nValor da Refeicao: " + this.getValorRefeicao() + "\nCalorias da Refeicao:" + this.getCaloriasRefeicao() + "\n" + this.itensBandeja;
    }
    
    
}
