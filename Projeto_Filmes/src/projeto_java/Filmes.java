package projeto_java;

public class Filmes {
    private String nome;
    private int duracao;
    private int ano;
    private float orcamento;
    
    public Filmes(String nome, int duracao, int ano, float orcamento){
        this.nome = nome;
        this.duracao = duracao;
        this.ano = ano;
        this.orcamento = orcamento; 
    }
    
    private void dadosFilmes(){
        System.out.println("\n\n* Dados do filme *\nNome: " + this.nome);
        System.out.println("Duracao: " + this.duracao + "mn");
        System.out.println("Ano de Lancamento: " + this.ano);
        System.out.println("Orcamento: " + this.orcamento + " milhoes");
    }
    
    public void getDados(){
        this.dadosFilmes();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setOrcamento(float orcamento){
        this.orcamento = orcamento;
    }
}