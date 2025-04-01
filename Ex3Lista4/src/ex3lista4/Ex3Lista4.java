package ex3lista4;

public class Ex3Lista4 {

    public static void main(String[] args) {
        
        Radio r1 = new Radio(12345, 20, 93.4f, "Imagine Dragons");
        Tv t1 = new Tv(54321, 64, "SBT");
        
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        
        r1.testaUnidade();
        r1.Escutar();
        r1.trocarEstacao(43.f);
        
        t1.testaUnidade();
        t1.trocarCanal("Record");
        
        System.out.println(r1.toString());
        System.out.println(t1.toString());
    }
    
}
