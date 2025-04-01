package ex2;

public final class Aluno {
    private String nome;
    private int idade, nmrAluno;
    private float p1, p2;

    public Aluno(String nome, int idade, int nmrAluno, float p1, float p2) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNmrAluno(nmrAluno);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void dadosAluno(){
        System.out.println("-------------\nDados do aluno");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Numero aluno: " + this.getNmrAluno());
        System.out.println("P1: " + this.getP1());
        System.out.println("P2: " + this.getP2());
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }else{
            System.out.println("Nome invalido!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
           this.idade = idade; 
        }else{
            System.out.println("Idade invalida!");
        } 
    }

    public int getNmrAluno() {
        return nmrAluno;
    }

    public void setNmrAluno(int nmrAluno) {
        if(nmrAluno >= 100000 && nmrAluno <= 999999){
            this.nmrAluno = nmrAluno;
        }else{
            System.out.println("Codigo invalido!");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 > 0 && p1 <= 10){
            this.p1 = p1;
        }else{
            System.out.println("Nota P1 invalida!");
        }
        
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 > 0 && p2 <= 10){
            this.p2 = p2;
        }else{
            System.out.println("Nota P2 invalida!");
        }
    }
    
    
}
