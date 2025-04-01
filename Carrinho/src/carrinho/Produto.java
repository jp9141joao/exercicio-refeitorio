package carrinho;

public class Produto {
    
    private String nome;
    private float preco;
    
    public Produto(){}
    
    public Produto(String nome, float preco){
        this.setNome(nome);
        this.setPreco(preco);
    }
    
    public final void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public final void setPreco(float p){
        this.preco = p;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    @Override
    public String toString(){
        return "PRODUTO\nNOME: " + this.getNome() + "\nPRECO: " + this.getPreco();
    }
    
}
