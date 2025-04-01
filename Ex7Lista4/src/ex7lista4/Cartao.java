package ex7lista4;

public class Cartao {
    
    private Conta pessoa;
    private int senha;
    
    public Cartao(){}
    
    public Cartao(Conta p, int s){
        this.setPessoa(p);
        this.setSenha(s);
    }
    
    public void depositar(int s,float d){
        if(s == this.getSenha()){
            this.pessoa.deposito(d);
        }else{
            System.out.println("Senha errada para realizar o deposito");
        }
    }
    
    public void retirar(float r){
        if(r == this.getSenha()){
            this.pessoa.retira(r);
        }else{
            System.out.println("Senha errada para realizar a retirada");
        }
    }
    
    public void alterarSenha(int sv, int sn){
        if(sv == this.getSenha()){
            this.setSenha(sn);
        }else{
            System.out.println("Senha errado para alterar a senha");
        }
    }
    
    public final void setPessoa(Conta p){
        this.pessoa = p;
    }
    
    public final void setSenha(int s){
        this.senha = s;
    }
    
    public Conta getPessoa(){
        return this.pessoa;
    }
    
    public int getSenha(){
        return this.senha;
    }
}
