package ex2;

public class Cliente {
    
    int nmrConta, nmrAgencia;
    float saldo;
    String nome;

    public Cliente(int nmrConta, int nmrAgencia, float saldo, String nome) {
        this.nmrConta = nmrConta;
        this.nmrAgencia = nmrAgencia;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void verDados(){
        System.out.println("--------------\nDados\nNome: " + this.nome + "\nNumero da Conta: " + this.nmrConta + "\nNumero da Agencia: " + this.nmrAgencia + "\nSaldo: " + this.saldo);
    }
     
    public void realizarDeposito(float d){
        this.saldo = this.saldo + d;
    }

    public void realizarSaque(float s){
        this.saldo = this.saldo - s;
    }
}
