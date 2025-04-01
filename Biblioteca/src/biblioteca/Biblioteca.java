package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Joao Pedro Rosa de Paula", "Masculino", 19);
        p[1] = new Pessoa("Maria julia Rosa de Paula", "Feminino", 22);
        
        l[0] = new Livro(p[0], "Game of thrones", "Jeorge M", 956);
        l[1] = new Livro(p[1], "Divergente", "Desconhecido", 503);
        
        l[0].detalhes();
    }
    
}
