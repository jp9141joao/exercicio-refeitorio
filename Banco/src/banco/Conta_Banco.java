package banco;

class Conta_Banco{
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public Conta_Banco(){
        this.saldo = 0;
        this.status = false;
    }
    
    public void statusConta(){
        System.out.println("\n\n* Dados da conta *\nDono: " + this.getDono());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if("CC".equals(t)){
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("\nConta criada com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("\nConta não pode ser excluida pois ainda possui saldo!");
        }else if(this.getSaldo() < 0){
            System.out.println("\nConta não pode ser excluida pois possui divida!");
        }else{
            this.setStatus(false);
        }
        System.out.println("\nConta criada com sucesso!");
    }
    
    public void depositar(float deposito){
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("\nDeposito foi realizado na conta de " + this.getDono());
        } else{
            System.out.println("\nNão é possivel realizar o deposito pois a conta esta desativada");
        }
    }
    
    public void sacar(float saque){
        if(this.getStatus() == true){
            if(this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("\nSaque foi realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("\nSaldo insuficiente para realizar o saque");
            }
            
        }else{
            System.out.println("\nNão é possivel realizar o saque pois a conta esta desativada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("\nMensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("\nNão é possivel pagar a mensalida de uma conta desativada!");
        }
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
         this.status = status;
    }
    
}