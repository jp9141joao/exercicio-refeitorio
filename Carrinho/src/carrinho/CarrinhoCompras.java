package carrinho;

public class CarrinhoCompras {
    
    private int id;
    
    public CarrinhoCompras(){}
    
    public CarrinhoCompras(int id){
        this.setId(id);
    }
    
    public final void adicionarItem(){
        
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    
}
