package compras;

public class CarrinhoCompras {
    
    private int codigo;
    private float valorCompra;
    private ItemCarrinho itemC;
    
    
    public CarrinhoCompras(int codigo, ItemCarrinho itemC) {
        this.setCodigo(codigo, itemC);
        this.itemC = 0
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo, ItemCarrinho itemC) {
        this.codigo = codigo;
        if(this.codigo == itemC.getCodigo()){
            ItemCarrinho ic1 = new ItemCarrinho(codigo, );
            
        }
    }
    
    
    
}
