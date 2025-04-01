package lista1ex3;

public class Produto {
    
    private int id, qntd;
    private String descricao;
    private float preco;
    
    public Produto(){}
    
    public Produto(int id, int qntd, String descricao, float preco){
        this.setId(id);
        this.setQntd(qntd);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }
    
    public void subir(float x){
        if(x > 0){
            this.preco += x;
        }
    }
    
    public void descer(int x){
        if(x < this.getPreco()){
            this.preco -= x;
        }
    }
    
    public void comprar(int x){
        if(x > 0){
            this.qntd += x;
        }
    }
    
    public void vender(int x){
        if(x <= this.getQntd()){
            this.qntd -= x;
        }
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setQntd(int qntd){
        this.qntd = qntd;
    }
    
    public final void setDescricao(String desc){
        this.descricao = desc;
    }
    
    public final void setPreco(float preco){
        this.preco = preco;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getQntd(){
        return this.qntd;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public float getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", qntd=" + qntd + ", descricao=" + descricao + ", preco=" + preco + '}';
    }
    
    
}
