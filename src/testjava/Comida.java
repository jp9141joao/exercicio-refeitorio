package testjava;

public class Comida {
    
    private String nome, tipo;
    private float valor, calorias;
    
    public Comida(){}
    
    public Comida(String nome, String tipo, float valor, float calorias){
        this.setNome(nome);
        this.setTipo(tipo);
        this.setValor(valor);
        this.setCalorias(calorias);
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public final void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public final void setValor(float valor){
        if(valor > 0){
            this.valor = valor;
        }
    }
    
    public final void setCalorias(float calorias){
        if(calorias > 0){
           this.calorias = calorias; 
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public float getCalorias(){
        return this.calorias;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + " Tipo: " + this.getTipo() + " Valor: " + this.getValor() + " Calorias: " + this.getCalorias();
    }
}


