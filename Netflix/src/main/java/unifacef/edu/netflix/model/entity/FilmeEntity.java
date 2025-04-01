package unifacef.edu.netflix.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="filme") 
public class FilmeEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="nota")
    private float nota;
    @Column(name="anoLancamento")
    private int anoLancamento;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="diretor_id")
    private DiretorEntity diretor;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public DiretorEntity getDiretor() {
        return diretor;
    }

    public void setDiretor(DiretorEntity diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "FilmeEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                ", anoLancamento=" + anoLancamento +
                ", diretor=" + diretor +
                '}';
    }
}
