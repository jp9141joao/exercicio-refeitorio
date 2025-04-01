package testjava;

public class Gestor extends Pessoa{

    private int tempoEmpresa, numeroFuncionarios, acoes;
    private float salario, bonus;
    private String departamento;
    
    public Gestor(){}
    
    public Gestor(int tempoEmpresa, int numeroFuncionarios, float salario, int acoes, float bonus, String departamento, String nome, String sobrenome, int idade, String cpf, String rg){
        super(nome, sobrenome, idade, cpf, rg);
        this.setTempoEmpresa(tempoEmpresa);
        this.setNumeroFuncionarios(numeroFuncionarios);
        this.setSalario(salario);
        this.setAcoes(acoes);
        this.setBonus(bonus);
        this.setDepartamento(departamento);
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public final void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public final void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAcoes() {
        return acoes;
    }

    public final void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public final void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString(){
        return "\nDados Gestor\n" + super.toString() + 
                "\nTempo de empresa: " + this.getTempoEmpresa() + 
                "\nNumero de funcionarios: " + this.getNumeroFuncionarios() + 
                "\nSalario: " + this.getSalario() + 
                "\nAcoes: " + this.getAcoes() +
                "\nBonus: " + this.getBonus() +
                "\nDepartamento: " + this.getDepartamento();
    }
}
