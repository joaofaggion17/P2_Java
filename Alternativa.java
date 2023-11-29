package application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alternativa")
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String texto;

    @Column(nullable = false)
    private boolean correta;

    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String gettexto() {
        return texto;
    }

    public void settexto(String texto) {
        texto = texto;
    }

    public boolean correta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

}
