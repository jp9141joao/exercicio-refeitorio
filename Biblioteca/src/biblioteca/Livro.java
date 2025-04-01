package biblioteca;

public class Livro implements Publicacao{
    
    private Pessoa leitor;
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public Livro(Pessoa leitor, String titulo, String autor, int totPaginas) {
        this.leitor = leitor;
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public void detalhes(){
        System.out.println("--------------\nDados\nTitulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        if(this.isAberto()){
            System.out.println("Aberto: Sim");
        }else{
            System.out.println("Aberto: Não");
        }
        System.out.println("Nome do leitor: " + this.leitor.getNome());
        System.out.println("Idade do leitor: " + this.leitor.getIdade());
        System.out.println("Sexo do leitor: " + this.leitor.getSexo());
    }
    
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        if(this.isAberto()){
            System.out.println("O livro já está aberto!");
        }else{
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        }else{
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void folhear() {
        if(this.getTotPaginas() >= this.getPagAtual()){
            System.out.println("Não é possivel folhear mais pois o livro não possui mais paginas!");
        }else{
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void desfolhear() {
        if(this.getPagAtual() <= 0){
            System.out.println("Não é possivel desvolhear mais pois o livro não possui mais paginas!");
        }else{
            this.setPagAtual(pagAtual);
        }
    }  
}
