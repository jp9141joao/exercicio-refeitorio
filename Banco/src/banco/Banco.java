package banco;

public class Banco{
    public static void main(String[] args){
        Conta_Banco Pessoa1 = new Conta_Banco();
        //Conta_Banco Pessoa2 = new Conta_Banco();
        
        Pessoa1.setDono("Joao Pedro");
        Pessoa1.setNumConta(9141);
        Pessoa1.abrirConta("CC");
        
        Pessoa1.statusConta();
        
        Conta_Banco Pessoa = new Conta_Banco();
        Pessoa.setDono("Maria Julia");
        Pessoa.setNumConta(1405);
        Pessoa.abrirConta("CP");
        Pessoa.depositar(150);
        
        Conta_Banco People = new Conta_Banco();
        People.setDono("Onassis Salles");
        People.setNumConta(1787);
        People.abrirConta("CC");
        People.sacar(10);
        
        Pessoa.statusConta();
    }
}