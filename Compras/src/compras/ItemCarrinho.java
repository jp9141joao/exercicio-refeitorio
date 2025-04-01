package compras;

public class ItemCarrinho{
    
    private int qntd, codigo;
    private float precoTotal;
    private Produto produto;
    
    public ItemCarrinho(int qntd, int codigo, Produto produto){
        this.setQntd(qntd);
        this.setCodigo(codigo, produto);
        //this.setProduto(produto);
    }
    
    

    public int getQntd() {
        return qntd;
    }

    public final void setQntd(int qntd) {
        this.qntd = qntd;
        this.setPrecoTotal();
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    private void setPrecoTotal() {
        this.precoTotal = produto.getPreco() * this.getQntd();
    }

    public Produto getProduto() {
        return this.produto;
    }

    private void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo, Produto produto) {
        this.codigo = codigo;
        if(this.codigo == produto.getCodigo()){
            this.setProduto(produto);
        }else{
            System.out.println("Codigo invalido!!!");
        }
        
    }

    @Override
    public String toString() {
        return "ItemCarrinho: " + ",Qntd: " + this.qntd + ", Preco Total: " + this.precoTotal + ", Produto: " + this.produto + "";
    }
    
    
}
