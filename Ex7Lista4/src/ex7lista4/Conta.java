package ex7lista4;

public class Conta {
    
    private String nomeCliente;
    private float salarioCliente, saldoCliente, limiteCliente;
    private int nmrCliente;
    
    public Conta(){}
    
    public Conta(String nomeCliente, float salarioCliente, int nmrCliente, float saldoCliente, float limiteCliente){
        this.setNomeCliente(nomeCliente);
        this.setSalarioCliente(salarioCliente);
        this.setNmrCliente(nmrCliente);
        this.setSaldoCliente(saldoCliente);
        this.setLimiteCliente(limiteCliente);
    }
    
    public void deposito(float d){
        this.saldoCliente += d;
    }
    
    public boolean retira(float d){
        if(d <= (this.saldo() * 3)){
            this.saldoCliente -= d;
            return true;
        }else{
            System.out.println("Saldo Indisponivel");
            return false;
        }
    }
    
    public final void setNomeCliente(String nc){
        this.nomeCliente = nc;
    }
    
    public final void setSalarioCliente(float sc){
        this.salarioCliente = sc;
    }
    
    public final void setNmrCliente(int nc){
        this.nmrCliente = nc;
    }
    
    public final void setSaldoCliente(float sc){
        this.salarioCliente = sc;
    }
    
    public final void setLimiteCliente(float lc){
        if(lc <= this.getSalarioCliente() && lc >= 0){
            this.limiteCliente = lc;
        }
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public float getSalarioCliente(){
        return this.salarioCliente;
    }
    
    public int getNmrCliente(){
        return this.nmrCliente;
    } 
    
    public float saldo(){
        return this.salarioCliente;
    }
    
    public float getLimiteCliente(){
        return this.limiteCliente;
    }
    
    @Override
    public String toString(){
        return "\nCONTA BANCO\nNOME: " + this.getNomeCliente() + "\nSALARIO: " + this.getSalarioCliente() + "\nSALDO: " + this.saldo() + "\nLIMITE: " + this.getLimiteCliente() + "\nNUMERO CONTA: " + this.getNmrCliente();
    }
}
