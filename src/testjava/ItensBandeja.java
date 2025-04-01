package testjava;

public class ItensBandeja {
    
    private int qntd;
    private float totalCalorias, totalValor;
    private Comida comida;
    
    public ItensBandeja(){}
    
    public ItensBandeja(Comida comida, int qntd){
        this.totalCalorias = 0;
        this.totalValor = 0;
        this.setQntd(qntd);
        this.setComida(comida);
        
        
    }
    
    public final void setQntd(int qntd){
        if(qntd > 0){
            this.qntd = qntd;
            if(this.comida != null){
                this.setTotalCalorias();
                this.setTotalValor();
            }
        }
    }
    
    public final void setComida(Comida comida){
        this.comida = comida;
        this.setTotalCalorias();
        this.setTotalValor();
    }
    
    private void setTotalCalorias(){
        this.totalCalorias = this.comida.getCalorias() * this.qntd;
    }
    
    private void setTotalValor(){
        this.totalValor = this.comida.getValor() * this.qntd;
    }
    
    public int getQntd(){
        return this.qntd;
    }
    
    public Comida getComida(){
        return this.comida;
    }
    
    public float getTotalCalorias(){
        return this.totalCalorias;
    }
    
    public float getTotalValor(){
        return this.totalValor;
    }
    
    @Override
    public String toString(){
        return "\nItem Bandeja\nComida: " + this.getComida() + 
               "\nQntd: " + this.getQntd() + 
               "\nTotal calorias: " + this.getTotalCalorias() + 
               "\nValor total: " + this.getTotalValor() + "\n";
    }
}
