package ex3lista4;

public abstract class Produto {
    
    protected int serialNumber, volume;
    protected String status;
    
    public Produto(){}
    
    public Produto(int serialNumber, int volume){
        this.setSerialNumber(serialNumber);
        this.setVolume(volume);
        this.setStatus("Não testado");
    }
    
    public final void setSerialNumber(int sn){
        this.serialNumber = sn;
    }
    
    public final void setVolume(int v){
        this.volume = v;
    }
    
    public final void setStatus(String s){
        this.status = s;
    }
        
    public boolean testaUnidade(){
        if(this.status.equals("Aprovado!!!")){
            System.out.println("O produto já foi testado!!!");
            return this.status.equals("Aprovado!!!");
        }else if(this.status.equals("Reprovado!!!")){
            System.out.println("O produto já foi testado!!!");
            return this.status.equals("Reprovado!!!");
        }else{
            System.out.println("Produto testado com sucesso!!!");
            int prob = (int) (Math.random() * 10);
            if(prob != 9){
                System.out.println("Produto Aprovado!!!");
                this.setStatus("Aprovado!!!");
                return true;
            }else{
                System.out.println("Produto Não Aprovado!!!");
                this.setStatus("Reprovado!!!");
                return false;
            } 
        }
    }
    
    public int getSerialNumber(){
        return this.serialNumber;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public String getStatus(){
        return this.status;
    }

    @Override
    public String toString(){
        return "SN: " + this.getSerialNumber() + "\nVolume: " + this.getVolume() + "\nStatus: " + this.getStatus();
    }
}
