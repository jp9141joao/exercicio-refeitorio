package lutar;

public class Lutar{
    
    public static void main(String[] args){
        Lutador l[] = new Lutador[2];
        
        l[0] = new Lutador("Joao Pedro Rosa", "Brasileiro", 19, 14, 4, 5, 1.86f, 97.5f);
        l[1] = new Lutador("Heitor Dutra Vilar", "Brasileiro", 18, 16,5 ,2, 1.7f, 92.2f);
        
        MarcarLutar r1 = new MarcarLutar();
        
        r1.marcarLuta(l[0], l[1]);
        r1.lutar();
        
        System.out.println("\n\n\n");
        
        r1.marcarLuta(l[0], l[1]);
        r1.lutar();
                
    }
}