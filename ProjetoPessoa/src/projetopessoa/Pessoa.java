package projetopessoa;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    
    public void setNome(String n){
        if(n.length() <= 30){
            this.nome = n;
            System.out.println("Nome alterado com sucesso1!!");
        }else{
            System.out.println("Nome invalido!!!");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSexo(String s){
        if((s.equals("Masculino") || s.equals("Feminino")) && (!this.getSexo().equals(s))){
            this.sexo = s;
            System.out.println("Sexo alterado com sucesso!!!");
        }else{
            System.out.println("Sexo invalido!!!");
        }
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setIdade(int i){
        if(i >= 0 && i <= 130){
            this.idade = i;
            System.out.println("Idade alterada com sucesso!!!");
        }else{
            System.out.println("Idade invalida!!!");
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
}
