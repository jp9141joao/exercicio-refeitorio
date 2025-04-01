package ex1;

public final class Cliente {
    private String nmrConta, nmrAgencia, nome;
    private float saldo;

    public Cliente(String nmrConta, String nmrAgencia, String nome, float saldo) {
        this.setNmrConta(nmrConta);
        this.setNmrAgencia(nmrAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void verDados(){
        System.out.println("------------------\nDados da conta");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Numero da conta: " + this.getNmrConta());
        System.out.println("Numero da agencia: " + this.getNmrAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public void realizarDeposito(float d){
        if(d > 0){
            this.setSaldo(this.getSaldo() + d);
        }else{
            System.out.println("Valor de deposito invalido!");
        }
    }
    
    public void realizarSaque(float s){
        if(s <= this.saldo){
            this.setSaldo(this.getSaldo() - s);
        }else{
            System.out.println("Valor de saque invalido!");
        }
    }
    
    public String getNmrConta() {
        return nmrConta;
    }

    public void setNmrConta(String nmrConta) {
        if(nmrConta.length() == 8){
            this.nmrConta = nmrConta;
            System.out.println("Numero de conta alterado com sucesso!");
        }else{
            System.out.println("Numero de conta invalido!");
        }
    }

    public String getNmrAgencia() {
        return nmrAgencia;
    }

    public void setNmrAgencia(String nmrAgencia) {
        if(nmrAgencia.length() == 6){
            this.nmrAgencia = nmrAgencia;
            System.out.println("Numero de agencia alterado com sucesso!");
        }else{
            System.out.println("Numero de agencia invalido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() >= 3 && nome.length() <= 30){
            this.nome = nome;
            System.out.println("Nome alterado com sucesso!");
        }else{
            System.out.println("Nome invalido!");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0){
            System.out.println("Saldo invalido!");
        }else{
           this.saldo = saldo; 
        }
        
    }
    
    
}
