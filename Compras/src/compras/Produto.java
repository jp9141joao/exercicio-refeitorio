package compras;

public class Produto{
    
    private String nome, descricao;
    private int codigo;
    private float preco;
    
    public Produto(String nome, String descricao, int codigo, float preco){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCodigo(codigo);
        this.setPreco(preco);
    }
    
    public final void setNome(String n){
        if(n.length() <= 30){
            this.nome = n;
        }else{
            System.out.println("Nome invalido!!!");
        }
    }
    
    public final void setDescricao(String d){
        if(d.length() <= 50){
            this.descricao = d;
        }
    }
    
    public final void setCodigo(int c){
        if(c >= 1000 && c <= 9999){
            this.codigo = c;
        }else{
            System.out.println("Codigo invalido!!!");
        }
    }
    
    public final void setPreco(float p){
        if(p > 0){
            this.preco = p;
        }else{
            System.out.println("Preco invalido!!!");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public float getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "Dados produto" + ", Nome: " + this.nome + ", Descricao: " + this.descricao + ", Codigo: " + this.codigo + ", Preco: " + this.preco + " ";
    }
    
    
    
}
