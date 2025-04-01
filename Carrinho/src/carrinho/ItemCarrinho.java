package carrinho;

public class ItemCarrinho {
   
    private int qntd;
    private Produto produto;
    
    public ItemCarrinho(){}
    
    public ItemCarrinho(int qntd, Produto produto){
        this.setQntd(qntd);
        this.setProduto(produto);
    }
    
    public final void setQntd(int qntd){
        this.qntd = qntd;
    }
    
    public int getQntd(){
        return this.qntd;
    }
    
    public final void setProduto(Produto produto){
        this.produto = produto;
    }
    
   public Produto getProduto(){
       return this.produto;
   }
   
   @Override
   public String toString(){
       return "ITEM CARRINHO\n" + this.getProduto() + "\nQNTD: " + this.getQntd();
   }
}
