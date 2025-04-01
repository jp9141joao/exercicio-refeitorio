package projetopessoa;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    
    public Aluno(int matricula, String curso){
        this.setMatricula(matricula);
        this.setCurso(curso);
    }
    
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!!!");
    }
    
    public final void setMatricula(int m){
        if(m >= 10000 && m <= 99999){
            this.matricula = m;
        }else{
            System.out.println("Matricula invalida!!!");
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public final void setCurso(String c){
        this.curso = c;
    }
    
    public String getCurso(){
        return this.curso;
    }
}
