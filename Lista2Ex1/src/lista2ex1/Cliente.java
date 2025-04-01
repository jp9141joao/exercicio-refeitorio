package lista2ex1;

public class Cliente {
    
    private String nmrConta, nmrAgencia, nome;
    private float saldo; 
    
    public Cliente(){}
    
    public Cliente(String nc, String na, String n, float s){
        this.setNmrConta(nc);
        this.setNmrAgencia(na);
        this.setNome(n);
        this.setSaldo(s);
    }
    
    public final void setNmrConta(String nc){
        if(nc.length() == 8 && nc.charAt(6) == '-'){
            this.nmrConta = nc;
        }
    }
    
    public final void setNmrAgencia(String na){
        if(na.length() == 6 && na.charAt(5) == '-'){
            this.nmrAgencia = na;
        }
    }
    
    public final void setNome(String n){
        this.nome = n;
    }
    
    public final void setSaldo(float s){
        this.saldo = s;
    }
    
}
