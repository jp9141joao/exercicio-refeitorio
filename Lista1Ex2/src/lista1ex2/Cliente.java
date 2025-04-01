package lista1ex2;

public class Cliente {

    private int nmrConta, nmrAgencia;
    private String nome;
    private float saldo;
    
    public Cliente(){}
    
    public Cliente(int nmrConta, int nmrAgencia, String nome, float saldo){
        this.setNmrConta(nmrConta);
        this.setNmrAgencia(nmrAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void realizarDeposito(float d){
        if(d > 0){
            this.saldo += d;
        }else{
            System.out.println("Valor de deposito invalido!!!");
        }
    }
    
    public void realizarSaque(float s){
        if(s > 0 && s <= this.getSaldo()){
            this.saldo -= s;
        }else{
            System.out.println("Valor de saque invalido!!!");
        }
    }
    
    public final void setNmrConta(int nmrConta){
        this.nmrConta = nmrConta;
    }
    
    public final void setNmrAgencia(int nmrAgencia){
        this.nmrAgencia = nmrAgencia;
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public final void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public int getNmrConta(){
        return this.nmrConta;
    }
    
    public int getNmrAgencia(){
        return this.nmrAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nmrConta=" + nmrConta + ", nmrAgencia=" + nmrAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}
