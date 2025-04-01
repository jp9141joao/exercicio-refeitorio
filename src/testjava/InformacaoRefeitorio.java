package testjava;

public class InformacaoRefeitorio {

    private Pessoa pessoa;
    private BandejaComida banCom;
    
    public InformacaoRefeitorio(){}

    public InformacaoRefeitorio(Pessoa pessoa, BandejaComida banCom) {
        this.pessoa = pessoa;
        this.banCom = banCom;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public BandejaComida getBanCom() {
        return this.banCom;
    }

    public void setBanCom(BandejaComida banCom) {
        this.banCom = banCom;
    }
    
    @Override
    public String toString() {
        return "\n* PESSOA *" + this.getPessoa() + "\n* Refeicao *" + this.getBanCom() + '}';
    }
    
    
}
