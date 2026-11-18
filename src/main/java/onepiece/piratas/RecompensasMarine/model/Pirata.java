package onepiece.piratas.RecompensasMarine.model;

import jakarta.persistence.*;

// Classe para criar "Objeto"

@Entity // Marcando classe como uma entidade para o Spring reconhecer
@Table(name = "pirata_table")
public class Pirata {

    //Marcando o primeiro atributo para o Spring entender o comportamento.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String poder;
    private Integer Recompensa;
    private Byte idade;

    public Pirata(Long id, String name, String poder, Integer recompensa, Byte idade) {
        this.id = id;
        this.name = name;
        this.poder = poder;
        Recompensa = recompensa;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public Integer getRecompensa() {
        return Recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        Recompensa = recompensa;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }
}

