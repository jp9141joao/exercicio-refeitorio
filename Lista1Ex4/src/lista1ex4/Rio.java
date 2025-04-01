package lista1ex4;

public class Rio {
    
    private String nome;
    private float nivel;
    private boolean poluido;
    
    public Rio(){}
    
    public Rio(String nome, float nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);
    }
    
    public void limpar(){
        if(this.getPoluido() == true){
            this.poluido = false;
        }
    }
    
    public void sujar(){
        if(this.getPoluido() == false){
            this.poluido = true;
        }
    }
    
    public void chover(float x){
        if(x > 0){
            this.nivel += x;
        }
    }
    
    public void ensolarar(float x){
        if(x <= this.getNivel()){
            this.nivel -= x;
        }
    }
    
    public final void setNome(String nome){
        this.nome = nome;
    }
    
    public final void setNivel(float nivel){
        this.nivel = nivel;
    }
    
    public final void setPoluido(boolean poluido){
        this.poluido = poluido;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getNivel(){
        return this.nivel;
    }
    
    public boolean getPoluido(){
        return this.poluido;
    }

    @Override
    public String toString() {
        return "Rio{" + "nome=" + nome + ", nivel=" + nivel + ", poluido=" + poluido + '}';
    }
    
}
