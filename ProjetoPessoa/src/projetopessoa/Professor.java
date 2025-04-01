package projetopessoa;

public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float a){
        this.setSalario(this.getSalario() + a);
        System.out.println("Aumento recebido com sucesso!!!");
    }
    
    public void setEspecialidade(String s){
        this.especialidade = s;
        System.out.println("Especialidade alterada com sucesso!!!");
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public void setSalario(float s){
        if(s > 0){
            this.salario = s;
            System.out.println("Salario alterado com sucesso!!!");
        }else{
            System.out.println("Salario invalido!!!");
        }
    }
    
    public float getSalario(){
        return this.salario;
    }
}
