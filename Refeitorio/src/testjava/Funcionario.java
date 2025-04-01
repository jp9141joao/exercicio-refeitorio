package testjava;

public class Funcionario extends Pessoa{
    
    private int tempoEmpresa;
    private float salario, plr;
    private String departamento;
   
    public Funcionario(){
        super();
    }

    public Funcionario(int tempoEmpresa, float salario, float plr, String departamento, String nome, String sobrenome, int idade, String cpf, String rg) {
        super(nome, sobrenome, idade, cpf, rg);
        this.tempoEmpresa = tempoEmpresa;
        this.salario = salario;
        this.plr = plr;
        this.departamento = departamento;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPlr() {
        return plr;
    }

    public void setPlr(float plr) {
        this.plr = plr;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "\nDados Funcionario\n" + super.toString() + "Tempo de empresa" + this.getTempoEmpresa() + "\nSalario: " + salario + "\nPlr: " + this.getPlr() + "\nDepartamento: " + this.getDepartamento();
    }

    
}
