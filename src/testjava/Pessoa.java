package testjava;

public abstract class Pessoa {
    
    private int idade;
    private String nome, sobrenome, cpf, rg;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String sobrenome, int idade, String cpf, String rg){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setRg(rg);
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public final void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nSobrenome: " + this.getSobrenome() + "\nIdade: " + this.getIdade() + "\nCpf: " + this.getCpf() + "\nRg: " + this.getRg();
    }
    
    
}
