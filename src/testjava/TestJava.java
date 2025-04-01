package testjava;

class TestJava {
    
    public static void main(String[] args){
        
        Gestor g1 = new Gestor( 4, 12, 4500f, 122,2000f, "TI", "Joao Pedro", "Rosa de Paula", 19, "44987985896", "560374689");
        Funcionario f1 = new Funcionario( 1, 1.700f, 450f, "Call Center", "Maria Fernanda", "Francelino", 21, "27816637861", "589371249");
        
        Comida c1 = new Comida("Frango","Saudavel", 23f, 145f);
        Comida c2 = new Comida("Salgado", "Nao saudavel", 5.5f, 432f);
        
        
        
        BandejaComida cm1 = new BandejaComida("Externo", c1, 20);
        cm1.addItem(c2,50);
        
        BandejaComida cm2 = new BandejaComida("Interno", c2, 30);
        
        InformacaoRefeitorio r1 = new InformacaoRefeitorio(g1, cm1);
        InformacaoRefeitorio r2 = new InformacaoRefeitorio(f1, cm2);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        
        
    }
}