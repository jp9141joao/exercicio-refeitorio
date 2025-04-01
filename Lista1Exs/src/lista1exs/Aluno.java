package lista1exs;

public class Aluno {
    
    private int nmrAluno, idade;
    private String nome;
    private float p1, p2;
    
    public Aluno(){}
    
    public Aluno(int nmrAluno, int idade, String nome, float p1, float p2){
        this.setNmrAluno(nmrAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void passou(){
        if(this.notaFinal() > 6){
            System.out.println("O aluno passou!!!");
        }else{
            System.out.println("O aluno não passou!!!");
        }
    }
    
    public void dadosAluno(){
        System.out.println("\nDADOS DO ALUNO\nNOME: " + this.getNome() + "\nIDADE: " + this.getIdade() + "NUMERO DO ALUNO: " + this.getNmrAluno() + "\nP1: " + this.getP1() + "P2: " + this.getP2());
    }
    
    public float notaFinal(){
        return (this.getP1() + this.getP2()) / 2;
    }
    
    public final void setNmrAluno(int nmr){
        this.nmrAluno = nmr;
    }
    
    public final void setIdade(int idade){
        this.idade = idade;
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public final void setP1(float p1){
        if(p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        }else{
            System.out.println("Nota p1 invalida!!!");
        }
    }
    
    public final void setP2(float p2){
        if(p2 >= 0 && p2 <= 10){
            this.p2 = p2;
        }else{
            System.out.println("Nota p2 invalida!!!");
        }
    }
    
   public int getNmrAluno(){
       return this.nmrAluno;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public int getIdade(){
       return this.idade;
   }
   
   public float getP1(){
       return this.p1;
   }
   
   public float getP2(){
       return this.p2;
   }

    @Override
    public String toString() {
        return "Aluno{" + "nmrAluno=" + nmrAluno + ", idade=" + idade + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + '}';
    }
}
